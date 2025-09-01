<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@page import="java.util.ArrayList, java.util.Iterator" isELIgnored="false"%>
<html>
<body bgcolor="orange">
<h1>Without EL and using java code</h1>
<%	
Object object = session.getAttribute("LISTNAMES");
if(object != null){
	ArrayList arl = (ArrayList)object;
	Iterator itr = arl.iterator();
	while(itr.hasNext()){
		out.println(itr.next());
	}
}
%>
</body>
</html>