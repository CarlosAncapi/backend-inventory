package com.company.inventory2.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory2.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
}
