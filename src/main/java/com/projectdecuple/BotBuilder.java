package com.projectdecuple;

import com.projectdecuple.Core.Utility.ReadFile;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import javax.security.auth.login.LoginException;

public class BotBuilder {

    public final static String BASE_DIRECTORY = System.getProperty("user.dir");
    private static final ReadFile r = new ReadFile();

    public final static String BOT_TOKEN = r.readString(BASE_DIRECTORY + "/TOKEN.txt");
    public final static String YOU_OAUTH = r.readString(BASE_DIRECTORY + "/YOUTUBE_API_KEY.txt");

    public final static String ACTIVITY = r.readString(BASE_DIRECTORY + "/Config/ACTIVITY.txt");

    public static void main(String[] args) throws LoginException {
        System.out.println("Working Directory : " + BASE_DIRECTORY);
        System.out.println("Custom-MusicBot-Maker by '데큐플#9999'. Custom-MusicBot-Maker was written based on the source code of QuintupleV2.");

        JDABuilder jdaBuilder = JDABuilder.createDefault(BOT_TOKEN)
                .setChunkingFilter(ChunkingFilter.ALL)
                .setMemberCachePolicy(MemberCachePolicy.ALL)
                .enableIntents(GatewayIntent.GUILD_MEMBERS,
                        GatewayIntent.GUILD_BANS,
                        GatewayIntent.GUILD_VOICE_STATES,
                        GatewayIntent.GUILD_MESSAGES,
                        GatewayIntent.GUILD_MESSAGE_REACTIONS,
                        GatewayIntent.GUILD_EMOJIS)
                .setAutoReconnect(true)
                .setStatus(OnlineStatus.ONLINE)
                .addEventListeners(new MusicListener());

        JDA jda = jdaBuilder.build();
        jda.getPresence().setActivity((ACTIVITY != null) ? Activity.playing(ACTIVITY) : Activity.playing("Nothing"));
    }

}
