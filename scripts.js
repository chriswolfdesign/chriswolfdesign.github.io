/**
 * scripts.js
 *
 * Determines the behavior of index.html
 *
 * @author Chris Wolf
 * @version 1.0.0 (March 19, 2019)
 * @contact chriswolfdesign@gmail.com
 */

// Set up original values and settings
$(document).ready(function() {
    // If the view technology button is clicked, have the technology sidebar
    // either slide into or out of view as appropriate
    $("#technology").click(function() {
        $("#technology-sidebar").animate({width: 'toggle'}, 90);
    });
});
