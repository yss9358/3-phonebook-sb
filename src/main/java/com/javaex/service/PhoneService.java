package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;
import com.javaex.vo.TeamVo;

@Service
public class PhoneService {

	@Autowired
	private PhoneDao phoneDao;
	
	// 전체 리스트 불러오기
	public List<PersonVo> exeList() {
		return phoneDao.list();	
	}
	
	// 그룹 리스트 불러오기
	public List<TeamVo> exeTeamList() {
		return phoneDao.teamList();
	}
	
	// 그룹 추가
	public int exeInsertTeam(String teamName) {
		TeamVo vo = phoneDao.teamCheck(teamName);
		if(vo == null) {
			return phoneDao.insertTeam(teamName);
		} else {
			return -1;
		}
	}
	
	// 그룹 삭제 + 기본값으로 변경
	public int exeDelete(int no) {
		int count = phoneDao.changeTeam(no);
		if(count != -1) {
			int del = phoneDao.deleteTeam(no);
			return del;
		} else {
			return -1;
		}
	}
	
	// 그룹 이름 수정 + 체크
	public int exeUpdate(TeamVo vo) {
		TeamVo checkVo = phoneDao.teamCheck(vo.getTeamName());
		if(checkVo == null) {
			int count = phoneDao.updateTeam(vo);
			return count;
		} else {
			return -1;
		}
	}
}
