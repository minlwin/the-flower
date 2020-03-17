package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Employee;
import com.jdc.flower.repo.EmployeeRepo;

@Service
public class EmployeeService extends BaseService<Employee, Integer> {

	@Autowired
	public EmployeeService(EmployeeRepo repo) {
		super(repo);
	}

}
