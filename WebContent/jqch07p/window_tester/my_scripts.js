$(document).ready(function() {
	window.onfocus = focusResponse;
	window.onblur = blurResponse;
	function focusResponse() {
		$("#buildList").append("<li class='focus'>You came back</li>");
	}
	function blurResponse() {
		$("#buildList").append("<li class='blur'>You are leaving</li>");
	}
});