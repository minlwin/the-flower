package com.jdc.flower.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class MessageOrders extends Message {

	public MessageOrders() {
	}

	@ManyToOne
	private Orders orders;

}