package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.JwEditDao;
import com.javaex.vo.PersonVo;

@Service
public class JwEditService {

	@Autowired
	private JwEditDao jwEditDao;

	// 데이터 한 개 가져오기
	public PersonVo exeModifyForm(int personNo) {
		
		System.out.println("JwEditService.exeModifyPhone()");
		
		PersonVo personVo = jwEditDao.selectOne(personNo);
		
		return personVo;
	}

	// 수정
	public int exeModifyPhone(PersonVo personVo) {
		System.out.println("JwEditService.exeModifyPhone()");
		
		int count = jwEditDao.modifyPhone(personVo);
		
		return count;
	}

}
