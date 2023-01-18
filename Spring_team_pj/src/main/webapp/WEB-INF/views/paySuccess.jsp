<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/paySuccess.css">
<link rel="shortcut icon" href="./resources/img/파피콘.ico" type="image/x-icon">
<link rel="icon" href="./resources/img/파피콘.ico" type="image/x-icon">
</head>
<body>
	
    <header>
        <div class="main-content">
            <ul> 
                <li class="main-res"><a href="reservationpage.do">예약</a></li> <!--  o -->
                <li class="main-ge"><a href="review.do">고객의 소리</a></li> <!-- o -->
                <a  class="main-logo" href="main.do"><img src="./resources/img/logo.svg"></a>  <!--  o -->           
                <li class="main-resrist"><a href="reservationDetail.do">예약 내역</a></li> <!--  o -->
                <li class="main-login"><a href="logout.do">로그아웃</a></li> <!--  o -->
            </ul>
        </div>
    </header>
   
    <div class="text">
        <p>결제가 완료 되었습니다</p>
        <P>이용해 주셔서 감사합니다</P>
    </div>

    <a class="su-re" href="reservationDetail.do">예약 내역 보기</a> <!--  o -->
    <a class="su-home" href="main.do">홈으로</a> <!--  o -->

    <footer></footer>
</body>
</html>