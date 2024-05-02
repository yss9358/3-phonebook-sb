package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.JwEditService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
public class JwEditController {

	@Autowired
	private JwEditService jwEditService;

	// 수정폼
	@GetMapping("phone3/phones/{personNo}")
	public JsonResult modifyForm(@PathVariable(value="personNo") int personNo) {
		System.out.println("JwEditController.modifyInfo()");
		//System.out.println(personNo);
		
		PersonVo phoneVo  = jwEditService.exeModifyForm(personNo);
		
		return JsonResult.success(phoneVo);
	}

	// 수정
	@PutMapping("phone3/phones/modify/{personNo}")
	public JsonResult modifyInfo( @RequestBody PersonVo personVo) {
		System.out.println("JwEditController.modifyInfo2()");
		
		System.out.println(personVo);
		
		jwEditService.exeModifyPhone(personVo);
				
		return JsonResult.success(personVo);
	}

}
