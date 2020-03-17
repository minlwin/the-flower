package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Product;
import com.jdc.flower.repo.ProductRepo;

@Service
public class ProductService extends BaseService<Product, Integer>{

	@Autowired
	public ProductService(ProductRepo repo) {
		super(repo);
	}

}
