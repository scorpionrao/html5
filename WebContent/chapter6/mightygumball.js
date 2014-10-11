window.onload = function() {
/**
	var url = "http://localhost:8080";
	var requestObject = new XMLHttpRequest();
	requestObject.open("GET", url);
	requestObject.onload = function() {
		if (requestObject.status == 200) {
			updateSales(requestObject.responseText);
		}
	};
	requestObject.send(null);
**/
	setInterval(handleRefresh, 3000);
};

function handleRefresh() {
	var url = "http://gumball.wickedlysmart.com?callback=updateSales";
	var newScriptElement = document.createElement("script");
	newScriptElement.setAttribute("src", url);
	newScriptElement.setAttribute("id", "jsonp");
}

//function updateSales(responseText) {
function updateSales(sales) {
	var salesDiv = document.getElementById("sales");
	//var sales = JSON.parse(responseText);
	for (var i = 0; i < sales.length; i++) {
		var sale = sales[i];
		var div = document.createElement("div");
		div.setAttribute("class", "saleItem");
		div.innerHTML = sale.name + " sold " +
			sale.sales + " gumballs";
		salesDiv.appendChild(div);
	}
	
}