<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<jsp:useBean id="STO" class="com.cluster.to.StudentTO" scope="session"/>

<html>
<body bgcolor="orange">
<h1>TO output using standard actions</h1>
Student details are:<br>
STUDENT ID	:<jsp:getProperty name="STO" property="studentId"/> <br>
NAME 		:<jsp:getProperty name="STO" property="name"/> <br>
PHONE 		:<jsp:getProperty name="STO" property="phone"/> <br>

Address Details are:<br>
AREA 		:<jsp:getProperty name="STO" property="address"/> <br>
CITY		: 
COUNTRY		: 

</body>
</html>