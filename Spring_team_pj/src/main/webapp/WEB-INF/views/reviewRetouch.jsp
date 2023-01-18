<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>

<link rel="shortcut icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="stylesheet" href="./resources/css/cusgbselect.css">
</head>
<body>

    <header>
        <div class="main-content">
            <ul> 
               <li class="main-res"><a href="reservation.jsp">예약</a></li> <!-- o -->
                <li class="main-ge"><a href="review.do">고객의 소리</a></li> <!-- o -->
                <a  class="main-logo" href="main.do"><img src="./resources/img/logo.svg"></a> <!-- o -->            
                <li class="main-resrist"><a href="reservationDetail.do">예약 내역</a></li> <!-- o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li> <!-- o -->
            </ul>
        </div>
    </header>
	<p class="top-text">고객의 소리</p>
    <hr class="hr">

		<div class="top">
        <div>${stv3.tit }</div>
        <div>${stv3.name }</div>
       <div> ${stv3.tda }</div>
		</div>
        <hr class="hr1">
         <div class="mid">${stv3.nayoung }</div>
         
    <form action="reviewEdit.do?tit=${stv3.tit}"  method=post>
        <input class="can" type="button" onclick="location.href='review.do'" value="취소">
    </form>
	
<footer></footer>
</body>
</html>
