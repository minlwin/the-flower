package com.jdc.flower.entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Contact {

	private String phone;

	private String email;

	private String address;

}