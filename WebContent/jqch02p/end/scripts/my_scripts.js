$(document).ready(function() {
	$(".guess_box").click(checkForCode);
	// random number generator
	function getRandom(num) {
		var result = Math.floor(Math.random() * num);
		return result;
	}
	// named function
	var hideCode = function() {
		var numRand = getRandom(4);
		$(".guess_box").each(
			function (index, value) {
				if(numRand == index) {
					$(this).append("<span id='has_discount'></span>");
					return false;
				}
			}
		);
	};
	// calling named function
	hideCode();
	
	function checkForCode () {
		var discount;
		if($.contains(this, document.getElementById("has_discount"))) {
			var my_num = getRandom(100);
			discount = "<p>Your Code: CODE"+my_num+"</p>";
		} else {
			discount = "<p>Sorry, no discount this time!</p>";
		}
		$(this).append(discount);
		$(".guess_box").each(function() {
			if($.contains(this, document.getElementById("has_discount"))) {
				$(this).addClass("discount");
			} else {
				$(this).addClass("no_discount");
			}
			$(this).unbind();
		});
		$("#result").append(discount);
	}
	
	$(".guess_box").hover(
		function() {
			$(this).addClass("my_hover");
		},
		function() {
			$(this).removeClass("my_hover");
		});
}); // end of document.ready()



function conditionalLogic() {
	if(myBool == true) {
		alert(true);
	} else {
		alert(false);
	}
}

