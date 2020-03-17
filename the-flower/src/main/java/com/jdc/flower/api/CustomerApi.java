package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Customer;
import com.jdc.flower.service.CustomerService;

@RestController
@RequestMapping("customers")
public class CustomerApi extends BaseController<Customer, Integer> {

	@Autowired
	public CustomerApi(CustomerService service) {
		super(service);
	}
}
