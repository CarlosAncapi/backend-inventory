package com.company.inventory2.DAO;

import org.springframework.data.repository.CrudRepository;

import com.company.inventory2.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
