package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.TransportMaster;
import com.jdc.flower.service.TransportMasterService;

@RestController
@RequestMapping("transport-masters")
public class TransportMasterApi extends BaseController<TransportMaster, Integer> {

	@Autowired
	public TransportMasterApi(TransportMasterService service) {
		super(service);
	}

}
