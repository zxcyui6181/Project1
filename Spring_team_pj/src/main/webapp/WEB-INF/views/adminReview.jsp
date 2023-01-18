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
<link rel="stylesheet" href="./resources/css/admingb.css">
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

    <div class="text">
        <p>KAJA HOTEL은 언제나 고객의 목소리에 귀기울이고 있습니다.</p>
        <p>고객님들의 소중한 충고와 격려, 또는 제안의 말씀을 주시면 더 나은 서비스로 보답하겠습니다.</p>
    </div>

	<table >

	<tr class="mem"> <td width=20%>순번</td> <td width=30%>제목</td> <td width=20%>작성자</td><td width=20%>작성일</td><td width=20%>조회수</td></tr>
	</table>
	<table class="list">
	<c:forEach var="li" items="${list2}"> 
			
			<tr class="li1">
				
				<td width=20%>${li.num}</td>
				<td width=30%><a href="adminReviewRetouch.do?tit=${li.tit}">${li.tit}</a></td>
				<td width=20%>${li.name}</td>
				<td width=20%>${li.tda}</td>
				<td width=20%>${li.cou}</td>
			</tr>	
	</c:forEach>
		<tr > 
		<td  align=center colspan=7>
			<input class="wr" type=button onclick="location.href='adminReviewWritingpage.do'" value=글쓰기>
		</td>
	</tr>
	
	</table>
	
	
		
	
	
<footer></footer>
</body>
</html>
