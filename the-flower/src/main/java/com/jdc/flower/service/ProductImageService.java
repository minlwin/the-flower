package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.ProductImage;
import com.jdc.flower.repo.ProductImageRepo;

@Service
public class ProductImageService extends BaseService<ProductImage, Long> {

	@Autowired
	public ProductImageService(ProductImageRepo repo) {
		super(repo);
	}

}
