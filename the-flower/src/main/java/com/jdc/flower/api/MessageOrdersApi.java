package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.MessageOrders;
import com.jdc.flower.service.MessageOrdersService;

@RestController
@RequestMapping("message-orders")
public class MessageOrdersApi extends BaseController<MessageOrders, Long> {

	@Autowired
	public MessageOrdersApi(MessageOrdersService service) {
		super(service);
	}

}
