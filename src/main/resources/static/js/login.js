$(function() {
    $("#login").click(function() {
        login();
        alert("登录");
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
                alert("登录成功")
                window.location.href = "index.html";
            } else {
                alert("登录失败");
            }
        }
    });
}