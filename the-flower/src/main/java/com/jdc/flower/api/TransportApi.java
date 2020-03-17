package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Transport;
import com.jdc.flower.service.TransportService;

@RestController
@RequestMapping("transports")
public class TransportApi extends BaseController<Transport, Long> {

	@Autowired
	public TransportApi(TransportService service) {
		super(service);
	}

}
