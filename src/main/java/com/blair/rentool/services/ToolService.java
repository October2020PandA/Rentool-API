package com.blair.rentool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.blair.rentool.models.Tool;
import com.blair.rentool.repositories.ToolRepository;

@Service
public class ToolService {
	@Autowired
	private ToolRepository toolRepo;
	
	public List<Tool> findAllTools() {
		return toolRepo.findAll();
	}
	
	public Page<Tool> findAllPages(int pageNumber) {
		Pageable pageable = PageRequest.of(pageNumber-1, 8);
		return toolRepo.findAll(pageable);
	}
	
	public Tool findToolById(Long id) {
		return toolRepo.findById(id).orElse(null);
	}
	
	public Tool createTool(Tool tool) {
		return toolRepo.save(tool);
	}
	
	public void deleteTool(Long id) {
		toolRepo.deleteById(id);
	}
	
	public Page<Tool> searchTool(String searchName, int pageNumber) {
		Pageable pageable = PageRequest.of(pageNumber-1, 8);
		return toolRepo.findByNameContaining(searchName, pageable);
	}
}
