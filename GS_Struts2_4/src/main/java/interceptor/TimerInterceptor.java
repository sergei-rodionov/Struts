package interceptor;

import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.ActionInvocation;

/**
 * Created by IntelliJ IDEA.
 * User: gb
 * Date: 30.08.2009
 * Time: 13:50:55
 * To change this template use File | Settings | File Templates.
 */
public class TimerInterceptor implements Interceptor {

    public void destroy() {
    }

    public void init() {
    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        long t1 = System.currentTimeMillis();
        String s = actionInvocation.invoke();
        long t2 = System.currentTimeMillis();
        System.out.println("Action " + actionInvocation.getAction().getClass().getName() + " took " + (t2 - t1) + " millisecs");
        return s;
    }
}
