package com.jdc.flower.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class OrderDetails {

	public OrderDetails() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	public int quentity;

	public int unitPrice;

	@ManyToOne
	private Orders orders;

	@ManyToOne
	private Product product;

}