package org.verizon.ConsumerServiceApi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerModel {
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Ordering ordering;
	
	@Id
	private String cust_name;
	private int cust_id;
	public CustomerModel() {
		super();
	}
	public Ordering getOrdering() {
		return ordering;
	}
	public void setOrdering(Ordering ordering) {
		this.ordering = ordering;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public static List<CustomerModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
