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
		
			// 회원가입 컨트롤러
			case "/join.do":
				
				cmi = new CommandJoin();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				
				str = "login.jsp";
				break;
			
		
			// 회원탈퇴 컨트롤러
			case "/userDelete.do":
			
				cmi = new CommandUserDelete();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				
				str = "login.jsp";
				break;
		
		
			// 로그인 컨트롤러 // o, s
			case "/login.do": 
				
				// 로그인 서비스
				cmi = new CommandLogin();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				str = (String) request.getAttribute("str");
				break;
				
			// 로그아웃 컨트롤러 // o
			case "/logout.do":
				response.setContentType("text/html; charset=UTF-8");
		        session.invalidate();
		        
		        str="index.html"; // o
		        break;
		      
		        
		    // 예약 컨트롤러  // o, s
			case "/reservation.do":
				
				
				// 예약 서비스
				cmi = new CommandReservation();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "map.jsp";
				break;
			
				
				
			// 지역리스트 컨트롤러  // o, s
			case "/seoulHotelList.do": 
			case "/gangwonHotelList.do": 
			case "/busanHotelList.do":
				
				// map.jsp에서 선택한 지역에 맞춰서 location 설정
				if(c.equals("/seoulHotelList.do")) 
					session.setAttribute("location", "서울");
				else if(c.equals("/gangwonHotelList.do"))
					session.setAttribute("location", "강원도");
				else if(c.equals("/busanHotelList.do"))
					session.setAttribute("location", "부산");
				
				// 호텔리스트 서비스
				cmi = new CommandHotelList();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "checkRoom.jsp"; // o
				break;
		        
		    
		    // 세부사항 확인 컨트롤러  // o, s
			case "/detailCheck.do":
					
				cmi = new CommandDetailCheck();
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
					
				str = "detailCheck.jsp";
				break;	
		
				
			// 결제컨트롤러 // o, s
			case "/payment.do":
				
				cmi = new CommandPayment();
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "pay.jsp";
				break;
				
				
			// 예약 내역 컨트롤러   // o, s
		    case "/reservationDetail.do":   
		     				
		     	cmi = new CommandReservationDetail();
		     				
		     	try {
		     		cmi.execute(request, response);
		     	} catch (Exception e2) {
		     		e2.printStackTrace();
		     	}
		     				
		     	str = "reservationDetail.jsp"; // o
		     	break;
		     	
		    
		    // 고객의소리(리뷰) 컨트롤러 // o
		    case "/review.do": 
				
				cmi = new CommandReview();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
				str = "review.jsp"; 
				break;
			
			// 리뷰작성 컨트롤러(관리자, 일반사용자 공용)
		    case "/reviewWriting.do":
				
				cmi = new CommandReviewWriting();
				
				String email = (String) session.getAttribute("email3");
				
					
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				
				// 수정부분
				if(email.equals("admin@naver.com"))
					str="reviewManagement.do";
				else
					str = "review.do";
				
				break;
			
			// 리뷰수정 컨트롤러 // o, s
		    case "/reviewRetouch.do":
				
				cmi = new CommandReviewRetouch();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "reviewRetouch.jsp";
				break;
		     
			// 관리자 회원관리 컨트롤러 // o, s
			case "/memberManagement.do": 
				
				cmi = new CommandMemberManagement();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str = "adminMemberView.jsp"; 
				break;
				
			// 관리자 개인정보확인 컨트롤러  // o, s
			case "/userInfo.do":
				
				cmi = new CommandUserInfo();
	
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "adminUserInfo.jsp";
				break;
				
			// 관리자 개인정보수정 컨트롤러 // o, s
			case "/editUserInfo.do":
				
				cmi = new CommandEditUserInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str = "/memberManagement.do";
				break;
				
			// 관리자 개인정보삭제 컨트롤러 // o, s
			case "/delUserInfo.do":
				
				cmi = new CommandDelUserInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
				str = "/memberManagement.do";
				break;
		
			// 관리자 예약수정 컨트롤러 // o, s
			case "/adminReservation.do": 
				
				cmi = new CommandAdminReservation();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str = "adminReservation.jsp"; 
				break;
				
			// 관리자 예약수정 컨트롤러 // o,s
			case "/editReservation.do":
				
				cmi = new CommandEditReservation();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "adminReservationInfo.jsp";
				break;
			
			
			// 관리자 예약수정 컨트롤러 // o,s
			case "/editReservationInfo.do":
				
				cmi = new CommandEditReservationInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				str = "/adminReservation.do";
				break;
			
			// 관리자 예약삭제 컨트롤러 // o, s
			case "/delReservationInfo.do":
				
				cmi = new CommandDelReservationInfo();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				str = "/adminReservation.do";
				break;
			
			// 관리자 리뷰 관리 컨트롤러 // o, s
			case "/reviewManagement.do": 
				
				cmi = new CommandAdminReview();
				
				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
				str = "adminReview.jsp"; 
				break;
				 
			// 관리자 리뷰 작성 컨트롤러 // o, s
			case "/adminReviewWriting.do":
					
				cmi = new CommandAdminReviewWriting();
					
				try {
					cmi.execute(request, response);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
					
				str = "reviewManagement.do";
				break;
					
				
			// 관리자 리뷰 수정 컨트롤러  // o, s
			case "/adminReviewRetouch.do":
				
				cmi = new CommandAdminReviewRetouch();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
					
				str= "adminReviewRetouch.jsp";
				break;
			
				
			// 리뷰 수정 컨트롤러(관리자, 일반사용자 공용)   // o, s
			case "/reviewEdit.do":
				
			
				cmi = new CommandAdminReviewRetouch();

				try {
					cmi.execute(request, response);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				str= "reviewEdit.jsp";
				
				break;

			
			
				
			
			// 리뷰삭제 컨트롤러(관리자, 일반사용자 공용)  // o, s
			case "/delReviewInfo.do":
				
				cmi = new CommandDelReviewInfo();
				
				String email2 = (String) session.getAttribute("email3");
				
				try {
					cmi.execute(request, response);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				// 수정된부분
				if(email2.equals("admin@naver.com"))
					str = "/reviewManagement.do";
				else
					str = "/review.do";
				
				break;
			
			// 리뷰 수정컨트롤러 (관리자, 일반사용자 공용)
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
