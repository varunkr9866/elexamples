<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1>
<%	
	String a = (String)request.getAttribute("NAME");
	String b = (String)session.getAttribute("NAME");
	String c = (String)application.getAttribute("NAME");
%>

	First Name 	:<%= a %><br> 
	Last Name	:<%= b %><br>
	Phone		:<%= c %><br>
	
</body>
</html>