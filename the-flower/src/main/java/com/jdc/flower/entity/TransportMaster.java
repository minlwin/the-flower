package com.jdc.flower.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TransportMaster {

	public TransportMaster() {
		security = new SecurityInfo();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String township;

	private String state;

	private int fees;

	private SecurityInfo security;

}