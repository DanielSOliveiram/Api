package brunocorp.todolistaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import brunocorp.todolistaapi.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioRepository repository;
	

	 
	 @GetMapping(path ="api/nome/{nome}/senha/{senha}")
     public ResponseEntity verificar(@PathVariable("nome") String nome,@PathVariable("senha") int senha) {
    	 return repository.findUsuarioByloginSenha(nome,senha)
    			 .map(record -> ResponseEntity.ok().body(record))
    			 .orElse(ResponseEntity.notFound().build());
     }


}
