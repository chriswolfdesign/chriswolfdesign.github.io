// Set up original values and settings
$(document).ready(function() {
    $("#technology-sidebar").hide();

    // If the view technology button is clicked, have the technology sidebar
    // either slide into or out of view as appropriate
    $("#technology").click(function() {
        console.log("I was clicked.");
        $("#technology-sidebar").animate({width: 'toggle'}, 90);
        // $("#technology-sidebar").show("slide", {direction: "left"}, 100000);
    });
});
