package com.command.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import vo.ReviewInfoVO;

public class CommandReview implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		DAO tidao111 = null;
		
		
		tidao111 = new DAO();
		
		
		ArrayList <ReviewInfoVO> list2 = null;
		list2 = tidao111.getReviewInfo();
		
		request.setAttribute("list2", list2); 
		
	}
	
	

}
