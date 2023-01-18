package com.command.my;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;

// 로그인 서비스
public class CommandLogin implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();
		DAO tdao3 = null;
		String email3 = request.getParameter("email");
		String password3 = request.getParameter("passw");
		String str = null;
		
		try {
			tdao3 = new DAO();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}    
		
		boolean b1 = tdao3.loginConfirm(email3, password3);
		
		if(email3.equals("admin@naver.com")&&password3.equals("1234")) {
			str = "adminMain.jsp";
			session.setAttribute("email3", email3);
		}else {
			
			if(b1 == true) {
				str = "main.jsp";
				session.setAttribute("passw3", password3);
				session.setAttribute("email3", email3);
			}else {
				str = "login.jsp"; 
				writer.println("<script>alert('아이디 또는 비밀번호를 확인하세요');location.href='login.jsp';</script>"); 
				writer.close();
			}
		
		}
		
		request.setAttribute("str", str);
		
	}
}


