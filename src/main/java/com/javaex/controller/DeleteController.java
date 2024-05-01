package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.DeleteService;

@RestController
public class DeleteController {
	
	@Autowired
	private DeleteService deleteService;
	
	//삭제
	@GetMapping(value="phone3/delete/{personNo}")
	public int delete(@PathVariable(value="personNo")int no) {
		System.out.println("DeleteController.delete");
		
		int count = deleteService.exeDelete(no);
		
		return count;
	}

}
