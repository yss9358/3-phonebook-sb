package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhoneService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;
import com.javaex.vo.TeamVo;

@RestController
public class PhoneController {

	@Autowired
	private PhoneService phoneService;
	
	
	// 전체 리스트 불러오기
	@GetMapping("/phone3/list")
	public JsonResult list() {
		List<PersonVo> list = phoneService.exeList();
		if(list != null) {
			return JsonResult.success(list);
		} else {
			return JsonResult.fail("리스트를 불러오는데 실패했습니다.");
		}
	}

	// 그룹 리스트 불러오기 
	@GetMapping("/phone3/teams")
	public JsonResult teamlist() {
		List<TeamVo> list = phoneService.exeTeamList();
		if(list != null) {
			return JsonResult.success(list);
		} else {
			return JsonResult.fail("리스트를 불러오는데 실패했습니다.");
		}
	}
	
	// 그룹 추가 
	@PostMapping("/phone3/teams")
	public JsonResult addTeam(@RequestBody Map<String, String> map) {
		String teamName = map.get("teamName");
		int count = phoneService.exeInsertTeam(teamName);
		if(count == 1) {
			return JsonResult.success(count);
		} else {
			return JsonResult.fail("그룹명을 변경해주세요.");
		}
	}
	
	// 그룹 삭제
	@DeleteMapping("/phone3/teams/{no}")
	public JsonResult delete(@PathVariable int no) {
		int count = phoneService.exeDelete(no);
		if(count == 1) {
			return JsonResult.success(count);
		} else {
			return JsonResult.fail("데이터 오류");
		}
	}
	
	
}
