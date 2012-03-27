function resizeFrame(x) {
	var height = document.getElementById(x).contentWindow.document.body.scrollHeight;
	document.getElementById(x).height = height;
}