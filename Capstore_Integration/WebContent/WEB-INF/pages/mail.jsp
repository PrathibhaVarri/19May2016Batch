<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="/Capstore_Integration/images/email.jpg">

<h1><font color="blue">Send mail</font></h1>

<form action="MAILTO:alagendran.soundararajan@capgemini.com?subject=from Capstore" method="post" enctype="text/plain">
<table>
                    <tr>
                    <td><font color="blue"> Type your Content :</font></td><br><br>
                    <td><textarea cols="100" rows="20" name="message"></textarea></td>
                     </tr>
</table>
<input type="submit" value="Send">
<input type="reset" value="Reset">
</form>

</body>
</html>
