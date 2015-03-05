package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by IntelliJ IDEA.
 * User: gb
 * Date: 27.08.2009
 * Time: 22:24:50
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction extends ActionSupport {

    private String username;
    private String password;

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

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }


    @Override
    public void validate() {
        if (getUsername() == null || getUsername().length() == 0) {
            addFieldError("username", "User Name is required");
        } else if (getUsername().equals("test")) {
            addFieldError("username", "User Name must be normal!");
        }
        if (getPassword().length() == 0) {
            addFieldError("password", "Passwors is required");
        }
    }


}
