# Last Carnival(~2023.04.12)

+ 배포 링크 : [Last Carnival 링크](http://34.64.74.137:8080/)


![screensh](img/last_home.png)


## 목적 
해외음원차트와 그 이야기를 나눌 커뮤니티 웹 개발

## 데이터
+ last.fm api - 해외음원차트, 앨범 이미지
+ yotube api - 음원차트내 뮤직비디오 URL


[last.fm api](https://www.last.fm/api)


[last.fm api 발급 방법](https://terrific-close-029.notion.site/last-fm-api-key-29b995f2c4294d16ac82bff432939a7b)


[yotube api](https://developers.google.com/youtube/v3?hl=ko)


[youtube api 발급 방법](https://terrific-close-029.notion.site/youtube-api-key-46556000dd57468691bafacfdf603aac)

## 개발 환경
- 프레임워크 : Spring boot 3.0.4
    - 라이브러리 : spring-boot-starter-web (3.0.4), spring-boot-starter-security(3.0.4), spring-boot-starter-oauth2-client(3.0.4), spring-boot-starter-thymeleaf(3.0.4), thymeleaf-layout-dialect(3.2.0), thymeleaf-extras-springsecurity5(3.1.1), spring-boot-starter-validation(3.0.4), spring-boot-devtools (3.0.4), mybatis-spring-boot-starter(2.3.0), lombok (1.18.26), spring-boot-starter-tomcat (3.0.4), spring-boot-starter-test (3.0.4), tomcat-embed-jasper (10.1.7), spring-boot-starter-data-mongodb (3.0.4), okhttp (4.9.2), commons-io (2.8.0), guava (31.0.1-jre), commons-codec (1.15)

- 배포 서버 환경 : Google Cloud Platform
    - 머신 구성 : e2-small
    - 지역 : asia-northeast3-a

- DB 서버 환경 : MongoDB Atlas
    - Version : 5.0.15
    - Data Size : 512MB
    - 지역 : GCP Seoul(asia-northeast3)
    - 용도 : 차트정보 및 앨범커버 이미지

                Cloud SQL
    - 데이터베이스 엔진 : MySQL
    - Version : 8.0
    - Data Size : 100GB
    - 지역 : asia-northeast3-a
    - 용도 : 회원정보, 게시판정보, 댓글정보, 로그인유지, 회원권한, 회원소셜구분


## 팀구성
- 사용언어 : Java 17.0.4.1
- 작업툴 : VS code
- 인원 : 4명
    - 프론트엔드 : 김시우
    - 백엔드 :
        - 신규 기능 & api : 김승규
        - 회원가입 & 로그인 : 김종혁
        - 게시판 & 관리자페이지 : 박지수
- 주요업무 : Spring boot 프레임워크를 이용한 웹개발 구현 코드 작성
- 기간 : 2023-03-22 ~ 2023-04-12
***

## 주요기능
- 홈페이지
    - 해외음원차트(매일 갱신)(api)
        - 순위, 앨범이미지, 제목, 가수명 제공
        - 앨범이미지 및 유튜브이미지 클릭시 youtube 링크 이동(api)
    - 로그인 세션

- 회원가입 페이지
    - 아이디, 닉네임 중복확인
    - 아이디, 비밀번호, 닉네임, 핸드폰번호, 이메일 형식 확인

- 로그인 페이지
    - 소셜 로그인(카카오)

- 커뮤니티 페이지
    - 게시판 조회, 수정, 삭제
        + 페이징
    - 댓글, 대댓글 구현

- 내 정보 페이지
    - 자신의 회원정보 조회 , 수정(미구현), 삭제(미구현)

- 관리자 페이지
    - 게시판 관리
    - 회원정보 관리

## 자기소개
[자기소개](https://github.com/SeungKyu37/resume)



