##Weekly-I-Learned

이번 1주차 백엔드 스터디에서는 웹과 HTTP의 개념, 프론트엔드와 백엔드의 역할, 그리고 REST API에 대해 배웠다. 웹은 여러 컴퓨터가 정보를 주고받는 공간이며, 클라이언트-서버 구조를 기반으로 작동한다. 서버와 클라이언트는 HTTP라는 프로토콜을 통해 요청과 응답을 주고받으며, HTTP Method(GET, POST, PUT 등)와 URL을 사용해 데이터를 주고받는다. 또한, 응답 시에는 상태 코드(200, 404 등)를 통해 처리 결과를 전달한다. 프론트엔드는 사용자에게 화면을 보여주는 역할, 백엔드는 데이터 처리 및 저장을 담당한다. 두 영역은 API를 통해 서로 통신하며, REST API는 명확한 규칙에 따라 URL과 HTTP Method를 사용해 리소스를 조작한다. 과제로는 TodoMate API 클론 프로젝트를 위한 API 설계를 수행했으며, 이 과정을 통해 실제 백엔드 개발의 기초적인 흐름을 이해할 수 있었다.


## 📌 TodoMate API 설계

 ✅ 회원 관련 기능

1. **회원가입**
   - Method: POST  
   - URL: `/register`

2. **로그인**
   - Method: POST  
   - URL: `/login`

3. **로그아웃**
   - Method: POST  
   - URL: `/logout`

4. **회원 닉네임 조회**
   - Method: GET  
   - URL: `/member/{member_id}/nickname`

---

#### ✅ 할 일(todo) 관련 기능

5. **할 일 전체 조회**
   - Method: GET  
   - URL: `/todo/list`

6. **할 일 생성**
   - Method: POST  
   - URL: `/todo`

7. **할 일 수정**
   - Method: PATCH  
   - URL: `/todo/{todo_id}`

8. **할 일 삭제**
   - Method: DELETE  
   - URL: `/todo/{todo_id}`

9. **할 일 체크**
   - Method: POST  
   - URL: `/todo/{todo_id}/check`

10. **할 일 체크 해제**
    - Method: POST  
    - URL: `/todo/{todo_id}/uncheck`

---

#### ✅ 친구 기능
git 
11. **친구 검색**
    - Method: GET  
    - URL: `/friend/search?nickname={nickname}`

12. **친구 팔로우**
    - Method: POST  
    - URL: `/friend/{friend_id}/follow`

13. **친구 언팔로우**
    - Method: POST  
    - URL: `/friend/{friend_id}/unfollow`

14. **친구 목록 조회**
    - Method: GET  
    - URL: `/friend/list`

15. **특정 친구의 할 일 조회**
    - Method: GET  
    - URL: `/friend/{friend_id}/todo/list`
   

![image](https://github.com/user-attachments/assets/bfd2f709-ddd6-4aba-a6f9-ad5718cd7a9a)

