# 🛒 이커머스 프로젝트 🛒

👉 [팀 GitHub organization 보기](https://github.com/5-tyranno-develops)

## ✔️ 목차
- [프로젝트 개요](#%EF%B8%8F-프로젝트-개요)
- [담당 구현 기능](#%EF%B8%8F-담당-구현-기능)
- [협업](#%EF%B8%8F-협업)
- [개발 문서](#%EF%B8%8F-개발-문서)
- [시연 영상](#%EF%B8%8F-시연-영상)

## ✔️ 프로젝트 개요
- `설명`: 이커머스 사이트 'SSG' 리빌딩 프로젝트
- `기간`: 2024.02.21 ~ 2024.04.14
- `구성`: BE 3명, FE 2명
- `핵심 기술`: <br>
  <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=Spring-Boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Mysql-4479A1?style=for-the-badge&logo=Mysql&logoColor=black" />
  <img src="https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=Redis&logoColor=white" />
  <br>
  <img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
- `화면 이미지`: 
<p float="left">
  <img src="https://github.com/jmlee119/maphant-app/assets/68285285/30e23779-c25f-46fc-9783-87daf671a567" width=250 height=440 />
  <img src="https://github.com/user-attachments/assets/33d42db7-a56a-48dc-85e3-88a1132e3bc5" width=250 height=440 />
  <img src="https://github.com/jmlee119/2023Algorithm/assets/68285285/ce3d1ee4-bdc9-4548-af7e-c8d26102bd44" width=250 height=440 />
</p>

- `주요 기능`: <br>
1. 소셜 로그인
2. 로그인, 회원가입 - 문자인증
3. 배송지 등록 - 카카오 우편주소 API
4. 상품 조회
5. 장바구니 담기
6. 주문하기
7. 결제하기 - 카카오페이
8. 최근 본 상품
9. 카테고리 별 조회
10. 상품 좋아요
<br>

## ✔️ 담당 구현 기능

- `역할`: 일반 / 소셜 회원가입 및 로그인, 카카오페이 결제, 배송지, 장바구니, 공통 응답 형식 및 커스텀 에러 처리 구축, 마이페이지
-  `담당 구현 파트`
1. **일반, 소셜 회원가입 및 로그인** : <br>
    - Spring Security 와 JWT 를 통한 인가 / 인증
    - 카카오 로그인 API 이용
2. **공통 응답 형식 / 커스텀 에러 처리 구축** : <br>
    - 공통 응답 형식을 통한 API 형식 통일
    - 커스텀 에러 처리를 통한 사용자 경험 향상
3. **배송지 / 장바구니 서비스** : <br>
    - Spring JPA 를 통한 데이터 처리
4. **결제 서비스** : <br>
    - KakaoPay API 를 활용한 결제 구현
<br>

## ✔️ 협업
<table>
  <tr>
    <th>아침&저녁 회고</th>
    <th>스프린트</th>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/fc072b5b-b75d-4140-8dd6-509994b3efed" width="350" height="300"></td>
    <td><img src="https://github.com/user-attachments/assets/1c401d48-0b16-4a56-aee9-29e5f485171e" width="350" height="300"></td>
  </tr>
  <tr>
    <th>주간 리뷰</th>
    <th>노션 기반 진행상황 공유</th>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/d52769cc-1481-4f62-881e-e45a63a58d74" width="350" height="300"></td>
    <td><img src="https://github.com/user-attachments/assets/d51a1877-12d5-4890-91cd-d0c7e80884f4" width="350" height="300"></td>
  </tr>
</table>
<br>


## ✔️ 개발 문서
🔎 자세히 보려면 사진 클릭 🔎
<details>
<summary>
  이벤트 스토밍
</summary>
   <img src="https://github.com/user-attachments/assets/ce78c885-b6e3-4857-9b0b-a13f20d43c31" width="700" height="400">
</details>

<details>
<summary>
  화면 설계서
</summary>
  <img src="https://github.com/user-attachments/assets/ca027e30-3295-41fc-9f1a-27eb466fb8bb"  width="700" height="600">
</details>

<details>
<summary>
  요구사항 정의서
</summary>
  <img src="https://github.com/user-attachments/assets/71a40d9a-cea4-434f-97ed-a17ed2b8a512" width="700" height="400">
  <img src="https://github.com/user-attachments/assets/12c1bfd7-b689-4a4c-aa9f-1a77b13d6a4b" width="700" height="400">
</details>

<details>
<summary>
  ERD 설계서
</summary>
  <img src="https://github.com/user-attachments/assets/2537eb66-425b-4976-b3d3-af9b1a89e69b" width="700" height="400">
</details>

<details>
<summary>
  아키텍처 구조도
</summary>
  <img src="https://github.com/user-attachments/assets/aa7f65e6-283d-444d-a438-98095a1a6409" width="700" height="400">
</details>

<details>
<summary>
  파일 구조
</summary>
  <img src="https://github.com/user-attachments/assets/37cffc4b-f200-43b4-aec6-9a60e3eeb5cd">
</details>

[API 정의서](https://github.com/user-attachments/files/16467764/API.pdf)
<br>

## ✔️ 시연 영상
https://github.com/user-attachments/assets/0c5572ca-4dc5-4ec5-89f1-4876983816b4



