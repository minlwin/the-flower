package com.jdc.flower.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Message {

	public Message() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String title;

	private String details;

	private Status status;

	private LocalDateTime sendDate;

	private LocalDateTime readDate;


	@ManyToOne
	private Account toUser;
	@ManyToOne
	private Account fromUser;
	
	@ManyToOne
	private Message owner;

	public enum Status {
		New,
		Read
	}

}