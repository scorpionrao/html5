window.onload = init;
var counter = 0;
var t;

function init() {
	t = setInterval(scrollImages, 500);
}

function scrollImages() {
	var coverBarDiv = document.getElementById("coverBar");
	var images = coverBarDiv.getElementsByTagName("img");
	for (var i = 0; i < images.length; i++) {
		var left = images[i].style.left.substr(0,
				   images[i].style.left.length - 2);
		console.log(images[i].src + " Left="+left);
		if (left < 0) {
			left = 532;
		}
		images[i].style.left = (left - 10) + "px";
	}
//	if (counter < 1000) {
//		counter = counter + 1;
//	} else {
//		t.cancel();
//	}
}