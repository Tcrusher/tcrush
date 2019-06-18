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
            username : document.getElementById("username").value(),
            password : document.getElementById("password").value()
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