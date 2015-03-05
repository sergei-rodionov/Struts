package interceptor;

import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Action;


/**
 * Created by IntelliJ IDEA.
 * User: gb
 * Date: 30.08.2009
 * Time: 15:37:57
 * To change this template use File | Settings | File Templates.
 */
public class LoginInterceptor implements Interceptor {

    public void destroy() {
    }

    public void init() {
    }

    public String intercept(ActionInvocation invocation) throws Exception {
        final ActionContext context = invocation.getInvocationContext();
        Object user = context.getSession().get("USER");
        if (user == null) return "login";
        return invocation.invoke();
    }
}
