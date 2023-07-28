package org.verizon.ConsumerServiceApi.model;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ordering {
	
	@Id
	private int order_id;
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Catalogmodel catalogmodel;
	
	public Ordering() {
			}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public Catalogmodel getCatalogmodel() {
		return catalogmodel;
	}
	public void setCatalogmodel(Catalogmodel catalogmodel) {
		this.catalogmodel = catalogmodel;
	}
	
	

}
