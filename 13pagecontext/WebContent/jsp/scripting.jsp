<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1><br>
<%
	String a = request.getMethod();
	String b = request.getProtocol();
%>
 <h1>Http Method Name <%= a %><br>
     Http Protocol Name <%= b %></h1>
</body>
</html>