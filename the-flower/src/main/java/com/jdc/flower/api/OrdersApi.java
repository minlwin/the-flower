package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Orders;
import com.jdc.flower.service.OrdersService;

@RestController
@RequestMapping("orders")
public class OrdersApi extends BaseController<Orders, Long>{

	@Autowired
	public OrdersApi(OrdersService service) {
		super(service);
	}

}
