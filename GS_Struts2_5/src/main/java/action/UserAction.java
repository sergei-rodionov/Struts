package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.ActionContext;
import service.UserService;
import entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

/**
 * Created by IntelliJ IDEA.
 * User: gb
 * Date: 30.08.2009
 * Time: 23:51:55
 * To change this template use File | Settings | File Templates.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private UserService userService;
    private List<User> userList;
    private User user = new User();
    private Long id;
    String action;

    public User getModel() {
        return user;
    }

    @Override
    public String execute() {
        userList = userService.getAll();
        return SUCCESS;
    }

    public String save() {
        this.userService.update(user);
        return SUCCESS;
    }

    public String remove() {
        user = userService.getById(id);
        this.userService.delete(user);
        return SUCCESS;
    }


    public String edit() {
        user = userService.getById(id);
        return execute();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
