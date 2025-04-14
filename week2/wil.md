##Weekly-I-Learned

이번 주에는 스프링 프레임워크에서 스프링 빈을 등록하고 의존성을 주입하는 방법을 실습했다.  
컴포넌트 스캔 방식을 사용하여 `@Component`, `@Service`, `@Repository` 어노테이션이 붙은 클래스를 자동으로 빈으로 등록할 수 있음을 배웠다.

생성자 주입 방식을 적용하기 위해 롬복의 `@RequiredArgsConstructor`를 사용하였고, 이를 통해 `final`로 선언된 의존성이 자동 주입됨을 확인했다.  
`MyController`, `MyService`, `MyRepository` 클래스를 계층 구조에 따라 연결하였고, 각각의 메서드에서 로그를 출력하여 호출 흐름을 확인하였다.

또한, `@SpringBootTest`를 사용하여 스프링 컨텍스트를 로딩한 뒤 테스트 클래스에서 빈을 주입받아 실제 동작 여부를 검증하였다.  
출력 결과로 controller, service, repository가 순서대로 나타났고, 이는 빈 등록 및 의존성 주입이 정상적으로 이루어졌음을 의미한다.


![스크린샷(2388)](https://github.com/user-attachments/assets/03dac106-8b30-4e9e-a809-fb09501a378e)
![스크린샷(2387)](https://github.com/user-attachments/assets/e40ad1e0-776a-4a21-92e3-91ca5413be7e)
