package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class JwEditDao {

	@Autowired
	private SqlSession sqlSession;

	// 한 명 정보 데려오기
	public PersonVo selectOne(int no) {
		System.out.println("JwEditDao.selectOne()");
		
		PersonVo phoneVo = sqlSession.selectOne("jwedit.selectOne", no);
		System.out.println(phoneVo);
		return phoneVo;
	}

	// 수정
	public int modifyPhone(PersonVo personVo) {
		System.out.println("JwEditDao.modifyPhone()");
		
		int count = sqlSession.update("jwedit.update", personVo);
		System.out.println(count);
		return count;
	}

}
