package com.jdc.flower.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Orders {

	public Orders() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private LocalDate orderDate;

	private LocalDate sendDate;

	private LocalTime sendTimeFrom;

	private LocalTime sendTimeTo;

	private Status status;

	private int transportFees;

	private int tax;

	@ManyToOne
	private Customer customer;

	@OneToMany(mappedBy = "orders")
	private List<OrderDetails> details;

	@ManyToOne
	private Transport transport;

	public enum Status {
		Ordered,
		Remind,
		Paid,
		Received,
		Finished,
		Cancel
	}

}