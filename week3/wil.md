##Weekly-I-Learned

이번 3주차 백엔드 스터디에서는 JPA를 활용하여 데이터베이스 테이블을 생성하고, 연관 관계를 설정하는 실습을 진행했다. 또한 연관 관계와 프로젝트 명세를 ERD를 통해 표현하였다.
@Entity 를 통해 테이블에 매핑되는 도메인 클래스를 정의하였고, `@Id`, `@GeneratedValue` 등을 사용하여 기본키 설정 방법을 학습하였다.
회원과 할 일 엔티티 사이에 N:M`@ManyToOne` 관계를 설정하고, 외래키 매핑을 위해 `@JoinColumn` 을 사용하였다.
이 과정에서 `@ManyToOne`과 `@Column`을 동시에 사용할 수 없다는 에러를 겪으며, JPA에서 연관 관계를 선언할 때는 반드시 `@JoinColumn`을 사용해야 한다는 점을 알게되었다.
이후 Spring Boot 실행 시 자동으로 생성되는 테이블 구조와 외래키 제약 조건이 로그에 출력되는 것을 통해 설정이 올바르게 적용되었음을 확인하였다.


![image](https://github.com/user-attachments/assets/099ad949-65e5-4f1c-b582-a06d7b277c44)
![image](https://github.com/user-attachments/assets/4c9c9cc4-54de-46d3-b556-27567641b0b9)
