package brunocorp.todolistaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class UsuarioControllerTeste {
 @Autowired
  private UsuarioController controllerimpl;
 
    @Test
    public void verificartest() {
    	controllerimpl.verificar("Daniel", 1234);
    }
  
}
