<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인홈</title>
  <!-- jQuery -->
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.1.min.js" ></script>
  <!-- iamport.payment.js -->
  <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.0.js"></script>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Black+And+White+Picture&family=Black+Han+Sans&family=Cute+Font&family=Do+Hyeon&family=Dokdo&family=East+Sea+Dokdo&family=Gaegu&family=Gamja+Flower&family=Gothic+A1&family=Gugi&family=Hi+Melody&family=Jua&family=Kirang+Haerang&family=Nanum+Brush+Script&family=Nanum+Gothic&family=Nanum+Gothic+Coding&family=Nanum+Myeongjo&family=Nanum+Pen+Script&family=Noto+Sans+KR&family=Noto+Serif+KR&family=Poor+Story&family=Single+Day&family=Song+Myung&family=Stylish&family=Sunflower:wght@300&family=Yeon+Sung&display=swap" rel="stylesheet">

<link rel="stylesheet" href="./css/main.css">
<link rel="shortcut icon" href="img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="img/파피콘.ico" type="image/x-icon">

</head>
<body>

    <header>
        <div class="main-content">
            <ul> 
                <li class="main-res"><a href="reservation.jsp">예약</a></li> <!-- o -->
                <li class="main-ge"><a href="review.do">고객의 소리</a></li> <!-- o -->
                <a  class="main-logo" href="main.jsp"><img src="./img/logo.svg"></a>   <!-- o -->          
                <li class="main-resrist"><a href="reservationDetail.do">예약 내역</a></li> <!-- o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li> <!-- o -->
            </ul>
        </div>
    </header>

	<p class="top-text">예약 > 방 선택<b >(${alist1[0].hotelLocation})</b></tr></p>
    <hr class="hr">



<table id=tb2 align=center>
<tr ><td class="ho-name1" colspan=6>${alist1[0].hotelName}<hr class="ho-hr1"></td></tr>
<tr>
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[0].hotelName }" />
<input type="hidden" name="roomSize" value="${alist1[0].roomSize }" />
<input type="hidden" name="price" value="${alist1[0].roomPrice}" />
<input class="img1" type="image" name=submit id=room src="img/트윈1.svg"  /></td>
</form>
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[1].hotelName }" />
<input type="hidden" name="roomSize" value="${alist1[1].roomSize }" />
<input type="hidden" name="price" value="${alist1[1].roomPrice}" />
<input class="img2" type="image" name=submit id=room src="img/더블1.svg"  /></td>
</form>
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[2].hotelName }" />
<input type="hidden" name="roomSize" value="${alist1[2].roomSize }" />
<input type="hidden" name="price" value="${alist1[2].roomPrice}" />
<input class="img3" type="image" name=submit id=room src="img/스위트1.svg"  /></td>
</tr>

<tr><td colspan=2 class="room1">${alist1[0].roomSize}</td>
<td colspan=2 class="room2">${alist1[1].roomSize}</td>
<td colspan=2 class="room3">${alist1[2].roomSize}</td></tr>
<tr><td class="pri1">가격</td>
<td class="pri1"><fmt:formatNumber value="${alist1[0].roomPrice}" pattern="#,##0" />원</td>
<td class="pri2">가격</td>
<td class="pri2"><fmt:formatNumber value="${alist1[0].roomPrice}" pattern="#,##0" />원</td>
<td class="pri3">가격</td>
<td class="pri3"><fmt:formatNumber value="${alist1[0].roomPrice}" pattern="#,##0" />원</td></tr>
<table id=tb2 align=center>
<tr><td class="ho-name2" colspan=6><h3>${alist1[3].hotelName}</h3><hr></td></tr>

<tr>
</form>
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[3].hotelName }" />
<input type="hidden" name="roomSize" value="${alist1[3].roomSize }" />
<input type="hidden" name="price" value="${alist1[3].roomPrice}" />
<input class="img4" type="image" name=submit id=room src="img/트윈2.svg"  /></td>
</form>
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[4].hotelName }" />
<input type="hidden" name="roomSize" value="${alist1[4].roomSize }" />
<input type="hidden" name="price" value="${alist1[4].roomPrice}" />
<input class="img5" type="image" name=submit id=room src="img/더블2.svg"  /></td>
</form>
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[5].hotelName }" />
<input type="hidden" name="roomSize" value="${alist1[5].roomSize }" />
<input type="hidden" name="price" value="${alist1[5].roomPrice}" />
<input class="img6" type="image" name=submit id=room src="img/스위트2.svg"  /></td></tr>
</form>
<tr><td colspan=2 class="room4">${alist1[3].roomSize}</td>
<td colspan=2 class="room5">${alist1[4].roomSize}</td>
<td colspan=2 class="room6">${alist1[5].roomSize}</td></tr>
<tr><td class="pri4">가격</td>
<td class="pri4"><fmt:formatNumber value="${alist1[3].roomPrice}" pattern="#,##0" />원</td>
<td class="pri5">가격</td>
<td class="pri5"><fmt:formatNumber value="${alist1[4].roomPrice}" pattern="#,##0" />원</td>
<td class="pri6">가격</td>
<td class="pri6"><fmt:formatNumber value="${alist1[5].roomPrice}" pattern="#,##0" />원</td></tr>
</table>

</body>
</html>