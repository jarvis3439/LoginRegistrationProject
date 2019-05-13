//show password validation
function myFunction() {
	  var x = document.getElementById("password1");
	  if (x.type === "password") {
	    x.type = "text";
	  } else {
	    x.type = "password";
	  }
	}

// confirm password validation
$(function () {
    $("#btnSubmit").click(function () {
        var password = $("#password1").val();
        var confirmPassword = $("#password2").val();
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    });
});
   