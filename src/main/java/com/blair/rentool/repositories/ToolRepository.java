package com.blair.rentool.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blair.rentool.models.Tool;

@Repository
public interface ToolRepository extends CrudRepository<Tool, Long>{
	List<Tool> findAll();
}
