package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Account;
import com.jdc.flower.service.AccountService;

@RestController
@RequestMapping("accounts")
public class AccountApi extends BaseController<Account, Integer>{

	@Autowired
	public AccountApi(AccountService service) {
		super(service);
	}
}
