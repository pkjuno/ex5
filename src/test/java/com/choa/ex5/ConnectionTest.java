package com.choa.ex5;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConnectionTest extends MyAbstarctTestUnit{

	@Autowired
	private SqlSession sql;
	
	@Test
	public void test() {
		assertNotNull(sql);
	}

}
