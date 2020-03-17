package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Message;
import com.jdc.flower.repo.MessageRepo;

@Service
public class MessageService extends BaseService<Message, Long>{

	@Autowired
	public MessageService(MessageRepo repo) {
		super(repo);
	}

}
