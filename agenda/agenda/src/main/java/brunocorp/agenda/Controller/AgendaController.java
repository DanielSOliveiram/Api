package brunocorp.agenda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import brunocorp.agenda.Repository.AgendaRepository;



@RestController
public class AgendaController {
	@Autowired
	private AgendaRepository repository;
	


@GetMapping(path ="api/agenda/{id}")
public ResponseEntity verificar(@PathVariable("id") Integer id) {
	 return repository.findById(id)
			 .map(record -> ResponseEntity.ok().body(record))
			 .orElse(ResponseEntity.notFound().build());
}
}