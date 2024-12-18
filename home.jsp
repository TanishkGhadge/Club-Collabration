<%-- 
    Document   : home
    Created on : 7 Apr, 2024, 11:38:42 AM
    Author     : Pankaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>

        
<link rel="stylesheet" href="./teamstyle.css">
<link rel="stylesheet" href="./style1.css">
<link rel="stylesheet" href="./bootstrap.css">



    </head>
    <body >
        <a href="./index2.html">Sign Out</a>
        <%
        String username = (String)session.getAttribute("username");
        if(username == null)
        {
            response.sendRedirect("login.html");
        }
        %>
        <h1>Hello <%=username%>...!</h1>
        <h2>Login Successful..</h2>
        
        
        <section id="selling"> 
        
         <h1>SVVV Clubs</h1><br><br>
	<div class="selling-row">
		<div class="selling-box">
			<div>
				<img src="uniclub/riyaz.jpeg">
			</div>
			<h3>RIYAAZ</h3>
			 <a href="./riyaaz.html"><button class="c-btn">Read more</button></a><br>
		</div>
		<div class="selling-box">
			<div>
				<img src="uniclub/icf.jpeg">

			</div>
			<h3>ICF</h3>
           <a href="./icfsvvv.html"><button class="c-btn">Read more</button></a></div> <br>
		
		<div class="selling-box">
			<div>
				<img src="uniclub/prayatna.jpeg">

			</div>
			<h3>PRAYATNA</h3>
			<a href="./prayatna.html"><button class="c-btn">Read more</button></a> 
		</div>
		<div class="selling-box">
			<div>
				<img src="uniclub/gdsc.jpeg">

			</div>
			<h3>GDSC</h3>
         <a href=" https://gdg.community.dev/gdg-on-campus-shri-vaishnav-vidyapeeth-vishwavidyalaya-indore-india/"><button class="c-btn">Read more</button></a> 
		</div>
	</div>
        
        
        </section>
       
        
        
        
    </body>
</html>
