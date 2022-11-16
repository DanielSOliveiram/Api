package brunocorp.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;




@SpringBootApplication
public class AgendaApplication {


	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

}
