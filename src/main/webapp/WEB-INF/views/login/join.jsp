<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<div>
		<h1>회원가입 페이지</h1>
	</div>
	<form:form modelAttribute="joinVo" action="/user/join" >
		아이디<input type="text" id="userid" name="userid" > <br>
		비밀번호<input type="password" id="userpw" name="userpw" />	<br>
		비밀번호 확인<input type="password" id="userpwchk" />	<br>
		전화번호
		<select name=usertel>
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="02">02</option>
		</select> 
		<input type="text" name=usertel style="width:50px " maxlength=4/>
		<input type="text" name=usertel style="width:50px" maxlength=4/>
		<br>
		이메일<input type="text" id="useremail" name="useremail"/><br>
		관리자 가입<input type="checkbox" id="userrole" name="userrole" /><br>
		<input type="button" id="btn" value="가입" onclick="pwcheck()"/>
	</form:form>
	
</body>
<script>

		/* var frm = joinVo;
		var userpw	= $("#userpw").val();
		//var userpwchk	= $("#userpwchk").val();
		var userpwchk	= document.getElementById("userpwchk").value;
		$("#btn").on("click",function(){
			if(userpw !== userpwchk){
				alert("패스워드가 일치하지 않습니다.")
				return false
			}
			frm.submit();
		}); */
		
		function pwcheck(){
			var frm = joinVo;
			var userpw	= $("#userpw").val();
			var userpwchk	= $("#userpwchk").val();
			if(userpw !== userpwchk){
				alert("패스워드가 일치하지 않습니다.")
				return 
			}
			else { 
				frm.submit();
			}
				
			
		}
		
		
	
	
	
	
		

		
	
	
</script>
</html>