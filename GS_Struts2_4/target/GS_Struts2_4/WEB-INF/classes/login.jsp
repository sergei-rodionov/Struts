<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Login</title>
</head>
<body>

<s:form action="Login">
    <s:textfield name="username" value="" label="User Name"/>
    <s:textfield name="password" value="" label="Password"/>
    <s:submit/>
</s:form>

</body>
</html>
