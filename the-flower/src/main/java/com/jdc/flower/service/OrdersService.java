package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Orders;
import com.jdc.flower.repo.OrdersRepo;

@Service
public class OrdersService extends BaseService<Orders, Long> {

	@Autowired
	public OrdersService(OrdersRepo repo) {
		super(repo);
	}

}
