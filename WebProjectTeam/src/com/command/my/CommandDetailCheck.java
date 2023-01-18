package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import vo.DetailVO;

public class CommandDetailCheck implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String hname = request.getParameter("hname");
		String roomSize = request.getParameter("roomSize");
		int price = Integer.parseInt(request.getParameter("price"));
		
		HttpSession session = request.getSession();
		int renum = (int) session.getAttribute("renum");
		
		DAO tidao = null;
		tidao = new DAO();
		DetailVO alist1 = null;
		tidao.insertRenum(renum, hname, roomSize, price);
		alist1 = tidao.viewCheckInfo(hname, roomSize, price);
		
		request.setAttribute("alist1", alist1);
		
	}

}
