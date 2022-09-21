package clients.alianza.co.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import clients.alianza.co.dto.ClientsDTO;
import clients.alianza.co.entities.Clients;

public interface ClientsRepository extends CrudRepository<Clients, Integer> {
	
	@Query("SELECT new " + " clients.alianza.co.dto.ClientsDTO( "
			+ " cl.idClient, cl.sharedKey, cl.bussinesId, cl.email, cl.phone, cl.dataAdded )"
			+ " FROM Clients cl"
			+ " WHERE cl.sharedKey LIKE :shared%")
	List<ClientsDTO> getClient(String shared);

}
