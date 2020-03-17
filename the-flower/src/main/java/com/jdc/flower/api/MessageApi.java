package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Message;
import com.jdc.flower.service.MessageService;

@RestController
@RequestMapping("messages")
public class MessageApi extends BaseController<Message, Long>{

	@Autowired
	public MessageApi(MessageService service) {
		super(service);
	}

}
