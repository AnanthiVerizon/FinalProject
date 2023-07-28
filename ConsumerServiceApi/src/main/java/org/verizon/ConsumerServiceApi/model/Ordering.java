package org.verizon.ConsumerServiceApi.model;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;

@Entity
public class Ordering {
	
	@Id
	private int order_id;
	private int plan_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public Ordering() {
		 
	}
	
	
	

}
