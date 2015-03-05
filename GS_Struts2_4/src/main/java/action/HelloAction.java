package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by IntelliJ IDEA.
 * User: gb
 * Date: 30.08.2009
 * Time: 14:06:38
 * To change this template use File | Settings | File Templates.
 */
public class HelloAction extends ActionSupport {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
