BOOTSTRAP

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-
0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>            //bootstrap

<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"/>          //font awesome library for icons

Classes:

container-fluid        //to make everything mobile responsive, all elements, , take up the entire screen
container              //to have a fixed width, not take up the entire screen
img-responsive         //to resize image according to the screen size
img-rounded            //rounded corners
img-circle             //circular image
embed-responsive       //embedding videos, used with <div>
embed-responsive-xbyy  //used with <div>
embed-responsive-item  //used with <iframe src="www.youtube.com/embed/***video code***"></iframe>
btn                    //bootstrap buttons
btn-block              //button which fills the entire horizontal space irrespective of the length of text
btn-primary            //adds blue(primary) color to button
btn-info               //adds light blue color to button
btn-danger             //adds red color to button
btn-default            //default class for buttons 
row                    //arranges elements in a row
col-xs-*               //specifies how many columns should an element span, * is a number, xs-extra small, used for mobile devices, splitting a row into columns
col-md-*               //specifies how many columns should an element span, * is a number, md-medium, used for laptops/desktops, splitting a row into columns
col-lg-*               //specifies how many columns should an element span, * is a number, lg-large, used for large desktops, splitting a row into columns
col-sm-*               //specifies how many columns should an element span, * is a number, sm-small, used for tablets, splitting a row into columns
text-primary           //turns the text blue(primary)
text-center            //centralizes the text
text-danger            //turns the text red
text-muted             //disabled text
text-success           //turns the text green
***replace 'text' with 'bg' in order to change background color***
table                  //bootstrap tables, used with <table> 
table-condensed        //less padding
table-stripes          //alternate colour tint on rows
fa                     //font awesome icons
fa-thumbs-up           //thumbs-up icon, <i class="fa fa-thumbs-up">..text..</i>, i stands for icon
fa-info-circle         //info icon 
fa-trash               //delete icon
fa-paper-plane         //paper-plane icon
form-control
well                   //creates a visual sense of depth for columns
well-small             //a well with less padding
alert                  //colored well
alert-success          //green
alert-info             //blue
alert-danger           //red
fade in                //when closed, alert box fades in
***<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>*** //used in alert div, cross symbol to make the alert well disappear




Text styles:

<code></code>
<pre></pre>
<kbd></kbd>
<blockquote></blockquote>
<footer></footer>



Creating a navigation bar:

<nav class="navbar navbar-default"> //navbar-inverse inverses the color-scheme, replaces navba-default
<div class="container-fluid">
<!-- Logo -->
<div class="navbar-header">
<a href="" class="navbar-brand">....</a>
</div>
<!--Menu items-->
<div>
<ul class="nav navbar-nav">
<li class="active">..</li>
<li>..</li>
</ul>
</div>
</div>
</nav>

Creating a drop-down menu:
<nav class="navbar navbar-default"> //navbar-inverse inverses the color-scheme, replaces navba-default
<div class="container-fluid">
<!-- Logo -->
<div class="navbar-header">
<a href="" class="navbar-brand">....</a>
</div>
<!--Menu items-->
<div>
<ul class="nav navbar-nav">
<li class="active">..</li>
<li>..</li>
<!--dropdown menu--> //part of menu items
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">..<span class="caret"></span></a>
<ul class="dropdown">
<li>..</li>
<li>..</li>
</ul>
</li>
</ul>
<!--menu items:right-->
<ul class="nav navbar-nav navbar-right">
..
..
..
</ul>

Adding a toggle button:
<nav class="navbar navbar-default"> //navbar-inverse inverses the color-scheme, replaces navba-default
<div class="container-fluid">
<!-- Logo -->
<div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mainNavBar">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
<a href="" class="navbar-brand">....</a>
</div>
<!--Menu items-->
<div class="collapse navbar-collapse" id="mainNavBar">
<ul class="nav navbar-nav">
<li class="active">..</li>
<li>..</li>
</ul>
</div>
</div>
</nav>







***Not every class needs to have corresponding CSS. Sometimes we create classes just for the purpose of selecting these elements more easily using jQuery.***
***When we start using jQuery, we will modify HTML elements without needing to actually change them in HTML.***