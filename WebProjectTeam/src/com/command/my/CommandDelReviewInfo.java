package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

public class CommandDelReviewInfo implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		DAO tidao4 = null;
		String tit3 = request.getParameter("tit");
		
		tidao4 = new DAO();
			
		tidao4.delete_nametelgb(tit3);
		
	}

}
