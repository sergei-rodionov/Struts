
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Register Page</title>
    </head>
    <body>

        <s:form action="Register">
            <s:textfield name="userName" label="User Name" />
            <s:password name="password" label="Password" />
            <s:radio name="gender" label="Gender" list="{'Male','Female'}" />
            <s:textfield name="age" label="Age"/>
            <s:select name="country" list="countryList" listKey="countryId"
                      listValue="countryName" headerKey="0" headerValue="Country"
                      label="Select a country" />
            <s:textarea name="about" label="About You" rows="5" cols="10"/>
            <s:checkboxlist list="communityList" name="community" label="Community" />
            <s:checkbox name="mailingList"
                        label="Would you like to join our mailing list?" />
            <s:submit />
        </s:form>
    </body>
</html>