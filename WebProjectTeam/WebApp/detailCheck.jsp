<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="vo.DetailVO" %>
<%@ page import="java.sql.Date" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

  <link rel="stylesheet" href="./css/detail.css">
  <link rel="shortcut icon" href="img/파피콘.ico" type="image/x-icon">
  <link rel="icon" href="img/파피콘.ico" type="image/x-icon">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약</title>
  <!-- jQuery -->
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.1.min.js" ></script>
  <!-- iamport.payment.js -->
  <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.0.js"></script>


	
 <%
	 	DetailVO tdvo = (DetailVO) request.getAttribute("alist1");
	 %> 



</head>
<body>

    <header>
        <div class="main-content">
            <ul> 
                <li class="main-res"><a href="reservation.jsp">예약</a></li> <!-- o -->
                <li class="main-ge"><a href="review.do">고객의 소리</a></li> <!-- o -->
                <a  class="main-logo" href="main.jsp"><img src="img/logo.svg"></a> <!-- o -->            
                <li class="main-resrist"><a href="reservationDetail.do">예약 내역</a></li> <!-- o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li> <!-- o -->
            </ul>
        </div>
    </header>

	<p class="top-text">방 정보</p>
    <hr class="hr">


<table id=tb align=center>
<tr><td colspan=2><img id=room  src="img/트윈1.svg"></td></tr>
<tr><td ><p class="room-name"><%= tdvo.getHname() %></p></td>
<td class="room-pri"><fmt:formatNumber value="<%=tdvo.getPrice() %>" pattern="#,##0" />원</td></tr>
<tr><td ><p class="room-size"><%= tdvo.getRoomSize() %></p></td>
    
 <td>
<form action="payment.do" class="pay">
	<input type="hidden" name="roomPrice" value="100" readonly />
	<input type="submit" id=결제버튼 value="결제" />
</form></td></tr>

<tr><td class="chin">체크인 15시 체크아웃 11시 이전</td></tr>
<hr class="mi-hr">
<tr><td colspan=2><img class="img1" src="img/인원.svg"> <img class="img2" src="img/금연.svg"></td></tr>
<tr><td colspan=2><p class="mem">2인/최대2인</p> <span class="sm">금연 객실</span></td></tr>
<인원><td class="di">날짜 <%=tdvo.getCin() %>~<%=tdvo.getCout() %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;인원 <%=tdvo.getPep() %>명</td></tr>
</table>
<br>
<table id=te align=center>
<tr>
<p class="p1">기본정보</p><br>
<div class="p2">
<p>20.37㎡, 싱글 침대 2개</p>
<p>2인 기준 / 인원 추가 불가</p>
<p>에어컨, TV, 냉장고, 커피포트, 생수</p>
<p>샤워시설, 비데, 욕실용품, 드라이기, 가운</p>
<p>무료 Wi-Fi, 금연객실</p>
</div>
</td></tr>
</table>
<br>
<table id=tb align=center>
<tr><td>
<p class="p3">예약공지</p>
<div class="p4">
<p>체크인 15:00 이후, 체크아웃 11:00 이전</p>
<p>치약, 칫솔 제공 안함</p>
</div>
</td></tr>
</table><br><br>

<footer></footer>

</body>

</html>