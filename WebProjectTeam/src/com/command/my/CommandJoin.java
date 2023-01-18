package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

// 회원가입 서비스
public class CommandJoin implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String passw = request.getParameter("passw");
		String tel = request.getParameter("tel");
		
				
				
		DAO tidao = null;
			
		tidao = new DAO();
				
		tidao.insertUser(name,email,passw,tel);
		
	}

}
