package com.sist.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.*;
import com.sist.vo.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CouponModel {
	@RequestMapping("coupon/list.do")
	public String coupon_list(HttpServletRequest request, HttpServletResponse response) {
		String page = request.getParameter("page");
		if(page==null) page = "1";
		int curpage = Integer.parseInt(page);
		
		Map map = new HashMap();
		int rowSize = 12;
		int start = (rowSize * curpage) - (rowSize - 1);
		int end = rowSize * curpage;
		
		map.put("start", start);
		map.put("end", end);
		List<CampingVO> list = CouponDAO.couponListData(map);
		int totalpage = CouponDAO.couponTotalPage();
		
		final int BLOCK = 10;
		int startPage = ((curpage - 1) / BLOCK * BLOCK) + 1;
		int endPage = ((curpage - 1) / BLOCK * BLOCK) + BLOCK;
		if(endPage > totalpage) endPage = totalpage;
		
		request.setAttribute("list", list);
		request.setAttribute("curpage", curpage);
		request.setAttribute("totalpage", totalpage);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("main_jsp", "../coupon/list.jsp");
		
		return "../main/main.jsp";
	}
	
	@RequestMapping("coupon/detail.do")
	public String coupon_detail(HttpServletRequest request, HttpServletResponse response) {
		
		return "../main/main.jsp";
	}
}
