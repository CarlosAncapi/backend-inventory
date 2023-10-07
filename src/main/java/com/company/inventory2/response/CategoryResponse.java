package com.company.inventory2.response;

import java.util.List;

import com.company.inventory2.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	private List<Category> category;
}
