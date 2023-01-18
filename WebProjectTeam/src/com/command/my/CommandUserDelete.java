package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

public class CommandUserDelete implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		DAO tidao = null;
		tidao = new DAO();
		String email = request.getParameter("email");
		String passw  = request.getParameter("passw");
		
		tidao.deleteUser(email, passw);
		
		
		
	}

}
