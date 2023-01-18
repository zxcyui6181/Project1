<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="shortcut icon" href="img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="img/파피콘.ico" type="image/x-icon">
<link rel="stylesheet" href="./resources/css/adminres.css">
<link rel="shortcut icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="./resources/img/파피콘.ico" type="image/x-icon">
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

	<p class="top-text">예약 수정</p>
    <hr class="hr">

    <table align=center>

        <tr class="men"> <td  width=18%>예약번호</td> <td width=18%>이름</td> <td width=18%>이메일</td><td width=18%>전화번호</td width=18%>
            <td width=18%>체크인날짜</td><td width=18%>체크아웃날짜</td><td width=18%>인원</td></tr>
     </table>
     <table class="list">
        
        <c:forEach var="vo2" items="${slist}"> 
                
                <tr class="li1">
                    
                    <td width=18%><a href="editReservation.do?renum=${vo2.htdateVO.renum}">${vo2.htdateVO.renum}</a></td>
                    <td width=13%>${vo2.htloginVO.name}</td>
                    <td width=18%>${vo2.htloginVO.email}</td>
                    <td width=18%>${vo2.htloginVO.tel}</td>
                    <td width=18%>${vo2.htdateVO.cin}</td>
                    <td width=18%>${vo2.htdateVO.cout}</td>
                    <td width=18%>${vo2.htdateVO.pep}</td>
                </tr>	
        </c:forEach>
            </table>
            <tr > 
            <td align=center colspan=7>
                
            </td>
        </tr>
        
        
            
    
    <footer></footer>
    
</body>
</html>
