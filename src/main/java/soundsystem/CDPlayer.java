package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	// 스프링이 빈을 인스턴스화한 이후에는 @Autowired로 애너테이트된 setCompactDisc() 같은 메소드를 통해 종속 관계를 만족시킨다
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}
}
