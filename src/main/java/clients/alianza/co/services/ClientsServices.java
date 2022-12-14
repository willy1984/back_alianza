package clients.alianza.co.services;

import org.springframework.http.ResponseEntity;

import clients.alianza.co.entities.Clients;

public interface ClientsServices {
	
	public ResponseEntity<Object> getClients();
	public ResponseEntity<Object> createClient(Clients client);
	public ResponseEntity<Object> findByKey(String shared);
	public ResponseEntity<Object> deleteClient(Integer id);

}
