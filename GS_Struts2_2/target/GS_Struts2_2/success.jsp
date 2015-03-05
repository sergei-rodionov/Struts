<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>

    Hello <b><s:property value="username"/>
    </b> &nbsp; your password <b><s:property value="password"/></b>
    <s:property value="message"/>

    <s:a href="login.jsp">try to login</s:a>

</body>
</html>