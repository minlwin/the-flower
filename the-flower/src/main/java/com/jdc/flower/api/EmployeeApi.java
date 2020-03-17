package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Employee;
import com.jdc.flower.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeApi extends BaseController<Employee, Integer> {

	@Autowired
	public EmployeeApi(EmployeeService service) {
		super(service);
	}

}
