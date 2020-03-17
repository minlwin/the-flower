package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Transport;
import com.jdc.flower.repo.TransportRepo;

@Service
public class TransportService extends BaseService<Transport, Long>{

	@Autowired
	public TransportService(TransportRepo repo) {
		super(repo);
	}

}
