package com.hss.structs.day2.demo2;

import com.hss.structs.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 1.4.1.2属性驱动：页面中提供表达式方式
 *
 * 使用第二种可以向多个对象中同时封装数据
 */
public class Action2 extends ActionSupport {


    User user = new User();

    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }
}
