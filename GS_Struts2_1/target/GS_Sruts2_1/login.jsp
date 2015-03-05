<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<s:head />
<s:form action="LoginAction">
    <s:textfield name="username" label="User Name"/>
    <s:textfield name="password" label="Password"/>
    <s:submit/>
</s:form>

</body>
</html>
