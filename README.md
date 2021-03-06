# Custom-MusicBot-Maker
> 쉽고 간편한 나만의 디스코드 뮤직 봇 만들기
> Easy, comportable, Custom Musicbot Maker.
### Custom-MusicBot-Maker was written based on the source code of 'QuintupleV2'.

## 준비물
Discord 계정과 Youtube(Google) 계정, [Java 8](https://java.com/ko/download/)

## Rquired
A discord account, a YouTube(Google) accout. [Java 8](https://java.com/ko/download/)

## I. 디스코드 설정  
이 봇이 작동하려면, Discord Bot Token이 필요합니다.

1. https://discord.com/developers/applications 에 접속합니다. (로그인이 필요할 수도 있습니다.)
2. Applications 창이 표시되었다면 오른쪽 상단의 'New Application' 버튼을 누릅니다.
3. NAME 부분에 봇의 이름을 적어 주고 파란 버튼을 눌러 앱을 생성합니다.
4. 'CLIENT ID' 부분에 있는 숫자를 복사하고, 다른 곳에 붙여넣기해 둡니다. (아니면, Copy 버튼을 누릅니다.)
5. 왼쪽 메뉴에서 'Bot'을 클릭합니다.
6. Build-A-Bot 항목의 'Add Bot' 버튼을 클릭합니다.
7. 봇의 프로필 사진과 봇의 이름을 설정합니다.
8. 아래로 조금 내려 Privileged Gateway Intents 항목의 두 스위치를 모두 켭니다. (PRESENCE INTENT, SERVER MEMBERS INTENT 항목)
9. 'Save Changes' 버튼을 누릅니다.
10. 다시 맨 위로 올라와서, 'TOKEN' 항목의 'Copy' 버튼을 클릭하고 다른 곳에 붙여넣기해 둡니다.

## I. Discord bot setting
This repository needs 'Discord Bot Token'.

1. Connect to https://discord.com/developers/applications (You may need to log in.)
2. If you can see 'Applications' window, click 'New Application' button. (It's in the top right.)
3. Input bot's name into 'NAME' text box, then click blue color button.
4. Copy the numbers in the 'CLIENT ID' section and paste it elsewhere. (Or, click the Copy button.)
5. Click 'Bot' menu in left sections.
6. Click 'Add Bot' button in 'Build-A-Bot' section.
7. Set bot's profile image and bot's name.
8. Scroll down a little and turn on both switches under Privileged Gateway Intents. (PRESENCE INTENT, SERVER MEMBERS INTENT items)
9. Click 'Save Changes'.
10. Scroll up to the top, click 'Copy' button in 'TOKEN' section, then paste it elsewhere.

## II. Youtube API 세팅 (선택)

URL만 사용하는 것이 아닌, 유튜브의 검색 기능을 사용하고 싶으시다면
Youtube API 세팅 또한 필요합니다.

1. 먼저, https://console.developers.google.com/ 로 들어가서 로그인을 해 주세요.
2. '이 페이지를 보려면 프로젝트를 선택하세요'라는 블록이 보인다면, 프로젝트 만들기 버튼을 눌러 주세요.  
![Tutorial2](https://user-images.githubusercontent.com/64447484/95121223-b5fb6e80-0789-11eb-97b6-de710dd10861.png)
3. 프로젝트 이름 칸에 'CustomMusicBot'을 입력해 주고(대소문자도 똑같이 구별해 주세요), 만들기 버튼을 눌러 주세요.
4. 조금 기다리면 아래와 같은 창이 표시될 겁니다. 'API 라이브러리로 이동' 하이퍼링크를 클릭해 주세요.  
![Tutorial3](https://user-images.githubusercontent.com/64447484/95121289-d0cde300-0789-11eb-870e-b847c851895b.png)
5. 'API 및 서비스 검색' 블록에 'Youtube Data API v3'을 입력해 줍니다.
6. 나온 결과를 클릭하고, '사용' 버튼을 누릅니다.
7. 이동된 웹 페이지에서 아래와 같은 블록이 나온다면 '사용자 인증 정보 만들기' 버튼을 눌러 주세요.  
![Tutorial4](https://user-images.githubusercontent.com/64447484/95121351-e4794980-0789-11eb-8995-25a399a03f72.png)
8. 프로젝트에 사용자 인증 정보 추가 창이 표시되면, 아래와 같이 설정하고 파란색 버튼을 누릅니다.  
![Tutorial5](https://user-images.githubusercontent.com/64447484/95121368-e9d69400-0789-11eb-94f6-a3045446b2f8.png)
9. 빨간색으로 밑줄 표시 된 버튼을 클릭하여 다른 곳에 붙여넣기 해 두고, 완료 버튼을 누릅니다.  
![Tutorial6](https://user-images.githubusercontent.com/64447484/95121378-ee02b180-0789-11eb-9988-6065c8a8afbe.png)

## II. Youtube API Setting

To use the 'Search' feature, you need to set up YouTube API.

1. Connect to https://console.developers.google.com/ and log in.
2. If you can see 'Please select a project to view this page', click 'Make a project' button.
![Tutorial2](https://user-images.githubusercontent.com/64447484/95121223-b5fb6e80-0789-11eb-97b6-de710dd10861.png)
3. Input 'CustomMusicBot'(Please be case sensitive), and click 'make' button.
4. Wait for a while and the window below will appear, click 'Go to API Libraries' hyperlink.
![Tutorial3](https://user-images.githubusercontent.com/64447484/95121289-d0cde300-0789-11eb-870e-b847c851895b.png)
5. Input 'Youtube Data API v3' into 'Search API and service' block.
6. Click 'Youtube Data API v3' button, then click 'use' button.
7. If you can see this block, click 'Make user authentication information' button.
![Tutorial4](https://user-images.githubusercontent.com/64447484/95121351-e4794980-0789-11eb-8995-25a399a03f72.png)
8. When the window for adding user authentication information to the project is displayed, make the following settings and click the blue button.
![Tutorial5](https://user-images.githubusercontent.com/64447484/95121368-e9d69400-0789-11eb-94f6-a3045446b2f8.png)
9. Click the button underlined in red to paste it elsewhere, then click the Done button.
![Tutorial6](https://user-images.githubusercontent.com/64447484/95121378-ee02b180-0789-11eb-9988-6065c8a8afbe.png)

## III. 커스텀 뮤직봇 메이커 세팅

> 이 부분을 스킵하시려면 [E-S-C 툴](https://github.com/playerdecuple/Easy-Set-CMBM)을 이용해 주세요!  

이제 본격적으로 사용해볼 시간입니다. 복사해 둔 Discord 토큰과 Youtube API 키를 준비해야 합니다.  
1. `TOKEN.txt`에 Discord 토큰을 넣고, `YOUTUBE_API_KEY.txt`에 Youtube API 키를 넣습니다.
2. `RUN.bat`을 실행하면 잘 실행됩니다.
  
자신만의 뮤직봇을 만들기 위해 메시지 커스텀 또한 가능합니다.
1. `Config` 폴더를 엽니다.
2. `MESSAGE.json`은 전송할 메시지를, `COMMAND.json`은 명령어입니다. 봇의 상태 메시지를 지정하려면 `ACTIVITY.txt`를 설정하면 됩니다.

MESSAGE.json은 자유로이 수정할 수 있습니다. 하지만 `{track_title}`나 `{voice_channel_name}`와 같은 친구들은 건들이지 말아 주세요.
COMMAND.json의 편집 도움말입니다. 원래는 다르게 씌여 있습니다.
```json
{
    "connectCommand": ["보이스 채널에 접속하는 명령어입니다."],
    "disconnectCommand": ["보이스 채널에서 연결을 끊는 명령어입니다."],
    "queueCommand": ["음악을 추가하고 재생하는 명령어입니다."],
    "skipCommand": ["음악을 스킵하는 명령어입니다."],
    "volumeCommand": ["볼륨을 조정하는 명령어입니다."],
    "nowPlayingCommand": ["현재 재생 중인 곡을 표시해주는 명령어입니다."],
    "shuffleCommand": ["셔플 명령어입니다."],
    "repeatCommand": ["반복 명령어입니다."],
    "showListCommand": ["큐에 등록되어 있는 리스트를 표시해주는 명령어입니다."],
    "melonCommand": ["멜론 차트를 재생하는 명령어입니다."],
    "pauseCommand": ["음악을 일시정지하는 명령어입니다."],
    "shutdownCommand": ["봇을 끄는 명령어입니다."],

    "customPlaylistCommand": ["커스텀 플레이리스트(퀸튜플 재생목록)를 재생하는 명령어입니다."],
    "listGetterCommand": ["커스텀 플레이리스트(퀸튜플 재생목록)에 있는 트랙 리스트를 전송하는 명령어입니다."],

    "prefix" : "명령어 앞에 붙는 기호입니다. 한 글자만 쓸 수 있습니다."
}
```

## III. Setting Custom Music Bot

Now, you can use this repository. You will need to have a copy of your Discord token and Youtube API key.
1. Input Discord Bot Token into `TOKEN.txt`, then input Youtube API Key into `YOUTUBE_API_KEY.txt`.
2. Execute `RUN.bat`.

You can customize messages of this repository. Don't edit things like `{track_title}` and `{voice_channel_name}` please.
1. Open `Config` Directory.
2. `MESSAGE.json` is a message info json file, `COMMAND.json` is a command info json file. To edit activity message of bot, edit `ACTIVITY.txt`.

This is editting help of `COMMAND.json`. It will be written differently.
```json
{
    "connectCommand": ["Connect to voice channel."],
    "disconnectCommand": ["Disconnect from voice channel."],
    "queueCommand": ["Add a music into queue."],
    "skipCommand": ["Skip track(s)."],
    "volumeCommand": ["Adjusment volume."],
    "nowPlayingCommand": ["Send now playing track information."],
    "shuffleCommand": ["Shuffle queue."],
    "repeatCommand": ["Repeat a track."],
    "showListCommand": ["Send queue list."],
    "melonCommand": ["Play tracks in melon charts(Korean music chart platform)"]
    "pauseCommand": ["Pause track."],
    "shutdownCommand": ["Shutdown bot."],

    "customPlaylistCommand": ["Play custom playlist tracks(in QuintupleV2)."],
    "listGetterCommand": ["Send list of custom playlist tracks.(in QuintupleV2)"],

    "prefix" : "This is the symbol that precedes the command. You can only write one letter."
}
```
