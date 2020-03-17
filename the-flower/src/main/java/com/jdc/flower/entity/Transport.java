package com.jdc.flower.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Transport {

	public Transport() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Contact contact;

	@ManyToOne
	private TransportMaster master;

	@ManyToOne
	private Customer customer;

}