package action;

import com.opensymphony.xwork2.ActionSupport;
import data.UserDataSource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 * Created by IntelliJ IDEA.
 * User: gb
 * Date: 27.08.2009
 * Time: 22:24:50
 * To change this template use File | Settings | File Templates.
 */

/**
 *
 * No idea why the Struts 2 annotation set the “WEB-INF/content/” as default folder,
 * but most applications will not put the result pages in this “WEB-INF/content/” folder.
 * It’s just a Struts 2 convention not a standard folder structure.
 * I rather Struts 2 put the root path as the default folder.
 * If your JSP result pages are store in other location, you are allow to change it with @ResultPath annotation.
 */
@ResultPath("/")
public class LoginAction extends ActionSupport {

    private String username;
    private String password;
    private String message;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Action(value="LoginAction", results={
            @Result(name="input", location="/login.jsp"),
            @Result(name="success", location="/success.jsp")

    })
    public String login(){
        if (!validateLogin(getUsername(), getPassword())){
            setMessage("Empty login or password");
            return INPUT;
        }
        if (UserDataSource.getUser(getUsername()) == null){
            setMessage("User not registred!");
            return INPUT;
        }
        setMessage("You are logged in!");
        return SUCCESS;
    }


    @Action(value="RegisterAction", results={
            @Result(name="input", location="/register.jsp"),
            @Result(name="success", location="/success.jsp")

    })
    public String register(){
        if (!validateRegister(getUsername(), getPassword()))
            return INPUT;
        setMessage("You are registred!");

        UserDataSource.addUser(getUsername(), getPassword());
        return SUCCESS;
    }

   public boolean validateLogin(String username, String passwors){
       if (username == null || username.length() == 0) return false;
       if (passwors == null || passwors.length() == 0) return false;
       return true;
   }

    public boolean validateRegister(String username, String password){
        if (username.equals("vova") || username.equals("ivan")) return false;
        return validateLogin(username, password);
    }



  
}
