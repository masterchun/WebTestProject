package com.sist.dao;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sist.commons.*;
import com.sist.vo.*;

public class MainDAO {
	private static SqlSessionFactory ssf;
	   
	static {
		   ssf=CreateSqlSessionFactory.getSsf();
	}
	
	public static List<CampingVO> mainCampingData() {
		SqlSession session = ssf.openSession();
		List<CampingVO> list = session.selectList("mainCampingData");
		session.close();
		return list;
	}
}