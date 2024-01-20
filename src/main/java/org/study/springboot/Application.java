package org.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 스프링 구성 클래스이자
 * (스프링 부트의 자동 구성이 수많은 스프링 구성을 제거하지만, 자동 구성을 활성화하는 최소한의 구성을 한다.)
 * 부트스트랩 클래스 이다.
 *
 * @SpringBootApplication : 컴포넌트 검색과 자동 구성을 활성화 한다. 다음의 3개의 애너테이션을 묶었다.
 *  @Configuration : 이 애너테이션이 붙은 클래스를 스프링의 자바 기반 구성 클래스로 지정한다.
 *  @ComponentScan : 컴포넌트 검색 기능을 활성화 한다. 그래서 컨트롤러 클래스나 다른 컴포넌트 클래스를 자동으로 검색해서 컨텍스트에 빈으로 등록한다. ex. @Controller 애너테이션을 붙여 컴포넌트 검색이 이 컨트롤러를 찾을 수 있게 된다.
 *  @EnableAutoConfiguration : 스프링 부트의 자동 구성을 활성화 한다. 수많은 구성 코드를 대체할 수 있다.
 *  스프링 부트 자동 구성이 제공하는 것 이상으로 추가적인 스프링 구성이 필요하다면,
 *  @Configuration 애너케이션을 포함한 구성 클래스에서 작성하는 것이 가장 좋다.
 */
@SpringBootApplication // 구성 코드 단 한줄
public class Application {

    public static void main(String[] args) {
        // 애플리케이션 부트스트랩 : jar 파일로 애플리케이션을 실행 한다.
        SpringApplication.run(Application.class, args);
    }

}