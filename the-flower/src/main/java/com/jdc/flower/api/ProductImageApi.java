package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.ProductImage;
import com.jdc.flower.service.ProductImageService;

@RestController
@RequestMapping("product-images")
public class ProductImageApi extends BaseController<ProductImage, Long> {

	@Autowired
	public ProductImageApi(ProductImageService service) {
		super(service);
	}

}
