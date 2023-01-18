<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="stylesheet" href="./resources/css/sawonUpdateForm.css">
</head>
<body>

    <header>
        <div class="main-content">
            <ul> 
                <li class="main-res"><a href="memberManagement.do">회원관리</a></li> <!-- o -->
                <li class="main-ge"><a href="reviewManagement.do">고객의 소리</a></li>
                <a  class="main-logo" href="adminMainpage.do"><img src="./resources/img/logo.svg"></a>    <!-- o -->        
                <li class="main-resrist"><a href="adminReservation.do">예약 수정</a></li> <!-- o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li> <!-- o -->
            </ul>
        </div>
    </header>

<p class="top-text">개인정보 수정</p>
<hr class="hr">

	<form action="editUserInfo.do?semail=${stv.email}" method=get>
		<table>
			<tr class="mem">
				<td>이름</td>
				<td>이메일</td>
				<td>전화번호</td>
				<td>비밀번호</td>
			</tr>
			<tr class="list">
				<td><input type="text" value="${stv.name}" name="name"></td>
				<td><input type="text" value="${stv.email}" name="email"></td>
				<td><input type="text" value="${stv.tel}" name="tel"></td>
				<td><input type="text" value="${stv.passw}" name="passw">
					<input type="hidden" value="${stv.email}" name="semail"></td>
			</tr>
			<tr>
				<td><input class="ch" type=submit value=수정> <a
					href="memberManagement.do" class="re">취소</a></td>
			</tr>
		</table>
	</form>
	<table>
		<tr>
			<td><a class="del" href="delUserInfo.do?email=${stv.email}">삭제</a></td>
		</tr>
	</table>

	<footer></footer>
	
</body>
</html>