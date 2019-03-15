package com.hss.structs.day4.demo1;

import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("Action1  execute");
        this.addActionError("用户名错误");
        return super.execute();
    }
}
