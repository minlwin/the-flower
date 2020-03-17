package com.jdc.flower.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ItemNotFoundAdvice {

	@ExceptionHandler(ItemNotFoundException.class)
	public ResponseEntity<?> handle() {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
