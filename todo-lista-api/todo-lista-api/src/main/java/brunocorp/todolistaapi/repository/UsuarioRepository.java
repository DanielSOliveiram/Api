package brunocorp.todolistaapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import brunocorp.todolistaapi.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer> {
    @Query("select u from usuario u where u.nome like ?1  and  u.senha like ?2")
    Optional<UsuarioModel> findUsuarioByloginSenha(String nome,int senha);
}
