package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class SolListDao {

	@Autowired
	private SqlSession sqlSession;

	// 전체리스트
	public List<PersonVo> selectList() {
		System.out.println("SolListDao.selectList()");
		List<PersonVo> personList = sqlSession.selectList("sol.selectAll");
		return personList;
	}

	// 즐겨찾기 리스트
	public List<PersonVo> selectStarList() {
		System.out.println("SolListDao.selectStarList()");
		List<PersonVo> personList = sqlSession.selectList("sol.selectStar");
		return personList;
	}

	// 그룹 리스트
	public List<PersonVo> selectGroupList() {
		System.out.println("SolListDao.selectGroupList()");
		List<PersonVo> personList = sqlSession.selectList("sol.selectGroup");
		return personList;
	}

	// 검색
	public List<PersonVo> selectFindList() {
		System.out.println("SolListDao.selectFindList()");
		List<PersonVo> personList = sqlSession.selectList("sol.selectFind");
		return personList;
	}

}
