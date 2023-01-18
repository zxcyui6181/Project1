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

<link rel="stylesheet" href="./resources/css/main.css">
<link rel="shortcut icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="./resources/img/파피콘.ico" type="image/x-icon">

</head>
<body>

    <header>
        <div class="main-content">
            <ul> 
                <li class="main-res"><a href="reservation.jsp">예약</a></li> <!-- o -->
                <li class="main-ge"><a href="review.do">고객의 소리</a></li> <!-- o -->
                <a  class="main-logo" href="main.do"><img src="./resources/img/logo.svg"></a>   <!-- o -->          
                <li class="main-resrist"><a href="reservationDetail.do">예약 내역</a></li> <!-- o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li> <!-- o -->
            </ul>
        </div>
    </header>

	<p class="top-text">예약 > 방 선택<b >(${alist1[0].region})</b></tr></p>
    <hr class="hr">



<table id=tb2 align=center>
<tr ><td class="ho-name1" colspan=6>${alist1[0].hname}<hr class="ho-hr1"></td></tr>
<tr>
<c:forEach var="i" begin="0" end="2">
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[i].hname }" />
<input type="hidden" name="roomsize" value="${alist1[i].roomsize }" />
<input type="hidden" name="price" value="${alist1[i].price}" />
<input class="img${i}" type="image" name=submit id=room src="./resources/img/${i}.svg"  /></td>
</form>
</c:forEach>
</tr>

<tr><c:forEach var="i" begin="0" end="2">
<td colspan=2 class="room${i}">${alist1[i].roomsize}</td>
</c:forEach></tr>
<tr>
<c:forEach var="i" begin="0" end="2">
<td class="pri${i}">가격</td>
<td class="pri${i}"><fmt:formatNumber value="${alist1[i].price}" pattern="#,##0" />원</td>
</c:forEach></tr>
<table id=tb2 align=center>
<tr><td class="ho-name2" colspan=6><h3>${alist1[3].hname}</h3><hr></td></tr>

<tr>
<c:forEach var="i" begin="3" end="5">
<form action="detailCheck.do" method=post> <!-- o -->
<td colspan=2>
<input type="hidden" name="hname" value="${alist1[i].hname }" />
<input type="hidden" name="roomsize" value="${alist1[i].roomsize }" />
<input type="hidden" name="price" value="${alist1[i].price}" />
<input class="img${i}" type="image" name=submit id=room src="./resources/img/${i}.svg"  /></td>
</form>
</c:forEach>


<tr><c:forEach var="i" begin="3" end="5">
<td colspan=2 class="room${i}">${alist1[i].roomsize}</td>
</c:forEach></tr>
<tr>
<c:forEach var="i" begin="3" end="5">
<td class="pri${i}">가격</td>
<td class="pri${i}"><fmt:formatNumber value="${alist1[i].price}" pattern="#,##0" />원</td>
</c:forEach></tr>
</table>

</body>
</html>