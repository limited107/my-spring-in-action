package soundsystem;

import org.springframework.stereotype.Component;


@Component  //Component를 붙임으로써 SgtPeppers 빈을 명시적으로 설정할 필요는 없다.
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. title";
	private String artist = "The beatles";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
