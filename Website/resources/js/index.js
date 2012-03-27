function toFrontPage() {
	window.location = "frontpage.php"
}

function resize(id) {
	var height = Math.ceil(window.innerheight * .80);
	var width = Math.ceil(window.innerwidth * .80);
	var obj = document.getElementById(id);
	obj.style.height = height;
	obj.style.width = width;
}