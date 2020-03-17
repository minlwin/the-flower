package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.OrderDetails;
import com.jdc.flower.service.OrderDetailsService;

@RestController
@RequestMapping("order-details")
public class OrdersDetailsApi extends BaseController<OrderDetails, Long> {

	@Autowired
	public OrdersDetailsApi(OrderDetailsService service) {
		super(service);
	}

}
