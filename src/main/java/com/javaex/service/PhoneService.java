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
	
	public List<PersonVo> exeList() {
		return phoneDao.list();	
	}
	
	public List<TeamVo> exeTeamList() {
		return phoneDao.teamList();
	}

}
