package com.jdc.flower.entity;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Embeddable
@Data
public class SecurityInfo {

	public SecurityInfo() {
	}

	@CreatedDate
	private LocalDateTime creation;

	@LastModifiedDate
	private LocalDateTime modification;

	@CreatedBy
	private String createUser;

	@LastModifiedBy
	private String modifyUser;

}