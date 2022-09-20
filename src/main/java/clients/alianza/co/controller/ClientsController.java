package clients.alianza.co.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clients.alianza.co.dto.ClientsDTO;
import clients.alianza.co.entities.Clients;
import clients.alianza.co.services.ClientsServices;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*")
public class ClientsController {
		
		@Autowired
		public ClientsServices services;
		
		@GetMapping("/get-clients")
		public ResponseEntity<Object> getClients() {
			return services.getClients();
		}
		
		@PostMapping("/create-client")
		public ResponseEntity<Object> createClient(@RequestBody Clients client) {
			return services.createClient(client);
		}


}
