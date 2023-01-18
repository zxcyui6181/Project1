package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

// 관리자모드 리뷰작성 서비스
public class CommandAdminReviewWriting implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String tit = request.getParameter("tit");
		String name = request.getParameter("name");
		String tda = request.getParameter("tda");
		String nayoung = request.getParameter("nayoung");
		int cou = Integer.parseInt(request.getParameter("cou"));
		
		
				
				
		DAO tidao = null;
			
		tidao = new DAO();
				
		tidao.insertReview(tit,name,tda,nayoung,cou);
	}

}
