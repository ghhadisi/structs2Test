package com.hss.structs.day2.demo2;

import com.hss.structs.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 1.4.1.3模型驱动：采用模型驱动方式（最常用）
 *
 * 缺点：只能同时向一个对象中封装数据。
 */
public class Action3 extends ActionSupport implements ModelDriven<User> {

    User user = new User();

    @Override
    public String execute() throws Exception {
        System.out.println(user);

        return NONE;
    }

    @Override
    public User getModel() {
        return user;
    }
}
