package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//JavaConfig 클래스 만들기의 핵심은 @Configuration으로 애너테이트하는 것이다
//@Configuration은 해당 클래스를 설정 클래스로서 식별하고
//스프링 애플리케이션 컨텍스트에서 만들어진 빈의 자세한 내용이 포함될 수 있다는 것을 나타낸다

//Component 스캔을 사용하지 않고, 의존성 주입을 해보자 -> ComponentScan 제거
//CDPlayer와 CompactDisc 빈을 JavaConfig로 명시적으로 와이어링하는 방법
public class CDPlayerConfig {
	//JavaConfig에서 빈을 선언하기 위해서 원하는 타입의 인스턴스를 만드는 메소드를 만들고, @Bean으로 애너테이트한다

	@Bean   //이 경우 Bean의 이름은 sgtPeppers이다
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public MediaPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}
}
