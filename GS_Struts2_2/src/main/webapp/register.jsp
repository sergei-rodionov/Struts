<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
       <h2>Registration</h2>
<s:form action="RegisterAction">
    <s:textfield name="username" label="User Name"/>
    <s:textfield name="password" label="Password"/>
    <s:submit/>
</s:form>

</body>
</html>
