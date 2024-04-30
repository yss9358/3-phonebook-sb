package com.javaex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.util.JsonResult;

@RestController
@RequestMapping("phone3/list")
public class SolListController {

	@GetMapping("main")
	public JsonResult mainList() {
		System.out.println("SolListController.mainList()");
		
		return JsonResult.success("데이터보내기");
	}
}
