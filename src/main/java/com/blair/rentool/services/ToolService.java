package com.blair.rentool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public Tool findToolById(Long id) {
		return toolRepo.findById(id).orElse(null);
	}
	
	public Tool createTool(Tool tool) {
		return toolRepo.save(tool);
	}
	
	public void deleteTool(Long id) {
		toolRepo.deleteById(id);
	}
	
	public List<Tool> searchTool(String searchName) {
		return toolRepo.findByNameContaining(searchName);
	}
}
