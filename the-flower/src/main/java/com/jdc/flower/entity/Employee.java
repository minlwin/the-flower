package com.jdc.flower.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Employee extends Account {

	public Employee() {
	}

	private LocalDate entranceDate;

	private LocalDate retireDate;

}