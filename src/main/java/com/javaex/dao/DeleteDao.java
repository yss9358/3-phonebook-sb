package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteDao {
	
	@Autowired
	private SqlSession SqlSession;
	
	public int personDelete(int no){
		System.out.println("DeleteDao.deletecontent()");
		
		int count = SqlSession.delete("phone.delete", no);
		
		return count;
	}

}
