package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.MessageProduct;
import com.jdc.flower.repo.MessageProductRepo;

@Service
public class MessageProductService extends BaseService<MessageProduct, Long>{

	@Autowired
	public MessageProductService(MessageProductRepo repo) {
		super(repo);
	}

}
