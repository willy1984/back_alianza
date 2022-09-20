package clients.alianza.co.services;

import org.springframework.http.ResponseEntity;

import clients.alianza.co.entities.Clients;

public interface ClientsServices {
	
	public ResponseEntity<Object> getClients();
	public ResponseEntity<Object> createClient(Clients client);

}
