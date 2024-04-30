package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.javaex.service.PhoneService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@Controller
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
}