package com.augus.edu.web.controller;

import com.augus.edu.model.User;
import com.augus.edu.service.IUserService;
import com.augus.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {
    @Autowired
    private IUserService userService;

    @RequestMapping("findById")
    public User findById(Integer id){
        System.out.println("控制器findById方法执行，");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }


    @RequestMapping("login")
    public String login(){
        System.out.println("user控制器方法运行");
        User user = userService.findById(1);
        System.out.println(user);
        return "default";
    }
    @RequestMapping(MANAGE)
    public String userManage(){
        System.out.println("user控制器方法运行");
        return MANAGE_PAGE;
    }
    @RequestMapping(INFO)
    public String userInfo(){
        System.out.println("user控制器方法运行");
        return INFO_PAGE;
    }
    @RequestMapping(EDIT)
    public String userEdit(){
        System.out.println("user控制器方法运行");
        return EDIT_PAGE;
    }
}
