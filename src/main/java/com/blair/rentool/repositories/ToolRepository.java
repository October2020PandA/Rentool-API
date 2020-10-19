package com.blair.rentool.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.blair.rentool.models.Tool;

@Repository
public interface ToolRepository extends PagingAndSortingRepository<Tool, Long>{
	List<Tool> findAll();
	List<Tool> findByNameContaining(String searchName);
}
