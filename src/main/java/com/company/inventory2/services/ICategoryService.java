package com.company.inventory2.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory2.model.Category;
import com.company.inventory2.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
}
