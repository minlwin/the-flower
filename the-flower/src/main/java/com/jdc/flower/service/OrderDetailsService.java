package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.OrderDetails;
import com.jdc.flower.repo.OrderDetailsRepo;

@Service
public class OrderDetailsService extends BaseService<OrderDetails, Long>{

	@Autowired
	public OrderDetailsService(OrderDetailsRepo repo) {
		super(repo);
	}

}
