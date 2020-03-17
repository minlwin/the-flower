package com.jdc.flower.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.flower.base.BaseController;
import com.jdc.flower.entity.Category;
import com.jdc.flower.service.CategoryService;

@RestController
@RequestMapping("categories")
public class CategoryApi extends BaseController<Category, Integer>{

	@Autowired
	public CategoryApi(CategoryService service) {
		super(service);
	}

}
