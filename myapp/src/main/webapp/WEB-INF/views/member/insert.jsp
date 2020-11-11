<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
<h1>회원 정보 입력</h1>
<form action="/myapp/member/insert" method=post enctype="multipart/form-data">
<table>
<tr>
<td>아이디</td><td><input type=text name=userid><button id="check">중복 검사</button></td>
</tr>
<tr>
<td>비밀번호</td><td><input type=password name=password></td>
</tr>
<tr>
<td>이름</td><td><input type=text name=name></td>
</tr>
<tr>
<td>전화번호</td><td><input type=text name=tel></td><!--  pattern="^[0][1][0-9](-/|s)|d{4}(-/|s)|d{4}$" -->
</tr>
<tr>
<td>프로필 사진</td><td><input type=file name=file></td>
</tr>
<tr>
<td><input type=submit value=가입> <input type=reset value=취소></td>
</tr>

</table>
</form>
<script type="text/javascript">
	$(function(){
		var ck = false;
		$("#check").on("click",function(){
			if($("#userid").val()){
				$.ajax({
					url : "check",
					type : "post",
					data : {userId : $("#userid").val()},
					dataType : "text",
					success : function(check){
						if(check){
							alert("중복되지 않습니다.");
							$("#check").remove();
							$("#employeeId").attr("readonly", true);
							ck = !ck;
						}else{
							alert("사원번호가 중복됩니다.");
						}
						return false;
					},
					error : function(){
						alert("ajax에 문제가 있습니다.");
						return false;
					}
				});
			} else {
				alert("값이 있어야 합니다.");
				return false;
			}
		});
		$("#submit").on("click",function(){
			if(ck){	
			
			}else{
				alert("중복검사가 먼저 진행되어야 합니다.");
				return false;
			}
		});
	});
	</script>
</body>
</html>