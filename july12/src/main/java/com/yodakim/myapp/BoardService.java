package com.yodakim.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
//	Controller -> Service -> DAO -> sqlSession -> Data Base
	
}
