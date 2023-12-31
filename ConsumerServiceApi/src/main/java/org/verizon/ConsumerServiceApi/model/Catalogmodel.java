package org.verizon.ConsumerServiceApi.model;
import jakarta.persistence.Entity; 

import jakarta.persistence.Id; 
@Entity 
public class Catalogmodel {

	 
	@Id 
	private int plan_id; 
	private String plans; 
	private int price; 
	private String validity; 
	public Catalogmodel() { 
	} 
	public int getPlan_id() { 
	return plan_id; 
	} 
	public void setPlan_id(int plan_id) { 
	this.plan_id = plan_id; 
	} 
	public String getPlans() { 
	return plans; 
	} 
	public void setPlans(String plans) { 
	this.plans = plans; 
	} 
	public int getPrice() { 
	return price; 
	} 
	public void setPrice(int price) { 
	this.price = price; 
	} 
	public String getValidity() { 
	return validity; 
	} 
}
