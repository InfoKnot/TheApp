<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<?php $root="../../"; ?>
<html>
	<head>
		<title>InfoKnot - Market Research</title>
		<script type="text/javascript" src="resources/js/data.js"></script>
		<link rel="stylesheet" type="text/css" href=<?php echo "'".$root."resources/css/common.css'"; ?> />
		<link rel="stylesheet" type="text/css" href="resources/css/data.css"/>
	</head>
	<body onload="resizeFrame('frame')">
		<?php include($root."header.html"); ?>
		<div id="content">
			<div class="space"></div>
			<a href=<?php echo "'".$root."product'"; ?>><- Back To Product Page</a>
			<p>Some percentages have not been calculated correctly in the following charts.</p>
			<iframe id="frame" src="resources/KSUMobileAccess.pdf"></iframe>
			<div class="space"></div>
		</div>
		<?php include($root."footer.html"); ?>
	</body>
</html>