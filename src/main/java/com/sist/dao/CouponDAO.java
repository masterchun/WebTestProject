package com.sist.dao;

import com.sist.commons.*;
import com.sist.vo.*;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class CouponDAO {
	private static SqlSessionFactory ssf;
	
	static {
		ssf = CreateSqlSessionFactory.getSsf();
	}
	
	public static List<CampingVO> couponListData(Map map) {
		SqlSession session = ssf.openSession();
		List<CampingVO> list = session.selectList("couponListData", map);
		session.close();
		return list;
	}
	
	public static int couponTotalPage() {
		SqlSession session = ssf.openSession();
		int total = session.selectOne("couponTotalPage");
		session.close();
		return total;
	}
}
