<%-- 
    Document   : buttons
    Created on : 29 Feb, 2016, 2:23:26 PM
    Author     : rishabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="containers"> 
<h3>Checkboxes</h3> 
<input id="checkbox1" name="checkbox1" checked="checked" type="checkbox" value="I am Checkbox 1" tabindex="1" /><label for="checkbox1">Checked by Default</label><br/><br/> 
<input id="checkbox2" name="checkbox2" type="checkbox" value="I am Checkbox 2" tabindex="2" /><label for="checkbox2">I am Checkbox 2</label><br/><br/> 
<input id="checkbox3" name="checkbox3" type="checkbox" value="I am Checkbox 3" disabled="disabled" tabindex="3" /><label for="checkbox3">Checkbox - Disabled</label><br/><br/> 
<input id="checkbox4" name="checkbox4" checked="checked" type="checkbox" disabled="disabled" value="I am Checkbox 4" tabindex="4" /><label for="checkbox1">Checked by Default</label> 
</div> 
<div class="containers"> 
<h3>Radio Buttons - Grouped</h3> 
<input id="radio1" name="groupradio" checked="checked" type="radio" value="Radio 1" tabindex="5" /><label for="radio1">Checked by Default</label><br/><br/> 
<input id="radio2" name="groupradio" type="radio" value="Radio 2" tabindex="6" /><label for="radio2">I am Group Radio 2</label><br/><br/> 
<input id="radio3" name="groupradio" type="radio" value="Radio 3" disabled="disabled" tabindex="7" /><label for="radio3">RadioButton - Disabled</label><br/><br/> 
<input id="radio4" checked="checked" type="radio" value="Radio 4" disabled="disabled" tabindex="8" /><label for="radio1">Checked by Default</label> 

</div> 


<style type="text/css"> 
input[type='radio'], input[type='checkbox'] {
 opacity: 0;
 position: absolute;
 filter: alpha(opacity=0);
 margin: 5px 0 0 5px;
}

input[type='radio']:focus+label, input[type="checkbox"]:focus+label {
 color: #C30;
}

input[type="checkbox"]+label, input[type="radio"]+label {
 background: url('http://html-generator.weebly.com/files/theme/checkboxe.png') left top no-repeat;
 position: relative;
 margin: 0;
 padding: 0 0 0 50px;
 cursor: pointer;
 line-height: 43px;
 min-height: 43px;
 display: inline-block;
 z-index: 0;
 font-size: 20px;
 font-weight: bold;
}

input[type="checkbox"]+label {
 background-position: 0 0;
}

input[type="radio"]+label {
 background-position: 0 -200px;
}

input[type='checkbox']:checked+label {
 background-position: 0 -100px;
}

input[type='radio']:checked+label {
 background-position: 0 -300px;
}

input[type='checkbox']:disabled+label {
 background-position: 0 -400px;
 color: #999;
}

input[type='radio']:disabled+label {
 background-position: 0 -600px;
 color: #999;
}

input[type='checkbox']:disabled:checked+label {
 background-position: 0 -500px;
 color: #999;
}

input[type='radio']:disabled:checked+label {
 background-position: 0 -700px;
 color: #999;
}
</style>
<input type="checkbox" id="c1" name="cc" />
 <label for="c1"><span></span>Check Box 1</label>
 <p>
 <input type="checkbox" id="c2" name="cc"checked />
 <label for="c2"><span></span>Check Box 2</label>
 <p>
 <input type="radio" id="r1" name="rr" />
 <label for="r1"><span></span>Radio Button 1</label>
 <p>
 <input type="radio" id="r2" name="rr" checked/>
 <label for="r2"><span></span>Radio Button 2</label>



<style>
body {
 margin: 18px 99px auto;
}

div#show {
 width: 280px;
 height: 200px;
 padding: 20px;
 position: absolute;
 left: 50%;
 margin-left: -120px;
 top: 50%;
 margin-top: -160px;
 background: #40464b;
 border-radius: 6px;
}

h1 {
 font-size: 14px;
 color: #f2f2f2;
 text-align: center;
 margin: 0 0 20px;
 padding: 0;
 font-family: Arial;
}

input[type="checkbox"] {
 display: none;
}

input[type="checkbox"] + label {
 color: #000;
 font-family: Arial, sans-serif;
 font-size: 14px;
}

input[type="checkbox"] + label span {
 display: inline-block;
 width: 19px;
 height: 19px;
 margin: -3px 4px 0 0;
 vertical-align: middle;
 background: url(http://html-generator.weebly.com/files/theme/checkboxb.png) left top no-repeat;
 cursor: pointer;
}

input[type="checkbox"]:checked + label span {
 background: url(http://html-generator.weebly.com/files/theme/checkboxb.png) -19px top no-repeat;
}

input[type="radio"] {
 display: none;
}

input[type="radio"] + label {
 color: #000;
 font-family: Arial, sans-serif;
 font-size: 14px;
}

input[type="radio"] + label span {
 display: inline-block;
 width: 19px;
 height: 19px;
 margin: -3px 4px 0 0;
 vertical-align: middle;
 background: url(http://html-generator.weebly.com/files/theme/checkboxb.png) -38px top no-repeat;
 cursor: pointer;
}

input[type="radio"]:checked + label span {
 background: url(http://html-generator.weebly.com/files/theme/checkboxb.png) -57px top no-repeat;
}
</style>


        <h1>Hello World!</h1>
    </body>
</html>
