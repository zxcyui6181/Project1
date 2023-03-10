package com.frontcontroller.my;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.command.my.CommandMemberManagement;
import com.command.my.CommandDelUserInfo;
import com.command.my.CommandDelReservationInfo;
import com.command.my.CommandDelReviewInfo;
import com.command.my.CommandDetailCheck;
import com.command.my.CommandEditUserInfo;
import com.command.my.CommandAdminReservation;
import com.command.my.CommandAdminReview;
import com.command.my.CommandAdminReviewRetouch;
import com.command.my.CommandAdminReviewWriting;
import com.command.my.CommandEditReservation;
import com.command.my.CommandEditReservationInfo;
import com.command.my.CommandUserInfo;
import com.command.my.CommandHotelList;
import com.command.my.CommandImpl;
import com.command.my.CommandJoin;
import com.command.my.CommandLogin;
import com.command.my.CommandPayment;
import com.command.my.CommandReservation;
import com.command.my.CommandReservationDetail;
import com.command.my.CommandReview;
import com.command.my.CommandReviewModify;
import com.command.my.CommandReviewRetouch;
import com.command.my.CommandReviewWriting;
import com.command.my.CommandUserDelete;



@WebServlet("*.do")
public class Hotelfrontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hotelfrontcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/x-json;charset=utf-8");
	
		String c = request.getRequestURI().substring(request.getContextPath().length());
		

		
		String str = null; 
		HttpSession session = request.getSession();
		CommandImpl cmi = null;
		
		
		switch(c) {
		
			// ???????????? ????????????
			case "/join.do":
				
				cmi = new CommandJoin();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				
				str = "login.jsp";
				break;
			
		
			// ???????????? ????????????
			case "/userDelete.do":
			
				cmi = new CommandUserDelete();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				
				str = "login.jsp";
				break;
		
		
			// ????????? ???????????? // o, s
			case "/login.do": 
				
				// ????????? ?????????
				cmi = new CommandLogin();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				str = (String) request.getAttribute("str");
				break;
				
			// ???????????? ???????????? // o
			case "/logout.do":
				response.setContentType("text/html; charset=UTF-8");
		        session.invalidate();
		        
		        str="index.html"; // o
		        break;
		      
		        
		    // ?????? ????????????  // o, s
			case "/reservation.do":
				
				
				// ?????? ?????????
				cmi = new CommandReservation();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "map.jsp";
				break;
			
				
				
			// ??????????????? ????????????  // o, s
			case "/seoulHotelList.do": 
			case "/gangwonHotelList.do": 
			case "/busanHotelList.do":
				
				// map.jsp?????? ????????? ????????? ????????? location ??????
				if(c.equals("/seoulHotelList.do")) 
					session.setAttribute("location", "??????");
				else if(c.equals("/gangwonHotelList.do"))
					session.setAttribute("location", "?????????");
				else if(c.equals("/busanHotelList.do"))
					session.setAttribute("location", "??????");
				
				// ??????????????? ?????????
				cmi = new CommandHotelList();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "checkRoom.jsp"; // o
				break;
		        
		    
		    // ???????????? ?????? ????????????  // o, s
			case "/detailCheck.do":
					
				cmi = new CommandDetailCheck();
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
					
				str = "detailCheck.jsp";
				break;	
		
				
			// ?????????????????? // o, s
			case "/payment.do":
				
				cmi = new CommandPayment();
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "pay.jsp";
				break;
				
				
			// ?????? ?????? ????????????   // o, s
		    case "/reservationDetail.do":   
		     				
		     	cmi = new CommandReservationDetail();
		     				
		     	try {
		     		cmi.execute(request, response);
		     	} catch (Exception e2) {
		     		e2.printStackTrace();
		     	}
		     				
		     	str = "reservationDetail.jsp"; // o
		     	break;
		     	
		    
		    // ???????????????(??????) ???????????? // o
		    case "/review.do": 
				
				cmi = new CommandReview();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
				str = "review.jsp"; 
				break;
			
			// ???????????? ????????????(?????????, ??????????????? ??????)
		    case "/reviewWriting.do":
				
				cmi = new CommandReviewWriting();
				
				String email = (String) session.getAttribute("email3");
				
					
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				
				// ????????????
				if(email.equals("admin@naver.com"))
					str="reviewManagement.do";
				else
					str = "review.do";
				
				break;
			
			// ???????????? ???????????? // o, s
		    case "/reviewRetouch.do":
				
				cmi = new CommandReviewRetouch();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "reviewRetouch.jsp";
				break;
		     
			// ????????? ???????????? ???????????? // o, s
			case "/memberManagement.do": 
				
				cmi = new CommandMemberManagement();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str = "adminMemberView.jsp"; 
				break;
				
			// ????????? ?????????????????? ????????????  // o, s
			case "/userInfo.do":
				
				cmi = new CommandUserInfo();
	
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "adminUserInfo.jsp";
				break;
				
			// ????????? ?????????????????? ???????????? // o, s
			case "/editUserInfo.do":
				
				cmi = new CommandEditUserInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str = "/memberManagement.do";
				break;
				
			// ????????? ?????????????????? ???????????? // o, s
			case "/delUserInfo.do":
				
				cmi = new CommandDelUserInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
				str = "/memberManagement.do";
				break;
		
			// ????????? ???????????? ???????????? // o, s
			case "/adminReservation.do": 
				
				cmi = new CommandAdminReservation();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str = "adminReservation.jsp"; 
				break;
				
			// ????????? ???????????? ???????????? // o,s
			case "/editReservation.do":
				
				cmi = new CommandEditReservation();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "adminReservationInfo.jsp";
				break;
			
			
			// ????????? ???????????? ???????????? // o,s
			case "/editReservationInfo.do":
				
				cmi = new CommandEditReservationInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				str = "/adminReservation.do";
				break;
			
			// ????????? ???????????? ???????????? // o, s
			case "/delReservationInfo.do":
				
				cmi = new CommandDelReservationInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "/adminReservation.do";
				break;
			
			// ????????? ?????? ?????? ???????????? // o, s
			case "/reviewManagement.do": 
				
				cmi = new CommandAdminReview();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
				str = "adminReview.jsp"; 
				break;
				 
			// ????????? ?????? ?????? ???????????? // o, s
			case "/adminReviewWriting.do":
					
				cmi = new CommandAdminReviewWriting();
					
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
					
				str = "reviewManagement.do";
				break;
					
				
			// ????????? ?????? ?????? ????????????  // o, s
			case "/adminReviewRetouch.do":
				
				cmi = new CommandAdminReviewRetouch();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "adminReviewRetouch.jsp";
				break;
			
				
			// ?????? ?????? ????????????(?????????, ??????????????? ??????)   // o, s
			case "/reviewEdit.do":
				
			
				cmi = new CommandAdminReviewRetouch();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str= "reviewEdit.jsp";
				
				break;

			
			
				
			
			// ???????????? ????????????(?????????, ??????????????? ??????)  // o, s
			case "/delReviewInfo.do":
				
				cmi = new CommandDelReviewInfo();
				
				String email2 = (String) session.getAttribute("email3");
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				// ???????????????
				if(email2.equals("admin@naver.com"))
					str = "/reviewManagement.do";
				else
					str = "/review.do";
				
				break;
			
			// ?????? ?????????????????? (?????????, ??????????????? ??????)
			case "/reviewModify.do":
				
				cmi = new CommandReviewModify();
				String email4 = (String) session.getAttribute("email3");
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				 if(email4.equals("admin@naver.com"))
					 str = "/reviewManagement.do";
				 else
					str = "/review.jsp";
				
				break;
			
			
				
		}
		
			RequestDispatcher rd1 = request.getRequestDispatcher(str);
			rd1.forward(request, response);
			
			
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
