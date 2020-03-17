package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.MessageOrders;
import com.jdc.flower.repo.MessageOrdersRepo;

@Service
public class MessageOrdersService extends BaseService<MessageOrders, Long> {

	@Autowired
	public MessageOrdersService(MessageOrdersRepo repo) {
		super(repo);
	}

}
