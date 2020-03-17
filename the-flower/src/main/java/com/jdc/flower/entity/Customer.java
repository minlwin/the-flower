package com.jdc.flower.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Customer extends Account {

	private LocalDate dob;

	private Gender gender;

	@OneToMany(mappedBy = "customer")
	private List<Transport> transports;
	
	public Customer() {
		transports = new ArrayList<Transport>();
	}	
	
	public enum Gender {
		Male, Female
	}

}