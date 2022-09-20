package clients.alianza.co.dto;

import org.springframework.http.HttpStatus;

public class ResponseDTO {
	
	private String code;
	private String message;
	private int state;
	private Object response;
	
	public ResponseDTO(HttpStatus state, String message) {
		super();
		this.state = state.value();
		this.code = state.name();
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
	
	
	

}
