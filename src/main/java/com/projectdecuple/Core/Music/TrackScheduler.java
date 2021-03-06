package com.projectdecuple.Core.Music;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.event.AudioEventAdapter;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackEndReason;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TrackScheduler extends AudioEventAdapter {
    private boolean repeating = false;

    public final AudioPlayer pl;
    public final Queue<AudioInfo> queue;
    public TextChannel tc = null;
    // private Map<String, GuildMusicManager> musicManagers;

    AudioTrack lastTrack;

    public TrackScheduler(AudioPlayer pl) {
        this.pl = pl;
        this.queue = new LinkedBlockingQueue<>();
    }

    public void queue(AudioTrack track, Member author, TextChannel tc) {
        AudioInfo info = new AudioInfo(track, author, tc);
        this.tc = tc;

        if (!pl.startTrack(track, true)) {
            queue.add(info);
        }
    }

    @Override
    public void onTrackStart(AudioPlayer pl, AudioTrack track) {

        /*

        WriteFile w = new WriteFile();

        File serverDirectory = new File("D:/Database/Servers/" + tc.getGuild().getId() + "/");

        if (!serverDirectory.exists())
            serverDirectory.mkdir();

        File topicFile = new File(serverDirectory.getPath() + "/Topic" + tc.getId() + ".txt");
        w.writeString(topicFile, tc.getTopic());

        long pos = track.getDuration();

        int ns = (int) (pos / 1000) % 60;
        int nm = (int) (pos / (1000 * 60)) % 60;
        int nh = (int) (pos / (1000 * 60 * 60));

        try {
            // tc.getManager().setTopic("**" + track.getInfo().title + "** :arrow_forward: [" + nh + "시간 " + nm + "분 " + ns + "초] :loud_sound:").complete(false);
        } catch (Exception e) {
            // ignore
        }

         */
    }

    @Override
    public void onTrackEnd(AudioPlayer pl, AudioTrack track, AudioTrackEndReason endReason) {
        this.lastTrack = track;

        if (endReason.mayStartNext) {
            if (repeating) {
                pl.startTrack(lastTrack.makeClone(), false);
            } else {

                if (queue.isEmpty()) {
                    return;
                }

                nextTrack();
            }
        }
    }

    public Set<AudioInfo> getQueuedTracks() {
        return new LinkedHashSet<>(queue);
    }

    public void nextTrack() {
        Set<AudioInfo> queue = getQueuedTracks();
        ArrayList<AudioInfo> tracks = new ArrayList<>(queue);

        try {
            if (!queue.isEmpty()) {
                pl.startTrack(tracks.get(0).getTrack(), false);
                this.queue.remove();
                tracks.remove(0);
            } else {
                pl.destroy();
            }
        } catch (IndexOutOfBoundsException e) {
            EmbedBuilder eb = new EmbedBuilder();

            eb.setDescription("더 이상 스킵할 곡이 없어요.");
            tc.sendMessage(eb.build()).delay(10, TimeUnit.SECONDS).flatMap(Message::delete).queue();
        } catch (Exception e) {
            // ignore
        }
    }

    public void nextTrack(int value) {
        Set<AudioInfo> queue = getQueuedTracks();
        ArrayList<AudioInfo> tracks = new ArrayList<>(queue);

        try {
            if (!queue.isEmpty()) {
                for (int i = 1; i < value - 1; i++) {
                    this.queue.remove();
                    tracks.remove(0);
                }

                pl.startTrack(tracks.get(0).getTrack(), false);
                this.queue.remove();
                tracks.remove(0);
            } else {
                pl.destroy();
            }
        } catch (IndexOutOfBoundsException e) {
            EmbedBuilder eb = new EmbedBuilder();

            eb.setDescription("더 이상 스킵할 곡이 없어요.");
            tc.sendMessage(eb.build()).delay(10, TimeUnit.SECONDS).flatMap(Message::delete).queue();
        } catch (Exception e) {
            // ignore
            // RateLimitedException caused by 'RestAction - complete(false)'.
        }
    }

    public boolean isRepeating() {
        return repeating;
    }

    public void setRepeating(boolean repeating) {
        this.repeating = repeating;
    }

    public void shuffle() {
        ArrayList<AudioInfo> tracks = new ArrayList<>(queue);

        for (int i = 0; i < queue.size(); i++) {
            queue.remove();
        }

        Collections.shuffle(tracks);
        queue.addAll(tracks);
    }
}
