package com.blair.rentool.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.blair.rentool.models.Tool;

@Repository
public interface ToolRepository extends PagingAndSortingRepository<Tool, Long>{
	List<Tool> findAll();
	Page<Tool> findByNameContaining(String searchName, Pageable pageable);
}
