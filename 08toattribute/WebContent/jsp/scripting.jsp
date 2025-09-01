<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@page import="com.cluster.to.StudentTO"%>
<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1>
<%	
StudentTO stu = null;
Object object = session.getAttribute("STO");
if(object != null){
	stu = (StudentTO)object;
}
%>

	Student ID 	:<%= stu.getStudentId() %><br> 
	Name		:<%= stu.getName() %><br>
	Phone		:<%=stu.getPhone() %><br>
	
</body>
</html>