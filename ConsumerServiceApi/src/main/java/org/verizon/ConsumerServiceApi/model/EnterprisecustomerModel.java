package org.verizon.ConsumerServiceApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EnterprisecustomerModel {
	
	@Id
	private int ec_id;
	private String ec_name;
	@ManyToOne 
	@JoinColumn(name="order_id")
	private Ordering ordering;
	public EnterprisecustomerModel() {
		
	}
	public int getEc_id() {
		return ec_id;
	}
	public void setEc_id(int ec_id) {
		this.ec_id = ec_id;
	}
	public String getEc_name() {
		return ec_name;
	}
	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}
	public Ordering getOrdering() {
		return ordering;
	}
	public void setOrdering(Ordering ordering) {
		this.ordering = ordering;
	}
	
	

}
