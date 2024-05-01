package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;
import com.javaex.vo.TeamVo;

@Repository
public class YsDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int personInsert(PersonVo personVo) {
		System.out.println("YsDao.personInsert()");
		
		int count = sqlSession.insert("ys.insert", personVo);
		
		return count;
	}

	public List<PersonVo> personSelect(String hp) {
		System.out.println("YsDao.personInsert()");
		
		List<PersonVo> personList = sqlSession.selectList("ys.select", hp);
		
		return personList;
	}

	public List<TeamVo> teamSelect() {
		System.out.println("YsDao.teamSelect()");
		
		List<TeamVo> teamList = sqlSession.selectList("ys.selectTeam");
		
		return teamList;
	}

	public int starUpdate(PersonVo personVo) {
		System.out.println("YsDao.starUpdate()");
		
		int count = sqlSession.update("ys.updateStar", personVo);
		
		return count;
	}

}
