package com.sist.model;

import java.util.List;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.MainDAO;
import com.sist.vo.CampingVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MainModel {
	@RequestMapping("main/main.do")
	public String main_main(HttpServletRequest request, HttpServletResponse response) {
		List<CampingVO> list = MainDAO.mainCampingData();
		
		request.setAttribute("list", list);
		request.setAttribute("main_jsp", "../main/home.jsp");
		return "../main/main.jsp";
	}
}
