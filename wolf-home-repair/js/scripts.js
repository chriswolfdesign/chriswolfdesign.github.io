const TOTAL_IMAGES = 8;

$("document").ready(function() {
	let slide = 1;

	// TODO: Continue working on slideshow
	setInterval(function() {
		slide++;
		if(slide === 9) {
			slide = 1;
		}

		// BUG: Smooth out fadeout and fadein
		// $("#slideshow-image").fadeOut(1000);
		$("#slideshow-image").attr("src", "images/image" + slide + ".jpg");
		// $("#slideshow-image").fadeIn(1000);
	}, 3000);
});
