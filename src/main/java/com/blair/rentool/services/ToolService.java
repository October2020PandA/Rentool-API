package com.blair.rentool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blair.rentool.repositories.ToolRepository;

@Service
public class ToolService {
	@Autowired
	private ToolRepository toolRepo;
	
	
}
