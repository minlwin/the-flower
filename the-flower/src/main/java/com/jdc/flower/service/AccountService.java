package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Account;
import com.jdc.flower.repo.AccountRepo;

@Service
public class AccountService extends BaseService<Account, Integer>{

	
	@Autowired
	public AccountService(AccountRepo repo) {
		super(repo);
	}

}
