function addOne(num) {
	return num + 1;
}

var plusOne = addOne;

var result = plusOne(1);

// no function name
function(num) {
	return num + 1;
}

var f = function(num) {
	return num + 1;
}

var result = f(1);
alert(result);