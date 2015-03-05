package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: gb
 * Date: 30.08.2009
 * Time: 15:28:03
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction extends ActionSupport {

    private String username;
    private String password;


    public String execute() {
        if (!isValidUser(getUsername(), getPassword())) return LOGIN;
        Map session = ActionContext.getContext().getSession();
        session.put("USER", getUsername() + getPassword());
        return SUCCESS;
    }


    public String logout() throws Exception {
        Map session = ActionContext.getContext().getSession();
        session.remove("USER");
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean isValidUser(String username, String password) {
        if (getUsername().equals("admin") && getUsername().equals("admin")) return true;
        if (getUsername().equals("user") && getUsername().equals("user")) return true;
        return false;
    }
}
