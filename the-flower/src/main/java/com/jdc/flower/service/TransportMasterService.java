package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.TransportMaster;
import com.jdc.flower.repo.TransportMasterRepo;

@Service
public class TransportMasterService extends BaseService<TransportMaster, Integer> {

	@Autowired
	public TransportMasterService(TransportMasterRepo repo) {
		super(repo);
	}

}
