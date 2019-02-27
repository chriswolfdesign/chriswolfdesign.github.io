// Set up original values and settings
$(document).ready(function() {
    // If the view technology button is clicked, have the technology sidebar
    // either slide into or out of view as appropriate
    $("#technology").click(function() {
        $("#technology-sidebar").animate({width: 'toggle'}, 90);
    });
});
