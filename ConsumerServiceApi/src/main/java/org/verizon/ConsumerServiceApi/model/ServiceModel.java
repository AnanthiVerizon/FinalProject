package org.verizon.ConsumerServiceApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceModel {
	@Id
	private int service_id;
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Catalogmodel catalogmodel;
	
	
	private String provision;
	private String Test_qos;
	private String Activity;
	public ServiceModel() {
		
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public Catalogmodel getCatalogmodel() {
		return catalogmodel;
	}
	public void setCatalogmodel(Catalogmodel catalogmodel) {
		this.catalogmodel = catalogmodel;
	}
	public String getProvision() {
		return provision;
	}
	public void setProvision(String provision) {
		this.provision = provision;
	}
	public String getTest_qos() {
		return Test_qos;
	}
	public void setTest_qos(String test_qos) {
		Test_qos = test_qos;
	}
	public String getActivity() {
		return Activity;
	}
	public void setActivity(String activity) {
		Activity = activity;
	}
	
	
	

}
