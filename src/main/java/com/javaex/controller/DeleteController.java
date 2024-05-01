package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.DeleteService;

@RestController
public class DeleteController {
	
	@Autowired
	private DeleteService deleteService;
	
	//삭제
	@DeleteMapping(value="api/phones/{personNo}")
	public int delete(@RequestParam(value="personNo")int no) {
		System.out.println("DeleteController.delete");
		
		int count = deleteService.exeDelete(no);
		
		return count;
	}

}
