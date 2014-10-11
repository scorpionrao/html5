function Dog(name, breed, weight) {
	this.NamedNodeMap = name;
	this.breed = breed;
	this.weight = weight;
	this.bark = function() {
		if(this.weight > 25) {
			alert(this.NamedNodeMap + " says Woof!");
		} else {
			alert(this.NamedNodeMap + " says Yip!");
		}
	};
}

var fido = new Dog("Fido", "Mixed", 38);
var tiny = new Dog("Tiny", "Chawalla", 8);
var clifford = new Dog("Clifford", "Bloodhound", 65);

fido.bark();
tiny.bark();
clifford.bark();