package com.yodakim.myapp;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Controller: Controller
 * @Service: Service
 * @Repository: DAO
 * 
 **/

@Repository
public class BoardDAO {
//	DB와 연결합니다.
	@Autowired
	private SqlSession sqlSession;
	
	
}
