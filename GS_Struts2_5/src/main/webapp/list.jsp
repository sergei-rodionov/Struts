<%@ taglib prefix="s" uri="/struts-tags" %>

<p>Users</p>
<s:if test="userList.size > 0">
    <table border="1">
        <tr>
            <td>Login</td>
            <td>Email</td>
            <td>Actions</td>
        </tr>
        <s:iterator value="userList">
            <tr id="row_<s:property value="userId"/>">
                <td>
                    <s:property value="login"/>
                </td>
                <td>
                    <s:property value="email"/>
                </td>
                <td>
                    <s:url id="removeUrl" action="Remove">
                        <s:param name="id" value="userId"/>
                    </s:url>
                    <s:a href="%{removeUrl}" targets="userList">Remove</s:a>
                    <s:url id="editUrl" action="Edit">
                        <s:param name="id" value="userId"/>
                    </s:url>
                    <s:a href="%{editUrl}" targets="userList">Edit</s:a>
                </td>
            </tr>
        </s:iterator>
    </table>

    <s:form action="Save">
        <s:push value="user">
            <s:hidden name="userId" />
            <s:textfield name="login" label="Login"/>
            <s:password name="password" label="Password"/>
            <s:textfield name="email" label="Email"/>
            <s:submit/>
        </s:push>

    </s:form>
</s:if>
