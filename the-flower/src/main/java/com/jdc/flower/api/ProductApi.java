package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Product;
import com.jdc.flower.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductApi extends BaseController<Product, Integer> {

	@Autowired
	public ProductApi(ProductService service) {
		super(service);
	}

}
