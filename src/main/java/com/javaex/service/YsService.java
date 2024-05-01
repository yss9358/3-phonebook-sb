package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.YsDao;
import com.javaex.vo.PersonVo;
import com.javaex.vo.TeamVo;

@Service
public class YsService {
	
	@Autowired
	private YsDao ysDao;

	public int exeInsert(PersonVo personVo) {
		System.out.println("YsService.exeInsert()");

		int count = ysDao.personInsert(personVo);

		return count;
	}

	public List<PersonVo> exeSearch(String hp) {
		System.out.println("YsService.exeSearch()");
		//System.out.println("ser: "+hp);
		List<PersonVo> personList = ysDao.personSelect(hp);
		
		return personList;
	}

	public List<TeamVo> exeTeam() {
		System.out.println("YsService.exeTeam()");
		
		List<TeamVo> teamList = ysDao.teamSelect();
		
		return teamList;
	}

	public int exeStar(int personNo) {
		System.out.println("YsService.exeStar()");
		
		int count = ysDao.starUpdate(personNo);
		
		return count;
	}

}
