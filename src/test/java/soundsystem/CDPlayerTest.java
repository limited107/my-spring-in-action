package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 테스트 시작 시 자동으로 생성되는 스프링 애플리케이션 컨텍스트를 가지는 스프링 SpringJUnit4ClassRunner을 이용한다
@ContextConfiguration(classes = CDPlayerConfig.class)
// CDPlayerConfig 클래스를 통해서 설정을 로드한다
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;

	@Autowired
	private MediaPlayer mp;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void mpShoudNotBeNull() {
		assertNotNull(mp);
	}
}