<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="orange">
<h1>
<%
String x = request.getHeader("host");
String y = request.getHeader("user-agent");
String z = request.getHeader("accept-encoding");
String a = request.getHeader("accept-language");
%>
Value of header is: <%=x %> <br>
Value of header is: <%=y %> <br>
Value of header is: <%=z %> <br>

 </h1>
</body>
</html>