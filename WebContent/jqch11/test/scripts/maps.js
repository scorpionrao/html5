$(document).ready(function() {
	var map;
	function initialize() {
		var latlng = new google.maps.LatLng(45.519098, -122.672138);
		
		var mapOpts = {
				zoom:		13,
				center:		latlng,
				mapTypeId:	google.maps.MapTypeId.HYBRID
		};
		map = new google.maps.Map(document.getElementById("map_canvas"),
				mapOpts);
	}
	initialize();
	
	function getAllSightings() {
		$.getJSON("service.php?action=getAllSightings", function(json) {
			if (json.sightings.length > 0) {
				$("#sight_list").empty();
				$.each(json.sightings, function() {
					var info = 'Date: ' + this['date'] 
						   + ', Type: ' + this['type'];
					var $li = $("<li />");
					$li.html(info);
					$li.addClass("sightings");
					$li.attr('id', this['id']);
					$li.appendTo("#sight_list");
				});
			}
		});
	}
	getAllSightings();
});