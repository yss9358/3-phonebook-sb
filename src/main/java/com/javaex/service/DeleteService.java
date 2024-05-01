package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.DeleteDao;

@Service
public class DeleteService {
	
	@Autowired
	private DeleteDao deleteDao;
	
	//삭제
	public int exeDelete(int no) {
		System.out.println("DeleteService.exeRemove");
		
		int count = deleteDao.personDelete(no);
		
		return count;
	}

}
