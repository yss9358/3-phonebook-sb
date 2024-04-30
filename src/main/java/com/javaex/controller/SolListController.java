package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.SolListService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
@RequestMapping("phone3/list")
public class SolListController {

	@Autowired
	private SolListService listService;

	// 전체리스트
	@GetMapping("main")
	public JsonResult mainList() {
		System.out.println("SolListController.mainList()");
		List<PersonVo> personList = listService.exeListAll();
//		System.out.println(personList);
		return JsonResult.success(personList);
	}

	// 즐겨찾기 리스트
	@GetMapping("star")
	public JsonResult starList() {
		System.out.println("SolListController.starList()");
		List<PersonVo> personList = listService.exeListStar();
		return JsonResult.success(personList);
	}

	// 그룹 리스트
	@GetMapping("group/{no}")
	public JsonResult groupList(@PathVariable(value="no") int groupNo) {
		System.out.println("SolListController.starList()");
		List<PersonVo> personList = listService.exeListGroup(groupNo);
		System.out.println(personList);
		return JsonResult.success(personList);
	}

	// 검색리스트(보류)
	@PostMapping("find")
	public JsonResult findList() {
		System.out.println("SolListController.mainList()");
		List<PersonVo> personList = listService.exeListFind();
		return JsonResult.success(personList);
	}
	
	//즐겨찾기 추가삭제
	@PostMapping("star/{no}")
	public JsonResult star(@PathVariable(value="no") int personNo) {
		System.out.println("SolListController.star()");
		return JsonResult.success("");
	}
}
