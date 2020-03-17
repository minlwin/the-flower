package com.jdc.flower.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Product {

	public Product() {
		images = new ArrayList<>();
		security = new SecurityInfo();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String coverImage;

	private int price;

	private String description;

	private SecurityInfo security;

	@ManyToOne
	private Category category;

	@OneToMany(mappedBy = "product")
	private List<ProductImage> images;

}