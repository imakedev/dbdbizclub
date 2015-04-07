<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<html>
<head>
<title>BizClub</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="robots" content="all">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/mobile7/css/style.css" />" media="all" />

<!-- Le styles -->
<link href="<c:url value="/resources/mobile7/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/mobile7/css/bootstrap-responsive.css" />" rel="stylesheet">
<script src="<c:url value="/resources/mobile7/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/mobile7/js/jssor.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/mobile7/js/jssor.slider.js" />"></script>

<!--//-->
<link rel="stylesheet" href="<c:url value="/resources/mobile7/css/responsivemobilemenu.css" />" type="text/css"/>
<script type="text/javascript" src="<c:url value="/resources/mobile7/js/responsivemobilemenu.js" />"></script>
<script>
        jQuery(document).ready(function ($) {
            var _SlideshowTransitions = [
                //Rotate Overlap
                { $Duration: 1200, $Zoom: 11, $Rotate: -1, $Easing: { $Zoom: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Round: { $Rotate: 0.5 }, $Brother: { $Duration: 1200, $Zoom: 1, $Rotate: 1, $Easing: $JssorEasing$.$EaseSwing, $Opacity: 2, $Round: { $Rotate: 0.5 }, $Shift: 90 } },
                //Switch
                { $Duration: 1400, x: 0.25, $Zoom: 1.5, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Zoom: $JssorEasing$.$EaseInSine }, $Opacity: 2, $ZIndex: -10, $Brother: { $Duration: 1400, x: -0.25, $Zoom: 1.5, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Zoom: $JssorEasing$.$EaseInSine }, $Opacity: 2, $ZIndex: -10 } },
                //Rotate Relay
                { $Duration: 1200, $Zoom: 11, $Rotate: 1, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Round: { $Rotate: 1 }, $ZIndex: -10, $Brother: { $Duration: 1200, $Zoom: 11, $Rotate: -1, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Round: { $Rotate: 1 }, $ZIndex: -10, $Shift: 600 } },
                //Doors
                { $Duration: 1500, x: 0.5, $Cols: 2, $ChessMode: { $Column: 3 }, $Easing: { $Left: $JssorEasing$.$EaseInOutCubic }, $Opacity: 2, $Brother: { $Duration: 1500, $Opacity: 2 } },
                //Rotate in+ out-
                { $Duration: 1500, x: -0.3, y: 0.5, $Zoom: 1, $Rotate: 0.1, $During: { $Left: [0.6, 0.4], $Top: [0.6, 0.4], $Rotate: [0.6, 0.4], $Zoom: [0.6, 0.4] }, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1000, $Zoom: 11, $Rotate: -0.5, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Shift: 200 } },
                //Fly Twins
                { $Duration: 1500, x: 0.3, $During: { $Left: [0.6, 0.4] }, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Outside: true, $Brother: { $Duration: 1000, x: -0.3, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },
                //Rotate in- out+
                { $Duration: 1500, $Zoom: 11, $Rotate: 0.5, $During: { $Left: [0.4, 0.6], $Top: [0.4, 0.6], $Rotate: [0.4, 0.6], $Zoom: [0.4, 0.6] }, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1000, $Zoom: 1, $Rotate: -0.5, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Shift: 200 } },
                //Rotate Axis up overlap
                { $Duration: 1200, x: 0.25, y: 0.5, $Rotate: -0.1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1200, x: -0.1, y: -0.7, $Rotate: 0.1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2 } },
                //Chess Replace TB
                { $Duration: 1600, x: 1, $Rows: 2, $ChessMode: { $Row: 3 }, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1600, x: -1, $Rows: 2, $ChessMode: { $Row: 3 }, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },
                //Chess Replace LR
                { $Duration: 1600, y: -1, $Cols: 2, $ChessMode: { $Column: 12 }, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1600, y: 1, $Cols: 2, $ChessMode: { $Column: 12 }, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },
                //Shift TB
                { $Duration: 1200, y: 1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1200, y: -1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },
                //Shift LR
                { $Duration: 1200, x: 1, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1200, x: -1, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },
                //Return TB
                { $Duration: 1200, y: -1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Brother: { $Duration: 1200, y: -1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Shift: -100 } },
                //Return LR
                { $Duration: 1200, x: 1, $Delay: 40, $Cols: 6, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Brother: { $Duration: 1200, x: 1, $Delay: 40, $Cols: 6, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Shift: -100 } },
                //Rotate Axis down
                { $Duration: 1500, x: -0.1, y: -0.7, $Rotate: 0.1, $During: { $Left: [0.6, 0.4], $Top: [0.6, 0.4], $Rotate: [0.6, 0.4] }, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1000, x: 0.2, y: 0.5, $Rotate: -0.1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2 } },
                //Extrude Replace
                { $Duration: 1600, x: -0.2, $Delay: 40, $Cols: 12, $During: { $Left: [0.4, 0.6] }, $SlideOut: true, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Assembly: 260, $Easing: { $Left: $JssorEasing$.$EaseInOutExpo, $Opacity: $JssorEasing$.$EaseInOutQuad }, $Opacity: 2, $Outside: true, $Round: { $Top: 0.5 }, $Brother: { $Duration: 1000, x: 0.2, $Delay: 40, $Cols: 12, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Assembly: 1028, $Easing: { $Left: $JssorEasing$.$EaseInOutExpo, $Opacity: $JssorEasing$.$EaseInOutQuad }, $Opacity: 2, $Round: { $Top: 0.5 } } }
            ];

            var _CaptionTransitions = [
            //CLIP|LR
            {$Duration: 900, $Clip: 3, $Easing: $JssorEasing$.$EaseInOutCubic },
            //CLIP|TB
            {$Duration: 900, $Clip: 12, $Easing: $JssorEasing$.$EaseInOutCubic },

            //DDGDANCE|LB
            {$Duration: 1800, x: 0.3, y: -0.3, $Zoom: 1, $Easing: { $Left: $JssorEasing$.$EaseInJump, $Top: $JssorEasing$.$EaseInJump, $Zoom: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $During: { $Left: [0, 0.8], $Top: [0, 0.8] }, $Round: { $Left: 0.8, $Top: 2.5} },
            //DDGDANCE|RB
            {$Duration: 1800, x: -0.3, y: -0.3, $Zoom: 1, $Easing: { $Left: $JssorEasing$.$EaseInJump, $Top: $JssorEasing$.$EaseInJump, $Zoom: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $During: { $Left: [0, 0.8], $Top: [0, 0.8] }, $Round: { $Left: 0.8, $Top: 2.5} },

            //TORTUOUS|HL
            {$Duration: 1500, x: 0.2, $Zoom: 1, $Easing: { $Left: $JssorEasing$.$EaseOutWave, $Zoom: $JssorEasing$.$EaseOutCubic }, $Opacity: 2, $During: { $Left: [0, 0.7] }, $Round: { $Left: 1.3} },
            //TORTUOUS|VB
            {$Duration: 1500, y: -0.2, $Zoom: 1, $Easing: { $Top: $JssorEasing$.$EaseOutWave, $Zoom: $JssorEasing$.$EaseOutCubic }, $Opacity: 2, $During: { $Top: [0, 0.7] }, $Round: { $Top: 1.3} },

            //ZMF|10
            {$Duration: 600, $Zoom: 11, $Easing: { $Zoom: $JssorEasing$.$EaseInExpo, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 },

            //ZML|R
            {$Duration: 600, x: -0.6, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2 },
            //ZML|B
            {$Duration: 600, y: -0.6, $Zoom: 11, $Easing: { $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2 },

            //ZMS|B
            {$Duration: 700, y: -0.6, $Zoom: 1, $Easing: { $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2 },

            //ZM*JDN|LB
            {$Duration: 1200, x: 0.8, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseOutCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },
            //ZM*JUP|LB
            {$Duration: 1200, x: 0.8, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },
            //ZM*JUP|RB
            {$Duration: 1200, x: -0.8, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },

            //ZM*WVR|LT
            {$Duration: 1200, x: 0.5, y: 0.3, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInWave }, $Opacity: 2, $Round: { $Rotate: 0.8} },
            //ZM*WVR|RT
            {$Duration: 1200, x: -0.5, y: 0.3, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInWave }, $Opacity: 2, $Round: { $Rotate: 0.8} },
            //ZM*WVR|TL
            {$Duration: 1200, x: 0.3, y: 0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Top: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Round: { $Rotate: 0.8} },
            //ZM*WVR|BL
            {$Duration: 1200, x: 0.3, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Top: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Round: { $Rotate: 0.8} },

            //RTT|10
            {$Duration: 700, $Zoom: 11, $Rotate: 1, $Easing: { $Zoom: $JssorEasing$.$EaseInExpo, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInExpo }, $Opacity: 2, $Round: { $Rotate: 0.8} },

            //RTTL|R
            {$Duration: 700, x: -0.6, $Zoom: 11, $Rotate: 1, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $Round: { $Rotate: 0.8} },
            //RTTL|B
            {$Duration: 700, y: -0.6, $Zoom: 11, $Rotate: 1, $Easing: { $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $Round: { $Rotate: 0.8} },

            //RTTS|R
            {$Duration: 700, x: -0.6, $Zoom: 1, $Rotate: 1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Zoom: $JssorEasing$.$EaseInQuad, $Rotate: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $Round: { $Rotate: 1.2} },
            //RTTS|B
            {$Duration: 700, y: -0.6, $Zoom: 1, $Rotate: 1, $Easing: { $Top: $JssorEasing$.$EaseInQuad, $Zoom: $JssorEasing$.$EaseInQuad, $Rotate: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $Round: { $Rotate: 1.2} },

            //RTT*JDN|RT
            {$Duration: 1000, x: -0.8, y: 0.5, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseOutCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },
            //RTT*JDN|LB
            {$Duration: 1000, x: 0.8, y: -0.5, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseOutCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },
            //RTT*JUP|RB
            {$Duration: 1000, x: -0.8, y: -0.5, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },
            {$Duration: 1000, x: -0.5, y: 0.8, $Zoom: 11, $Rotate: 1, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Top: $JssorEasing$.$EaseLinear, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Left: [0, 0.5] }, $Round: { $Rotate: 0.5 } },
            //RTT*JUP|BR
            {$Duration: 1000, x: -0.5, y: -0.8, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Top: $JssorEasing$.$EaseLinear, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Left: [0, 0.5]} },

            //R|IB
            {$Duration: 900, x: -0.6, $Easing: { $Left: $JssorEasing$.$EaseInOutBack }, $Opacity: 2 },
            //B|IB
            {$Duration: 900, y: -0.6, $Easing: { $Top: $JssorEasing$.$EaseInOutBack }, $Opacity: 2 },

            ];

            var options = {
                $AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
                $AutoPlaySteps: 1,                                  //[Optional] Steps to go for each navigation request (this options applys only when slideshow disabled), the default value is 1
                $AutoPlayInterval: 4000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
                $PauseOnHover: 1,                               //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1

                $ArrowKeyNavigation: true,   			            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false
                $SlideDuration: 500,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
                $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20
                //$SlideWidth: 600,                                 //[Optional] Width of every slide in pixels, default value is width of 'slides' container
                //$SlideHeight: 300,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container
                $SlideSpacing: 0, 					                //[Optional] Space between each slide in pixels, default value is 0
                $DisplayPieces: 1,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
                $ParkingPosition: 0,                                //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.
                $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
                $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1
                $DragOrientation: 3,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)

                $SlideshowOptions: {                                //[Optional] Options to specify and enable slideshow or not
                    $Class: $JssorSlideshowRunner$,                 //[Required] Class to create instance of slideshow
                    $Transitions: _SlideshowTransitions,            //[Required] An array of slideshow transitions to play slideshow
                    $TransitionsOrder: 1,                           //[Optional] The way to choose transition to play slide, 1 Sequence, 0 Random
                    $ShowLink: true                                    //[Optional] Whether to bring slide link on top of the slider when slideshow is running, default value is false
                },

                $CaptionSliderOptions: {                            //[Optional] Options which specifies how to animate caption
                    $Class: $JssorCaptionSlider$,                   //[Required] Class to create instance to animate caption
                    $CaptionTransitions: _CaptionTransitions,       //[Required] An array of caption transitions to play caption, see caption transition section at jssor slideshow transition builder
                    $PlayInMode: 1,                                 //[Optional] 0 None (no play), 1 Chain (goes after main slide), 3 Chain Flatten (goes after main slide and flatten all caption animations), default value is 1
                    $PlayOutMode: 3                                 //[Optional] 0 None (no play), 1 Chain (goes before main slide), 3 Chain Flatten (goes before main slide and flatten all caption animations), default value is 1
                },

                $BulletNavigatorOptions: {                                //[Optional] Options to specify and enable navigator or not
                    $Class: $JssorBulletNavigator$,                       //[Required] Class to create navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 0,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
                    $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1
                    $SpacingX: 10,                                   //[Optional] Horizontal space between each item in pixel, default value is 0
                    $SpacingY: 10,                                   //[Optional] Vertical space between each item in pixel, default value is 0
                    $Orientation: 1                                 //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1
                },

                $ArrowNavigatorOptions: {
                    $Class: $JssorArrowNavigator$,              //[Requried] Class to create arrow navigator instance
                    $ChanceToShow: 2                                //[Required] 0 Never, 1 Mouse Over, 2 Always
                }
            };

            var jssor_slider1 = new $JssorSlider$("slider1_container", options);
            //responsive code begin
            //you can remove responsive code if you don't want the slider scales while window resizes
            function ScaleSlider() {
                var parentWidth = jssor_slider1.$Elmt.parentNode.clientWidth;
                if (parentWidth)
                    jssor_slider1.$ScaleWidth(Math.min(parentWidth, 600));
                else
                    window.setTimeout(ScaleSlider, 30);
            }
            ScaleSlider();

            $(window).bind("load", ScaleSlider);
            $(window).bind("resize", ScaleSlider);
            $(window).bind("orientationchange", ScaleSlider);
            //responsive code end
        });
    </script>
    <script src="<c:url value="/resources/mobile7/js/jquery.color.js" />"></script>
    <script src="<c:url value="/resources/mobile7/js/searchscript.js" />"></script>
</head>
<body >
<div id="top_menu">
	<div id="box_top" class="container">
    	<div class="span4" style="padding:10px 0 0 20px;"><img src="<c:url value="/resources/mobile7/images/logo.png" />"></div>
        <div class="span7">                
        	<nav id="nav" role="navigation">
                <form id="searchForm">
                <fieldset>
                    <div class="input">
                        <input type="submit" id="searchSubmit" value="" />
                        <input type="text" name="s" id="s" value="Enter your search"  placeholder="Enter your search"/>                    </div>                    
                </fieldset>
                </form>
                <a href="#nav" title="Show navigation" style="position:absolute;top:0;left:90%;">Show navigation</a>
                <a href="#" title="Hide navigation" style="position:absolute;top:0;left:90%;">Hide navigation</a>
                <ul >
                    <li><a href="<c:url value="/" />">หน้าแรก</a></li>
                    <li>
                        <a href="#" aria-haspopup="true"><span>ข้อมูลทางการค้า</span></a>
                        <ul>
                            <li><a href="#">&raquo; ผลิตภัณฑ์</a></li>
                            <li><a href="#">&raquo; บริการ</a></li>
                        </ul>
                    </li>
                    <li><a href='<c:url value="/news" />'>ข่าวประชาสัมพันธ์</a></li>
                    <li><a href="#">ระบบรายงาน</a></li>
                    <li><a href="<c:url value="/page/searchmember" />">ระบบสมาชิก</a></li>
                    <li><a href="#">ติดต่อเรา</a></li>
                </ul>
            </nav>
        </div>
    </div>    
</div>
<div id="content" style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container">
    	<div class="span4">
        	<div class="news_topic">ข้อมูลทางการค้า</div>
            <div style="color:#FFFFFF;">" หากคุณกำลังมองหาธุรกิจ? ทำธุรกิจแล้ว มีปัญหากำลังหาหนทางแก้ไข ? ติดต่อ...... ขอคำแนะนำและปรึกษาจากผู้เชี่ยวชาญที่มี ประสบการณ์เฉพาะด้านอาทิ ด้านการ เริ่มต้นธุรกิจการตลาดการเงิน การบริหาร จัดการการตลาด E – Marketing กฎหมายธุรกิจ และธุรกิจแฟรนไชส์ "</div>
            <p><a class="btn" href="#">อ่านต่อ &raquo;</a></p>
        </div>
        <div class="span7">
        	<div class="box effect1">
                <div id="slider1_container" style="position: relative; width: 600px;height: 300px; overflow: hidden;">                
                <!-- Loading Screen -->
                <div u="loading" style="position: absolute; top: 0px; left: 0px;">
                    <div style="filter: alpha(opacity=70); opacity:0.7; position: absolute; display: block;
                        background-color: #000; top: 0px; left: 0px;width: 100%;height:100%;">
                    </div>
                    <div style="position: absolute; display: block; background: url(../img/loading.gif) no-repeat center center;
                        top: 0px; left: 0px;width: 100%;height:100%;">
                    </div>
                </div>                
                <!-- Slides Container -->
                <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 600px; height: 300px;
                    overflow: hidden;">
                    <div>
                        <a u=image href="#"><img src="<c:url value="/resources/mobile7/images/new01.jpg" />" /></a>
                        <div u=caption t="*" class="captionOrange"  style="position:absolute; left:20px; top: 30px; width:300px; height:30px;"> 
                        random caption transition
                        </div>
                    </div>
                    <div>
                        <a u=image href="#"><img src="<c:url value="/resources/mobile7/images/new03.jpg" />" /></a>
                        <div u=caption t="*" class="captionOrange"  style="position:absolute; left:20px; top: 30px; width:300px; height:30px;"> 
                        mobile ready, touch swipe
                        </div>
                    </div>
                </div>
                <style>
                    .jssorb01 div, .jssorb01 div:hover, .jssorb01 .av
                    {
                        filter: alpha(opacity=70);
                        opacity: .7;
                        overflow:hidden;
                        cursor: pointer;
                        border: #000 1px solid;
                    }
                    .jssorb01 div { background-color: gray; }
                    .jssorb01 div:hover, .jssorb01 .av:hover { background-color: #d3d3d3; }
                    .jssorb01 .av { background-color: #fff; }
                    .jssorb01 .dn, .jssorb01 .dn:hover { background-color: #555555; }
                </style>
                <!-- bullet navigator container -->
                <div u="navigator" class="jssorb01" style="position: absolute; bottom: 16px; right: 10px;">
                    <!-- bullet navigator item prototype -->
                    <div u="prototype" style="POSITION: absolute; WIDTH: 12px; HEIGHT: 12px;"></div>
                </div>
                <!-- Bullet Navigator Skin End -->
                
                <!-- Arrow Navigator Skin Begin -->
                <style>
                    .jssora05l, .jssora05r, .jssora05ldn, .jssora05rdn
                    {
                        position: absolute;
                        cursor: pointer;
                        display: block;
                        background: url(images/a17.png) no-repeat;
                        overflow:hidden;
                    }
                    .jssora05l { background-position: -10px -40px; }
                    .jssora05r { background-position: -70px -40px; }
                    .jssora05l:hover { background-position: -130px -40px; }
                    .jssora05r:hover { background-position: -190px -40px; }
                    .jssora05ldn { background-position: -250px -40px; }
                    .jssora05rdn { background-position: -310px -40px; }
                </style>
                <!-- Arrow Left -->
                <span u="arrowleft" class="jssora05l" style="width: 40px; height: 40px; top: 123px; left: 8px;">
                </span>
                <!-- Arrow Right -->
                <span u="arrowright" class="jssora05r" style="width: 40px; height: 40px; top: 123px; right: 8px">
                </span>
                </div>   
                <!--//end-->         
            </div>
        </div>
    </div>
</div>
<div class="container" style="margin:0 auto; padding-top:30px; padding-bottom:30px;">
      <div class="row">
        <div class="span4">
          <img src="<c:url value="/resources/mobile7/images/n1.jpg" />" class="img-thumbnail" data-src="<c:url value="/resources/mobile7/holder.js/140x140" />">
          <h2>KIP Awards 2013</h2>
          <p>KIP Awards 2013 ร่วมเป็นคณะกรรมการตัดสินการประกวดของดีเมืองโคราช (KIP Awades 2013) วันที่ 11 ธันวาคม 2556 ณ หอการค้าจังหวัดนครราชสีมา</p>
          <p><a class="btn" href="#">อ่านต่อ &raquo;</a></p>
        </div><!-- /.span4 -->
        <div class="span4">
          <img src="<c:url value="/resources/mobile7/images/n1.jpg" />" class="img-thumbnail" data-src="<c:url value="/resources/mobile7/holder.js/140x140" />">
          <h2>KIP Awards 2013</h2>
          <p>KIP Awards 2013 ร่วมเป็นคณะกรรมการตัดสินการประกวดของดีเมืองโคราช (KIP Awades 2013) วันที่ 11 ธันวาคม 2556 ณ หอการค้าจังหวัดนครราชสีมา</p>
          <p><a class="btn" href="#">อ่านต่อ &raquo;</a></p>
        </div><!-- /.span4 -->
        <div class="span4">
          <img src="<c:url value="/resources/mobile7/images/n1.jpg" />" class="img-thumbnail" data-src="<c:url value="/resources/mobile7/holder.js/140x140" />">
          <h2>KIP Awards 2013</h2>
          <p>KIP Awards 2013 ร่วมเป็นคณะกรรมการตัดสินการประกวดของดีเมืองโคราช (KIP Awades 2013) วันที่ 11 ธันวาคม 2556 ณ หอการค้าจังหวัดนครราชสีมา</p>
          <p><a class="btn" href="#">อ่านต่อ &raquo;</a></p>
        </div><!-- /.span4 -->
      </div><!-- /.row -->  
</div>
  
<div id="footer">
	<div class="container">
	<div id="footer_body" class="clear">
        <div  class="box_contact">
            <div  class="topic_contact">สำนักพัฒนาผู้ประกอบธุรกิจ กรมพัฒนาธุรกิจการค้า กระทรวงพาณิชย์</div>
            <div>เลขที่ 44/100 ถนน นนทบุรี 1 ต.บางกระสอ อ.เมือง จ.นททบุรี 11000</div>
            <div>โทรศัพท์: 02-547-5962</div>
            <div>โทรสาร: 02-547-5963-64</div>
            <div>email: training@dbd.go.th</div>
        </div>
        <div style="float:right;width:300px;" >
        	<div  style="text-align:right;">
            	<a href="#"><img src="<c:url value="/resources/mobile7/images/btn_f.png" />"></a>&nbsp;<a href="#"><img src="<c:url value="/resources/mobile7/images/btn_t.png" />"></a>
            </div>
        </div>
    </div>
    </div>
</div>
</body>
</html>
<script src="<c:url value="/resources/mobile7/js/doubletaptogo.js" />"></script>
<script>
	$( function()
	{
		$( '#nav li:has(ul)' ).doubleTapToGo();
	});
</script>