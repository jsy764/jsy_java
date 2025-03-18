<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 회원가입 </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="icon" href="http://localhost:8080/jsp2/static/images/loveicon.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css">

</head>
<body>
	
	<div id="wrap">
		<%@ include file="../header.jsp" %>
	                   
	    <div id="main">
	    	
		<form method="post" action="/movie/signUp">
		
			<div id="formData">
				<div class="inputField">
					<input type="email" id="email">
					<label for="email">이메일</label>
                </div>
				<div class="inputField">
					<input type="password" id="password" class="pwChk">
					<label for="password">비밀번호</label>	
				</div>
				<div class="inputField">
					<input type="password" id="chk" class="pwChk">
					<label for="chk">비밀번호 확인
						<b id="pwRes"></b>		
					</label>		
				</div>
				<div class="inputField">
					<input type="text" id="name">
					<label for="name">이름</label>		
				</div>
				<div class="inputField">
					<input type="text" id="tel">
					<label for="tel">연락처</label>	
				</div>
				<div class="inputField">
					<b>생일 년월</b>
					<select id="birthYear" ></select>	
					<label for="birthYear">년</label>	
					<select id="birthMonth" ></select>
					<label for="birthMonth">월</label>
				</div>
				
				<button id="joinBt">SignUp</button>
				
			</div>
		
		</form>
	
	    </div>   
	                           
		<%@ include file="../footer.jsp" %>
	</div>

</body>
</html>






