package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;
import com.javaex.vo.TeamVo;

@Repository
public class PhoneDao {
	
	@Autowired
	private SqlSession sqlSession;

	// 전체 리스트 불러오기
	public List<PersonVo> list() {
		return sqlSession.selectList("phone.list");
	}
	
	// 그룹 리스트 불러오기
	public List<TeamVo> teamList() {
		return sqlSession.selectList("phone.teamList");
	}
	
	// 그룹 추가
	public int insertTeam(String teamName) {
		return sqlSession.insert("phone.insertTeam", teamName);
	}
	
	// 그룹 중복 확인
	public TeamVo teamCheck(String teamName) {
		return sqlSession.selectOne("phone.teamCheck",teamName);
	}
	
	// 그룹 기본값으로 변경
	public int changeTeam(int no) {
		int count = sqlSession.update("phone.changeTeam", no);
		return count;
	}
	
	// 그룹 삭제
	public int deleteTeam(int no) {
		int count = sqlSession.delete("phone.deleteTeam",no);
		return count;
	}
}
