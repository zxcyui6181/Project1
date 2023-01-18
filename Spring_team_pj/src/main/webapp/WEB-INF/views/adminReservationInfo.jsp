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
<link rel="stylesheet" href="./resources/css/sawonUpdateForm2.css">
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

<p class="top-text">예약정보 수정</p>
<hr class="hr">

<form action="editReservationInfo.do" method=get>
    <table>
    <tr class="mem"><td>예약번호</td><td>이름</td><td>이메일</td><td>전화번호</td><td>체크인날짜</td><td>체크아웃날짜</td><td>인원</td></tr>
    <tr class="list"><td><input type="text" value="${stv2.htdateVO.renum}" name="renum" readonly></td>
    <td><input type="text" value="${stv2.htloginVO.name}" name="name"readonly></td>
    <td><input type="text" value="${stv2.htloginVO.email}" name="email"readonly></td>
    <td><input type="text" value="${stv2.htloginVO.tel}" name="tel"readonly></td>
    <td><input type="date" value="${stv2.htdateVO.cin}" name="cin"></td>
    <td><input type="date" value="${stv2.htdateVO.cout}" name="cout"></td>
    <td><input type="number" max=10 min=1 value="${stv2.htdateVO.pep}" name="pep">
    <input type="hidden" value="${stv2.htdateVO.renum}" name="srenum"></td>
    </tr>
    <tr><td colspan=7><input class="ch" type=submit value=수정>
    <a href="adminReservation.do" class="re">취소</a></td></tr>
    </table>
    </form>
    <table>
    <tr>
    
    
    <td><a class="del" href="delReservationInfo.do?srenum=${stv2.htdateVO.renum}">삭제</a></td>
    </tr>
    </table>
    

<footer></footer>
	
</body>
</html>