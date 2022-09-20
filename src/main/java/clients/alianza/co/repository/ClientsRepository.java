package clients.alianza.co.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import clients.alianza.co.dto.ClientsDTO;
import clients.alianza.co.entities.Clients;

public interface ClientsRepository extends CrudRepository<Clients, Integer> {
	
	@Query(value = "SELECT * FROM  clients " +
	   	   	   "WHERE shared_key LIKE :shared%", nativeQuery = true)
	List<Clients> getClient(String shared);

}
