package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.YsDao;
import com.javaex.vo.PersonVo;

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
		
		List<PersonVo> personList = ysDao.personSelect(hp);
		
		return personList;
	}

}
