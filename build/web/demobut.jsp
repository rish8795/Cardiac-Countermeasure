<%-- 
    Document   : demobut
    Created on : 29 Feb, 2016, 5:24:51 PM
    Author     : rishabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	
        <link rel="stylesheet" href="buttonstyle.css"/>
	<style type="text/css">
		/*this is just to organize the demo checkboxes*/
		label {margin-right:20px;}
	</style></head>
<body>
    <h1 style="margin:0; margin-top:10px; padding:0; padding-left:25px; padding-bottom:10px; font-family:cursive;">Who are you?</h1>
    <div style="background:#444; color:#fafafa; padding:10px;">
        <h3>Select your Category</h3>
        <table>
            <tr>
                <td>
                    <input style="color: #009900" type="checkbox"  name="User" id="checkboxG1" class="css-checkbox" />
                    <label for="User" class="css-label">
                        <a href="">User</a>
                    </label>
                    <input type="checkbox" name="Laboratory" id="checkboxG1" class="css-checkbox"/>
                    <label for="Laboratory" class="css-label">
                        <a href="laboratory_reg.jsp" class="css-label">Laboratory</a>
                    </label>
                </td>
                <td>
                    <input type="checkbox" name="Laboratory" id="checkboxG3" class="css-checkbox" />
                    <label for="Laboratory" class="css-label">
                        Laboratory
                    </label>
                </td>
                <td>
                    <input type="checkbox" name="Hospital" id="checkboxG3" class="css-checkbox" />
                    <label for="hospital" class="css-label">
                        Option 1
                    </label>
                </td>
            </tr>
        </table>
    </div>
    <div style="background:#fafafa; color:#222; padding:10px;">
        <h3>Light Background</h3>
        <table>
            <tr>
                <td>
                    <input type="checkbox" name="checkboxG4" id="checkboxG4" class="css-checkbox" />
                    <label for="checkboxG4" class="css-label">
                        Option 1
                    </label>
                </td>
                <td>
                    <input type="checkbox" name="checkboxG5" id="checkboxG5" class="css-checkbox" checked="checked"/>
                    <label for="checkboxG5" class="css-label">
                        Option 2
                    </label>
                </td>
                <td>
                    <input type="checkbox" name="checkboxG6" id="checkboxG6" class="css-checkbox" />
                    <label for="checkboxG6" class="css-label">
                        Option 1
                    </label>
                </td>
            </tr>
        </table>
    </div>
		
		</body>
		</html>