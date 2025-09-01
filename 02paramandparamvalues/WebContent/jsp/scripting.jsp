<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1>
<%	
	String strFname = request.getParameter("fname");
	String strLname = request.getParameter("lname");
	String strPh = request.getParameter("ph");
	String arrPh[] = request.getParameterValues("ph");
%>

	First Name 		:<%=strFname %><br> 
	Last Name		:<%=strLname %><br>
	Primary Phone	:<%=strPh %><br>
	Primary Phone	:<%=arrPh[0] %><br>
	Secondary Phone	:<%=arrPh[1] %><br>
	
</body>
</html>