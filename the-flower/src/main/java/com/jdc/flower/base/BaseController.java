package com.jdc.flower.base;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jdc.flower.utils.ItemNotFoundException;

public class BaseController<T, ID extends Number> {

	private BaseService<T, ID> service;
	
	public BaseController(BaseService<T, ID> service) {
		this.service = service;
	}
	
	@GetMapping
	public List<T> index() {
		return service.findAll();
	}
	
	@PostMapping
	public T create(@RequestBody T data) {
		return service.save(data);
	}
	
	@PutMapping
	public T update(@RequestBody T data) {
		return service.save(data);
	}
	
	@GetMapping("{id://d+}")
	public T findById(@PathVariable ID id) {
		return service.findById(id).orElseThrow(() -> new ItemNotFoundException());
	}
	
	@DeleteMapping("{id://d+}")
	public void deleteById(ID id) {
		service.deleteById(id);
	}
}
