package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhoneService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;
import com.javaex.vo.TeamVo;

@RestController
public class PhoneController {

	@Autowired
	private PhoneService phoneService;
	
	@GetMapping("/phone3/list")
	public JsonResult list() {
		List<PersonVo> list = phoneService.exeList();
		if(list != null) {
			return JsonResult.success(list);
		} else {
			return JsonResult.fail("리스트를 불러오는데 실패했습니다.");
		}
	}
	
	@GetMapping("/phone3/team")
	public JsonResult teamlist() {
		List<TeamVo> list = phoneService.exeTeamList();
		if(list != null) {
			return JsonResult.success(list);
		} else {
			return JsonResult.fail("리스트를 불러오는데 실패했습니다.");
		}
	}
	
}
