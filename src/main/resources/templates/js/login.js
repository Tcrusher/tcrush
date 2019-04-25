$(function() {
	$("#login").click(function() {
		login();
	});
	return false;
});
function login() {
	$.ajax({
		url : "../login",
		type : "POST",
		data : {
			username : $("#username").val(),
			password : $("#password").val()
		},
		success : function(data) {
			if (data.code == 200) {
				window.location.href = "index.html";
				alert(data.data);
				alert(data.message);
			} else {
				$("#loginErrorMsg").html(data.message);
			}
		}
	});
}