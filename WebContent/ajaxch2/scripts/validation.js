window.onload = initPage;

function initPage() {
	document.getElementById("username").onblur = checkUsername;
	document.getElementById("register").disabled = true;
}

function checkUsername() {
	document.getElementById("username").className = "thinking";
	request = createRequest();
	if (request == null) {
		alert("Unable to create request");
	} else {
		var theName = document.getElementById("username").value;
		var username = escape(theName);
		var url = "checkName.php?username=" + username;
		request.onreadystatechange = showUsernameStatus;
		request.open("GET", url, true);
		request.send(null);
	}
}

function showUsernameStatus() {
	// update the page to show whether the username is okay
	if (request.readyState == 4) {
		if (request.status == 200) {
			console.log(request.responseText);
			if (request.responseText == "okay") {
				document.getElementById("username").className = "approved";
				document.getElementById("register").disabled = false;
			} else {
				document.getElementById("username").className = "denied";
				document.getElementById("username").focus();
				document.getElementById("username").select();
				document.getElementById("register").disabled = true;
			}
		}
	}
}