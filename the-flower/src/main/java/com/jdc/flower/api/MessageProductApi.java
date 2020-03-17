package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.MessageProduct;
import com.jdc.flower.service.MessageProductService;

@RestController
@RequestMapping("message-product")
public class MessageProductApi extends BaseController<MessageProduct, Long>{

	@Autowired
	public MessageProductApi(MessageProductService service) {
		super(service);
	}

}
