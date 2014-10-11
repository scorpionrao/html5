function createRequest() {
	try {
		request = new XMLHttpRequest();
	} catch (tryMS) {
		try {
			request = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (otherMS) {
			try {
				request = new ActiveXObject("Micrsoft.XMLHTTP");
			} catch (failed) {
				request = null;
			}
		}
	}
	return request;
}