var randomLoc = Math.floor(Math.random() * 5);
console.log("Random = " + randomLoc);
var location1 = randomLoc;
var location2 = location1 + 1;
var location3 = location1 + 2;

var guess;
var hits = 0;
var guesses = 0;

var isSunk = false;

while (isSunk == false) {
	guess = prompt("Ready, aim, fire! (enter a number 0-6) :");
	if (guess < 0 || guess > 6) {
		alert("Please enter a valid cell number!");
	} else {
		guesses = guesses + 1;
		console.log("Guesses = " + guesses);
		if (guess == location1 || guess == location2 || guess == location3) {
			alert("HIT");
			hits = hits + 1;
			console.log("Hits = " + hits);
			if (hits == 3) {
				isSunk = true;
				alert("You sank my battleship!");
				var stats = "You took " + guesses + " guesses to sink the battleship, " +
				"which means your shooting accuracy was " + (3/guesses);
				alert(stats);
			}
		} else {
			alert("MISS");
		}
		
	}
	
}