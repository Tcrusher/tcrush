$(function() {
	showUserName();
	$("#logout").click(function() {
		logout();
	});
});

function showUserName() {
	$.ajax({
		url : "../getInfo",
		type : "GET",
		async : false,
		success : function(data) {
			$("#username").html(data);
			alert(data.data);
		}
	});
}

function logout() {
	$.ajax({
		url : "../logout",
		type:"GET",
		async : false,
	});
	
	window.location.href = "page/index.html";
}