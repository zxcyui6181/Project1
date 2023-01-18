<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지 회원정보</title>
<link rel="shortcut icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="stylesheet" href="./resources/css/member.css">
</head>
<body>

    <header>
        <div class="main-content">
            <ul> 
                <li class="main-res"><a href="memberManagement.do">회원관리</a></li> <!-- o -->
                <li class="main-ge"><a href="reviewManagement.do">고객의 소리</a></li>
                <a  class="main-logo" href="adminMainpage.do"><img src="./resources/img/logo.svg"></a> <!-- o -->            
                <li class="main-resrist"><a href="adminReservation.do">예약 수정</a></li> <!-- o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li><!-- o -->
            </ul>
        </div>
    </header>

	<p class="top-text">회원 관리</p>
    <hr class="hr">
   
        <table align=center>
        
        <tr class="mem"> <td width=20%>이름</td> <td width=15%>이메일</td> <td width=20%>전화번호</td><td width=20%>비밀번호</td><td width=20%>관리자여부</td></tr>
    </table>
    <table class="list">
        <c:forEach  var="vo1" items="${alist1}"> 
                
                <tr class="li1">
                    
    
                    <td width=15%>${vo1.name}</td>
    
                    
                    <td width=18%><a href="userInfo.do?email=${vo1.email}">${vo1.email}</a></td>
                     <td width=20%>${vo1.tel}</td>
                    <td width=20%>${vo1.passw}</td>
                  	<td width=20%>${vo1.admin}</td>
                </tr>	
        </c:forEach>
    </table>
        <tr> 
            <td align=center colspan=5>
                
            </td>
        </tr>
        
            



    <footer></footer>
    
</body>
</html>