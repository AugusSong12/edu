package com.augus.edu.web.controller;

import com.augus.edu.model.User;
import com.augus.edu.service.IUserService;
import com.augus.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {
    @Autowired
    HttpServletRequest request;

    @Autowired
    private IUserService userService;

    @RequestMapping("findById")
    public User findById(String id){
        System.out.println("控制器findById方法执行，");
        return userService.findById(id);
    }


    @RequestMapping("login")
    public String login(User user, @RequestParam("checkcode") String checkcode ){
        String imgCode = request.getSession().getAttribute("key").toString();
        request.getSession().removeAttribute("key");
        System.out.println("imgCode================="+imgCode);
        System.out.println("username===="+user.getUsername()+"==" +
                "password====="+user.getPassword());
        System.out.println("checkCode====="+checkcode);
        User checkUser = userService.login(user.getUsername(), user.getPassword());
        System.out.println("checkUser====="+checkUser);
        String msg ="";
        if(imgCode==null||!imgCode.equalsIgnoreCase(checkcode)){
            msg = "验证码错误";
            return "default";
        }

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
