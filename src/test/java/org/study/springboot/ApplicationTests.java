package org.study.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(class=Application.class) 선택한 구성 클래스에서 컨텍스트 로드 (Spring Boot 1.3 이하에서 가능) 참고 : https://preamtree.tistory.com/56
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK) // 컨텍스트 로드하고 서블릿 컨테이너 환경을 mocking 한다. 내장된 서블릿 컨테이너는 전혀 시작되지 않는다. (Spring Boot 1.4 이상)
class ApplicationTests {

    @Test
    void contextLoads() { // 컨텍스트 로드 테스트
    }

}
