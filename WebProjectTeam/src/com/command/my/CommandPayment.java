package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import vo.PaymentInfoVO;

public class CommandPayment implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		String email = (String) session.getAttribute("email3");
		int price = Integer.parseInt(request.getParameter("roomPrice"));
		
		DAO tidao = new DAO();
		PaymentInfoVO tpvo = new PaymentInfoVO();
		
		tpvo = tidao.getPaymentInfo(email, price);
		
		request.setAttribute("tpvo", tpvo);
		
		
	}

}
