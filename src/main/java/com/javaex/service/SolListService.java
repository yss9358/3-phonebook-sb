package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.SolListDao;
import com.javaex.vo.PersonVo;

@Service
public class SolListService {

	@Autowired
	private SolListDao listDao;

	// 전체리스트
	public List<PersonVo> exeListAll() {
		System.out.println("SolListService.exeListAll()");
		List<PersonVo> personList = listDao.selectList();
		return personList;
	}

	// 즐겨찾기 리스트
	public List<PersonVo> exeListStar() {
		System.out.println("SolListService.exeListStar()");
		List<PersonVo> personList = listDao.selectStarList();
		return personList;
	}

	// 그룹 리스트
	public List<PersonVo> exeListGroup(int groupNo) {
		System.out.println("SolListService.exeListStar()");
		List<PersonVo> personList = listDao.selectGroupList(groupNo);
		return personList;
	}

	// 검색
	public List<PersonVo> exeListFind(String keyword) {
		System.out.println("SolListService.exeListFind()");
		List<PersonVo> personList = listDao.selectFindList(keyword);
		return personList;
	}
	
	//즐겨찾기
	public int exeStarUpdate(int personNo) {
		System.out.println("SolListService.exeStarUpdate()");
		int count = listDao.updateStar(personNo);
		return count;
	}

}
