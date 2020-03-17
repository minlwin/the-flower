package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Customer;
import com.jdc.flower.repo.CustomerRepo;

@Service
public class CustomerService extends BaseService<Customer, Integer>{

	@Autowired
	public CustomerService(CustomerRepo repo) {
		super(repo);
	}

}
