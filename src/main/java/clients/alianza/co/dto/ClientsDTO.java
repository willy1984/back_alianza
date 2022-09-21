package clients.alianza.co.dto;

import java.util.Date;

public class ClientsDTO {
	
	private Integer idClient;
	private String sharedKey;
	private String bussinesId;	
	private String email;
	private Long phone;
	private Date dataAdded;
	
	public ClientsDTO() {}
	
	

	public ClientsDTO(Integer idClient, String sharedKey, String bussinesId, String email, Long phone, Date dataAdded) {
		super();
		this.idClient = idClient;
		this.sharedKey = sharedKey;
		this.bussinesId = bussinesId;
		this.email = email;
		this.phone = phone;
		this.dataAdded = dataAdded;
	}



	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getSharedKey() {
		return sharedKey;
	}

	public void setSharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
	}

	public String getBussinesId() {
		return bussinesId;
	}

	public void setBussinesId(String bussinesId) {
		this.bussinesId = bussinesId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Date getDataAdded() {
		return dataAdded;
	}

	public void setDataAdded(Date dataAdded) {
		this.dataAdded = dataAdded;
	}
	
	
	

}
