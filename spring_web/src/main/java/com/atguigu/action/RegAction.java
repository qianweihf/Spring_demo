package com.atguigu.action;

import com.atguigu.entity.User;
import com.atguigu.service.UserService;
import com.opensymphony.xwork2.Action;

/**
 * @author qianwei
 * @create 2022-11-02 V1.0
 */
public class RegAction implements Action {
    private UserService userService;

    //<input type="text" name="user.name"/>
    private User user;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        userService.register(user);
        return Action.SUCCESS;
    }
}
