package com.jdc.flower.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.flower.base.BaseService;
import com.jdc.flower.entity.Category;
import com.jdc.flower.repo.CategoryRepo;

@Service
public class CategoryService extends BaseService<Category, Integer> {

	@Autowired
	public CategoryService(CategoryRepo repo) {
		super(repo);
	}

}
