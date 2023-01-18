package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

// 관리자 개인정보 삭제 서비스
public class CommandDelUserInfo implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		DAO tidao4 = null;
		String email3 = request.getParameter("email");
		
		tidao4 = new DAO();
			
		tidao4.delUserInfo(email3);
		
	}

}
