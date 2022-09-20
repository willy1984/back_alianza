package clients.alianza.co.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client")
	private Integer idClient;
	@Column(name="shared_key")
	private String sharedKey;
	@Column(name="bussines_id")
	private String bussinesId;	
	private String email;
	private Long phone;
	@Column(name="data_added")
	private Date dataAdded;
	
	
	public Clients() {}


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
