package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.YsService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;
import com.javaex.vo.TeamVo;

@RestController
public class YsController {

	@Autowired
	private YsService ysService;
	
	@PostMapping("/phone3/insert")
	public JsonResult insert(@RequestBody PersonVo personVo) {
		System.out.println("YsController.insert()");

		System.out.println(personVo.toString());

		int count = ysService.exeInsert(personVo);

		return JsonResult.success(count);
	}
	
	@GetMapping("/phone3/search/{phoneNumber}")
	public JsonResult search(@PathVariable(value="phoneNumber") String hp) {
		System.out.println("YsController.search()");

		hp = "%" + hp + "%";
		
		//System.out.println(hp);
		List<PersonVo> personList = ysService.exeSearch(hp);
		//System.out.println(personList);

		return JsonResult.success(personList);
	}
	
	@GetMapping("/phone3/teamlist")
	public JsonResult team() {
		System.out.println("YsController.group()");

		List<TeamVo> teamList = ysService.exeTeam();

		System.out.println(teamList);
		return JsonResult.success(teamList);
	}
	
	
}
