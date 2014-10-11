window.onload = init;

function init() {
	var element1 = document.getElementById("events");
	addEventHandler(element1, "click", reaction1);
	addEventHandler(element1, "click", reaction2);
	addEventHandler(element1, "click", reaction3);
}

function doWork(button, elementId) {
	var tempElement = document.getElementById(elementId);
	tempElement.innerHTML = this.id + tempElement.innerHTML;
}

function reaction1() {
	// this is element1
	doWork(this, "reaction1");
}

function reaction2() {
	doWork(this, "reaction2");
}

function reaction3() {
	doWork(this, "reaction3");
}

