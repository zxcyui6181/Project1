package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

public class CommandEditUserInfo implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String passw = request.getParameter("passw");
		String semail = request.getParameter("semail");

		
		DAO tidao3 = null;
			
		tidao3 = new DAO();
				
		tidao3.updateUserInfo(name,email,tel,passw,semail);
		
	}

}
