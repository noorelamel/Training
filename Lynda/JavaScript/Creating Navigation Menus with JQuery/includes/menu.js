/*  JavaScript Document                      */
/*  Written by Chris Converse for lynda.com  */

$(document).ready(function(){
	$('.nav_menu .dropdown').css('display', 'block');
	$('.nav_menu > ul').dropmenu({
		effect : 'slide',
		speed : 250,
		timeout : 0,
		nbsp : false
	});
	$('li').has('ul').find('> a').addClass('indicator');
});

	