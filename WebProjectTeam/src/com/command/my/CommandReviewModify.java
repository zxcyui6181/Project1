package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

// 리뷰 수정 서비스
public class CommandReviewModify implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String tit = request.getParameter("tit");
		String name = request.getParameter("name");
		String tda = request.getParameter("tda");
		String nayoung = request.getParameter("nayoung");
		String stit = request.getParameter("stit");

		
		DAO tidao3 = null;
			
		tidao3 = new DAO();
				
		tidao3.updateReview(tit,name,tda,nayoung,stit);
		
	}

}
