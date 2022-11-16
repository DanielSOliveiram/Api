package brunocorp.todolistaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@SpringBootApplication
public class TodoListaApiApplication {
	
	@Bean
	public WebClient webClientAgenda(WebClient.Builder builder) {
		return builder
			.baseUrl("http://localhost:8080")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoListaApiApplication.class, args);
	}

}
