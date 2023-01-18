package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbconn.DBConn;
import vo.ReservationInfoVO;
import vo.AllReservationInfoVO;
import vo.DetailVO;
import vo.ReviewInfoVO;
import vo.HotelListInfoVO;
import vo.UserInfoVO;
import vo.PaymentInfoVO;

public class DAO {
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public DAO() throws ClassNotFoundException, SQLException {
		con = new DBConn().getConnection();
	}
	
	public ArrayList<UserInfoVO> getAdminInfo() throws SQLException{
		ArrayList<UserInfoVO> tiarray = new ArrayList<UserInfoVO>();
		String sql = "SELECT * FROM HTLogin";
		
		pstmt = con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			String name = rs.getString("name");
			String email = rs.getString("email");
			String passw = rs.getString("passw");
			String tel = rs.getString("tel");
			String admin = rs.getString("admin");
			
			UserInfoVO tv = new UserInfoVO(name,email,tel,passw,admin);
			tiarray.add(tv);
		}
		return tiarray; 
		
	}
	
	// 관리자모드로 예약수정, 회원관리 클릭 시 사용되는 DAO method
	public ArrayList<ReservationInfoVO> getReservationInfo() throws SQLException{
		ArrayList<ReservationInfoVO> tiarray1 = new ArrayList<ReservationInfoVO>();
		String sql = "select d.renum,l.name,d.email,l.tel,d.cin,d.cout,d.pep "
				+ "from htdate d,htlogin l "
				+ "where l.email = d.email";
		
		pstmt = con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			int renum = rs.getInt("renum");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String tel = rs.getString("tel");
			Date cin = rs.getDate("cin");
			Date cout = rs.getDate("cout");
			int pep = rs.getInt("pep");
			
			ReservationInfoVO tv1 = new ReservationInfoVO(renum,name,email,tel,cin,cout,pep);
			tiarray1.add(tv1);
		}
		return tiarray1; 
		
	}
	
	
	// 예약 시 모든예약정보 확인 시 사용되는 method
	public ArrayList<AllReservationInfoVO> getAllReservationInfo(String aemail) throws SQLException{
		ArrayList<AllReservationInfoVO> tiarray2 = new ArrayList<>();
		String sql = "select d.renum,h.region,h.hname,l.name,d.email,l.tel,d.cin,d.cout,d.pep"
				+ " from htdate d,htlogin l ,hoteltb h "
				+ "where l.email = d.email and h.renum=d.renum and d.email = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, aemail);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			int renum = rs.getInt("renum");
			String region = rs.getString("region");
			String hname = rs.getString("hname");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String tel = rs.getString("tel");
			Date cin = rs.getDate("cin");
			Date cout = rs.getDate("cout");
			int pep = rs.getInt("pep");
			
			AllReservationInfoVO tv2 = new AllReservationInfoVO(renum,region,hname,name,email,tel,cin,cout,pep);
			tiarray2.add(tv2);
		}
		return tiarray2; 
		
	}
	
	//조회수 증가시키는 DAO method
	 public boolean updateViews(String stit) { 
			 
			 String sql = "update HTgb set cou = cou + 1 where tit=?";
		  
		  try { pstmt=con.prepareStatement(sql); 
		  pstmt.setString(1, stit);
		  pstmt.executeUpdate(); 
		  }catch(SQLException e){
		  e.printStackTrace(); 
		  
		  return false;
		  
		  } return true;
		  
		  }
	
	 // 관리자모드에서 유저정보 수정시 사용되는 DAO method
	 public boolean updateUserInfo(String name, String email, String tel, String passw, String semail) { 
			 
			 String sql = "update HTlogin set name=?, email=?, tel=?," +
				 							"passw = ?  where email=?";
		  
		  try { pstmt=con.prepareStatement(sql); 
		  pstmt.setString(1, name);
		  pstmt.setString(2, email); 
		  pstmt.setString(3, tel); 
		  pstmt.setString(4, passw); 
		  pstmt.setString(5, semail);
		  pstmt.executeUpdate(); 
		  }catch(SQLException e){
		  e.printStackTrace(); 
		  
		  return false;
		  
		  } return true;
		  
		  }
	
	 
	 // 관리자모드에서 예약수정시 사용하는 DAO method
	 public boolean editReservation(int renum, String cin, String cout ,int pep,int srenum) { 
		 
		 String sql = "update Htdate set renum=?,cin = ?,cout=?,pep=?  where renum=?";
	  
			  	try { 
				  	  pstmt=con.prepareStatement(sql); 
					  pstmt.setInt(1, renum);
					  pstmt.setString(2, cin); 
					  pstmt.setString(3, cout);
					  pstmt.setInt(4, pep);
					  pstmt.setInt(5, srenum);	  
					  pstmt.executeUpdate(); 
					  
					  
			  	}catch(SQLException e){
			 	e.printStackTrace(); 
	  
				  return false;
				  
			  	} return true;
	  
	  	}
	
	 
	 // 리뷰수정시 사용되는 DAO method
	 public boolean updateReview(String tit, String name, String tda, String nayoung, String stit) { 
		 
		 String sql = "update HTgb set tit=?, name=?, tda=?," +
			 							"nayoung = ?  where tit=?";
	  
		  try { pstmt=con.prepareStatement(sql); 
		  pstmt.setString(1, tit);
		  pstmt.setString(2, name); 
		  pstmt.setString(3, tda); 
		  pstmt.setString(4, nayoung); 
		  pstmt.setString(5, stit);
		  pstmt.executeUpdate(); 
		  }catch(SQLException e){
		  e.printStackTrace(); 
		  
		  return false;
		  
		  } return true;
	  
	  }
	
	 // 로그인시 사용되는 DAO method
	 public boolean loginConfirm(String uemail, String upw) {
	      
	      String email = "";
	      String passw = "";
	      String sql = "SELECT EMAIL, PASSW FROM HTLogin WHERE EMAIL=? and PASSW=?";
	      
	      try {
	         pstmt = con.prepareStatement(sql);
	         pstmt.setString(1, uemail);
	         pstmt.setString(2, upw);
	         rs = pstmt.executeQuery();
	         
	         while(rs.next()) {
	             email = rs.getString("email");
	             passw = rs.getString("passw");
	         }
	         if(email.equals(uemail) && (passw.equals(upw))) {
	            
	               return true;
	               
	         }else if(uemail == null || upw == null) {
	            
	                  return false;
	         }else {
	               return false;
	            }

	         
	      } catch (SQLException e) {
	         
	         e.printStackTrace();
	         return false;
	         
	      }
	      
	      
	   }
	 
	 // 회원탈퇴시 사용되는 DAO method
	 public boolean deleteUser(String email,String password) {
			
			String sql = "DELETE FROM HTLogin WHERE EMAIL=? AND passw = ?";
			
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, email);
				pstmt.setString(2, password);
				pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			
			return true;
		}
		  
	 
	 // 관리자모드에서 회원관리시 개인정보를 확인할 때 사용되는 method
	 public UserInfoVO getAllUserInfo(String semail) throws SQLException{ 
		 UserInfoVO tv = null; 
		 
		 String sql = "select * from htlogin where email=? ";
	  
		  pstmt = con.prepareStatement(sql); 
		  pstmt.setString(1, semail); 
		  rs = pstmt.executeQuery();
		  if(rs.next()) { 
			  String name = rs.getString("name"); 
			  String email = rs.getString("email"); 
			  String passw = rs.getString("passw"); 
			  String tel = rs.getString("tel"); 
			  String admin = rs.getString("admin"); 
		  
		  tv = new UserInfoVO(name,email,passw,tel,admin); 
		  }else {
			  tv=null; 
			  } 
		  return tv;
	  
	  	}
	 
	 // 관리자모드에서 예약정보 확인할 때 사용하는 DAO method
	 public ReservationInfoVO getAllReservationInfo(int srenum) throws SQLException{ 
		 ReservationInfoVO tv2 = null; 
		 
		 String sql = "SELECT   d.renum, l.name,  d.email, l.tel, d.cin, d.cout, d.pep"
		 		+ " FROM  htdate  d,  htlogin l "
		 		+ "WHERE  l.email = d.email and d.renum = ?";
	  
		  pstmt = con.prepareStatement(sql); 
		  pstmt.setInt(1, srenum); 
		  rs = pstmt.executeQuery();
		  if(rs.next()) { 
			  String name = rs.getString("name"); 
			  String email = rs.getString("email"); 
			  String tel = rs.getString("tel"); 
			  int renum = rs.getInt("renum");
			  Date cin = rs.getDate("cin");
			  Date cout = rs.getDate("cout");
			  int pep = rs.getInt("pep");
		  
		  tv2 = new ReservationInfoVO(renum,name,email,tel,cin,cout,pep); 
		  }else {
			  tv2=null; 
			  } 
		  return tv2;
	  
	  	}
	 
	 // 고객의소리 클릭시 실행되는 method
	 public ArrayList<ReviewInfoVO> getReviewInfo() throws SQLException{
			ArrayList<ReviewInfoVO> gbarray = new ArrayList<ReviewInfoVO>();
			String sql = "select * from htgb order by num";
			
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String tit = rs.getString("tit");
				String name = rs.getString("name");
				Date tda = rs.getDate("tda");
				String nayoung = rs.getString("nayoung");
				int cou = rs.getInt("cou");
				
				ReviewInfoVO tv3 = new ReviewInfoVO(num,tit,name,tda,nayoung,cou);
				gbarray.add(tv3);
			}
			return gbarray; 
			
		}
	
	 
	 // 고객의 소리에서 제목클릭하면 실행되는 메소드
	 public ReviewInfoVO getOneReviewInfo(String stit) throws SQLException{ 
		 ReviewInfoVO tv3 = null; 
		 
		 String sql = "select * from htgb where tit=? ";
	  
		  pstmt = con.prepareStatement(sql); 
		  pstmt.setString(1, stit); 
		  rs = pstmt.executeQuery();
		  if(rs.next()) { 
			  int num = rs.getInt("num");
			  String tit = rs.getString("tit"); 
			  String name = rs.getString("name"); 
			  Date tda = rs.getDate("tda"); 
			  String nayoung = rs.getString("nayoung"); 
			  int cou = rs.getInt("cou");
		  
		  tv3 = new ReviewInfoVO(num,tit,name,tda,nayoung,cou); 
		  }else {
			  tv3=null; 
			  } 
		  return tv3;
	  
	  	}
	
	 // 회원가입시 사용되는 DAO method
	 public boolean insertUser(String name, String email, String passw, String tel){
		  String sql = "insert into htlogin(name, email, passw, tel) values(?,?,?,?)"; 
		  try {
			  pstmt=con.prepareStatement(sql);
			  pstmt.setString(1, name);
			  pstmt.setString(2, email);	 
			  pstmt.setString(3, passw); 
			  pstmt.setString(4, tel);
			  
			  pstmt.executeUpdate(); 
			  }catch(SQLException e){
		  e.printStackTrace(); 
		  return false;
		  
		  } return true;
		  
		  }
	 
	 // 예약시 사용되는 DAO method
	 public boolean insertReservationInfo(String email, String cin, String cout, int pep) {
		  String sql = "insert into htdate values(renumAssign.nextval,?,to_date(?),to_date(?),?)";
		  try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, email);	 
			pstmt.setString(2, cin); 
			pstmt.setString(3, cout);
			pstmt.setInt(4, pep);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		  
		return true;
	  }
	 
	 // 리뷰 작성 할때 사용되는 DAO method
	 public boolean insertReview(String tit, String name, String tda, String nayoung,int cou) {
		  String sql = "insert into htgb values(numAssign.nextval,?,?,to_date(?),?,?)";
		  try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, tit);	 
			pstmt.setString(2, name); 
			pstmt.setString(3, tda);
			pstmt.setString(4, nayoung);
			pstmt.setInt(5, cou);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		  
		return true;
	  }

	 // 관리자모드에서 개인정보 삭제시 사용되는 DAO method
	 public boolean delUserInfo(String email2){ 
		  String sql = "delete from htlogin where email=?";
	  
		  try { 
		  	  pstmt=con.prepareStatement(sql);
			  pstmt.setString(1, email2);
			  pstmt.executeUpdate(); 
			  }catch(SQLException e){ 
				  e.printStackTrace(); 
			  return false;
			  } 
	  	return true;
	  
	  }
	  
	 public boolean delete_nametel2(int renum2){ 
		 
		  String sql ="delete from htdate where renum=?";
	  
			  try { pstmt=con.prepareStatement(sql);
			  pstmt.setInt(1, renum2);
			  pstmt.executeUpdate(); 
			  }catch(SQLException e)
			  { e.printStackTrace(); 
	  return
			  
	  false;
	  
	  } return true;
	  
	  }
	 
	 public boolean delete_nametelgb(String tit2){ 
		  String sql = "delete from htgb where tit=?";
	  
		  try { 
		  	  pstmt=con.prepareStatement(sql);
			  pstmt.setString(1, tit2);
			  pstmt.executeUpdate(); 
			  }catch(SQLException e){ 
				  e.printStackTrace(); 
			  return false; 
			  } 
	  	return true;
	  
	  }
	  
	  // map.jsp에서 선택한 지역에 대한 호텔정보들을 출력하는 메소드
	  // view는 main.jsp
	  public ArrayList<HotelListInfoVO> viewHotelInfo(String location) throws SQLException{
		  
		  ArrayList<HotelListInfoVO> hArray = new ArrayList<>();
			String sql = "SELECT * FROM hoteltb WHERE region = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, location);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String hotelLocation = rs.getString("region");
				String hotelName = rs.getString("hname");
				String roomSize = rs.getString("roomsize");
				String roomPrice = rs.getString("price");
				
				HotelListInfoVO hvo = new HotelListInfoVO(hotelLocation, hotelName, roomSize, roomPrice);
				
				hArray.add(hvo);
				
			}
			
			return hArray;
			
		}
	  

	// 체크인 정보를 DB에서 뽑아서 반환하는 메소드
	// view는 detail.jsp
	  public DetailVO viewCheckInfo(String hname, String roomSize, int price) throws SQLException {
		  
		  DetailVO tivo = null;
		  String sql = "SELECT * FROM htdate";
		  
		  pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
			
				
				Date cin = rs.getDate("cin");
				Date cout = rs.getDate("cout");
				int total = rs.getInt("pep");
				
				tivo = new DetailVO(cin, cout, total, hname, roomSize, price);
				
			}
			
			return tivo;
		  
	  }
	  
	  // detail.jsp에서 원하는 호텔을 선택하면 htdate DB에 renum을 추가하는 메소드
	  public boolean insertRenum(int renum, String hname, String roomSize, int price) throws SQLException {
		  
		  String sql = "UPDATE hoteltb SET renum=? WHERE hname=? AND roomSize=? AND price=?";
		  
		  try {
		  pstmt = con.prepareStatement(sql);
		  pstmt.setInt(1, renum);
		  pstmt.setString(2,  hname);
		  pstmt.setString(3, roomSize);
		  pstmt.setInt(4, price);
		  pstmt.executeUpdate(); 
		  
		  }catch(SQLException e){ 
			 System.out.println("update error");
		 	return false;
		  } 
		  
		  return true;
		  
	  }

	 // detail.jsp에서 결제를 선택하면 pay.jsp에서 필요한 정보들을 뽑아내주는 메소드
	 // view는 pay.jsp
	 public PaymentInfoVO getPaymentInfo(String email, int price) throws SQLException {
		 
		 String sql = "SELECT * FROM htlogin WHERE email = ?";
		 PaymentInfoVO tpvo = null;
		 String name = null,  tel = null;
		 
		 try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, email);
				rs = pstmt.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("SELECT ERROR");
			}
		 
		 while(rs.next()) {
				
				name = rs.getString("name");
				tel = rs.getString("tel");
				
			}
		 
		 tpvo = new PaymentInfoVO(price, email, name, tel);
		 return tpvo;
	 }
	 
	 
	 // 예약번호를  반환하는 메소드
	 public int getReservationNum(String email) {
			  
		 String sql = "SELECT * FROM htdate WHERE email=?";
		 	
		 	  int renum = 0;
		 
		 	  try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, email);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					renum = rs.getInt("renum");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 	  
		 return renum;
	 }
	 
	 // 결제실패시 현재 사용자의 htdate에 있는 정보삭제
	 public boolean deleteInfo(String email) {
		 
		 String sql ="DELETE FROM htdate WHERE email = ?";
		 
		 try { 
		  	  pstmt=con.prepareStatement(sql);
			  pstmt.setString(1, email);
			  pstmt.executeUpdate(); 
			  }catch(SQLException e){ 
				  e.printStackTrace(); 
			  return
			  false; } 
	  	return true;
	 }
	
	
	

}
