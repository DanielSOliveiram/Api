package brunocorp.agenda.Controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;



@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class AgendaControllerTest {
	@Autowired
	private AgendaController controllerimple;
	
	@Test
	public void Verifiartest() {
    	controllerimple.verificar(1);
	}

}
