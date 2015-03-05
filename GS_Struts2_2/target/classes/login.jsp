<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<s:head/>

<s:property value="message"/>

<s:form action="LoginAction">
    <s:textfield name="username" label="User Name"/>
    <s:textfield name="password" label="Password"/>
    <s:submit/>
</s:form>

<s:a href="register.jsp">Register</s:a>

</body>
</html>
