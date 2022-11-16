package brunocorp.agenda.Repository;

import org.springframework.data.repository.CrudRepository;

import brunocorp.agenda.model.AgendaModel;

public interface AgendaRepository extends CrudRepository<AgendaModel,Integer>  {

}

