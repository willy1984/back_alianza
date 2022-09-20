package clients.alianza.co.ServicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import clients.alianza.co.dto.ClientsDTO;
import clients.alianza.co.dto.ResponseDTO;
import clients.alianza.co.entities.Clients;
import clients.alianza.co.repository.ClientsRepository;
import clients.alianza.co.services.ClientsServices;

@Service
public class ClientsImpl implements ClientsServices {
	
	private Logger logger = LogManager.getLogger(ClientsImpl.class);
	
	@Autowired
	ClientsRepository clientRepo;

	@Override
	public ResponseEntity<Object> getClients() {
		ResponseEntity<Object> response = ResponseEntity.ok(HttpStatus.OK);
		try {
			ResponseDTO responseDto = new ResponseDTO(HttpStatus.OK, "Getting clients");
			List<ClientsDTO> listClients = new ArrayList<ClientsDTO>();
			ClientsDTO clients;
			List<Clients> listTemp = (List<Clients>) clientRepo.findAll();
			for(Clients c : listTemp) {
				clients = new ClientsDTO();
				clients.setIdClient(c.getIdClient());
				clients.setBussinesId(c.getBussinesId());
				clients.setEmail(c.getEmail());
				clients.setDataAdded(c.getDataAdded());
				clients.setPhone(c.getPhone());
				clients.setSharedKey(c.getSharedKey());
				
				listClients.add(clients);
			}
			logger.info("Query clients complete");
			responseDto.setResponse(listClients);
			response = new ResponseEntity<>(responseDto, HttpStatus.OK);			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			logger.info("ERROR ::: " + e.getMessage());
			ResponseDTO respuestaDto = new ResponseDTO(HttpStatus.INTERNAL_SERVER_ERROR,
					"Error");
			response = new ResponseEntity<>(respuestaDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	public ResponseEntity<Object> createClient(Clients client) {
		ResponseEntity<Object> response = ResponseEntity.ok(HttpStatus.OK);
		try {
			ResponseDTO responseDto = new ResponseDTO(HttpStatus.OK, "Client saved successfully");
			responseDto.setResponse(clientRepo.save(client));
			logger.info("Client saved successfully");
			response = new ResponseEntity<>(responseDto, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			logger.info("ERROR ::: " + e.getMessage());
			ResponseDTO respuestaDto = new ResponseDTO(HttpStatus.INTERNAL_SERVER_ERROR,
					"Create error");
			response = new ResponseEntity<>(respuestaDto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}

}
