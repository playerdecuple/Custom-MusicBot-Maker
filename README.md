# Custom-MusicBot-Maker
> 쉽고 간편한 나만의 디스코드 뮤직 봇 만들기
### Custom-MusicBot-Maker was written based on the source code of 'QuintupleV2'.

## 준비물
Discord 계정과 Youtube(Google) 계정

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

## II. Youtube API 세팅 (선택)

URL만 사용하는 것이 아닌, 유튜브의 검색 기능을 사용하고 싶으시다면
Youtube API 세팅 또한 필요합니다.

1. 먼저, https://console.developers.google.com/ 로 들어가서 로그인을 해 주세요.
2. '이 페이지를 보려면 프로젝트를 선택하세요'라는 블록이 보인다면, 프로젝트 만들기 버튼을 눌러 주세요.  
![Tutorial2](https://user-images.githubusercontent.com/64447484/95121223-b5fb6e80-0789-11eb-97b6-de710dd10861.png)
3. 프로젝트 이름 칸에 'CustomMusicBot'을 입력해 주고, 만들기 버튼을 눌러 주세요.
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
