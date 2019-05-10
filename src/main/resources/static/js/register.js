$(function() {
	$("#register").click(function() {
		register();
	});
	return false;
});
function register() {
	$.ajax({
		url : "../register",
		type : "POST",
		data : {
			username : $("#username").val(),
			password : $("#password").val(),
			realName : $("#realName").val(),
			phone : $("#phone").val(),
			email : $("#email").val()
		},
		success : function(data) {
			if (data.code == 200) {
				window.location.href = "login.html";
			} else {
				alert("---注册失败---");
			}
		}
	});
}