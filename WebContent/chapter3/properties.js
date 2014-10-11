var fido = {
		name: "Fido",
		weight: 40,
		breed: "Mixed",
		loves: ["walks", "fetching balls"],
		bark: function() {
			alert("Woof woof");
		}
};

if (fido.weight > 25) {
	alert("WOOF");
} else {
	alert("yip");
}

var breed = fido["breed"];
if (breed == "mixed") {
	alert("Best in show");
}

fido.weight = 27;
fido.breed = "Chawalla/Great Dane mix";
fido.loves.push("chewing bones");

var prop;
for (prop in fido) {
	alert("Fido has a " + prop + " property ");
	if (prop == "name") {
		alert("This is " + fido[prop]);
	}
}

var likes = fido.loves;
var likesString = "Fido likes";
for (var i=0; i<likes.length; i++) {
	likesString += " " + likes[i];
}
alert(likesString);

function bark(dog) {
	if (dog.weight > 25) {
		alert("WOOF");
	} else {
		alert("yip");
	}
}
bark(fido);

fido.bark();