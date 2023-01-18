<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<link rel="shortcut icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="stylesheet" href="./resources/css/admingbupdate.css">
</head>
<body>
    
    <header>
        <div class="main-content">
            <ul> 
                 <li class="main-res"><a href="memberManagement.do">회원관리</a></li> <!-- o -->
                <li class="main-ge"><a href="reviewManagement.do">고객의 소리</a></li>
                <a  class="main-logo" href="adminMainpage.do"><img src="./resources/img/logo.svg"></a> <!-- o -->      
                <li class="main-resrist"><a href="adminReservation.do">예약 수정</a></li> <!-- o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li> <!-- o -->
            </ul>
        </div>
    </header>

	<p class="top-text">고객의 소리</p>
    <hr class="hr">

    <form action="reviewModify.do"  method=post>
        <input class="title" type="text" name="tit"   value="${stv3.tit}"><br>
        <input  class="nik" type="text"  name="name" value="${stv3.name}" readonly><br>    
        <input  class="today" type="date" name="tda" value="${stv3.tda}" id=tda readonly>
        <hr class="hr1">
        <textarea name="nayoung" >${stv3.nayoung}</textarea>
        <input type=hidden name=cou value=0>
        <input type="hidden" value="${stv3.tit}" name="stit">
        <input  class="fix"  type="submit" value="수정">
    </form>
    <form action="delReviewInfo.do?tit=${stv3.tit}"  method=post>
     <input class="del" type="submit" value="삭제">
 </form>
    <footer></footer>
    
</body>
</html>