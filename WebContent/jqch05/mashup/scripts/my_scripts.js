$(document).ready(function() {
	var headclix = 0, eyesclix = 0, noseclix = 0, mouthclix = 0;
	lightning_one();
	lightning_two();
	lightning_three();
	$("#head").click(function() {
		if (headclix < 9) {
			showNextPic($(this));
			headclix = headclix + 1;
		} else {
			rewind($(this));
			headclix = 0;
		}
	});
	$("#eyes").click(function() {
		if (eyesclix < 9) {
			showNextPic($(this));
			eyesclix = eyesclix + 1;
		} else {
			rewind($(this));
			eyesclix = 0;
		}
	});
	$("#nose").click(function() {
		if (noseclix < 9) {
			showNextPic($(this));
			noseclix = noseclix + 1;
		} else {
			rewind($(this));
			noseclix = 0;
		}
	});
	$("#mouth").click(function() {
		if (mouthclix < 9) {
			showNextPic($(this));
			mouthclix = mouthclix + 1;
		} else {
			rewind($(this));
			mouthclix = 0;
		}
	});
});

function showNextPic(element, index) {
	$(element).animate({left:"-=367px"},500);
}

function rewind(element) {
	$(element).animate({left:"0px"},500);
}

function animation() {
	$("#my_div").animate({
		// animate opacity, size and left simultaneously
		left:"100px",
		width: "200",
		height: "800",
		opacity: 0
	},500);
}

function lightning_one() {
	$("#lightning1").fadeIn("250").fadeOut("250");
	setTimeout("lightning_one()", 4000);
};
function lightning_two() {
	$("#lightning2").fadeIn("fast").fadeOut("fast");
	setTimeout("lightning_two()", 5000);
};
function lightning_three() {
	$("#lightning3").fadeIn("fast").fadeOut("fast");
	setTimeout("lightning_three()", 7000);
};

var myCountry = {
	myName	: 'USA',
	myCapital : 'Washington DC',
	getCapital : function() {
		alert(this.myCapital);
	}
};


function myCountryClass(name, capital) {
	this.mynameClass = name;
	this.mycapitalClass = capital;
};
var actor1 = new myCountryClass('india', 'new delhi');
alert("New Object properties: " + actor1.mynameClass +
		", " + actor1.mycapitalClass +
		"\n" +
		"Anonymous Object properties: " + myCountry.myName +
			", " + myCountry.myCapital);