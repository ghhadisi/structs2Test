package com.hss.structs.day1.dynamic;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class UserAction extends ActionSupport {
    public String find(){
        System.out.println("查询用户...");
        HttpServletRequest req =   ServletActionContext.getRequest();
        req.setAttribute("name","aaaa");
        return NONE;
    }
    public String update(){
        System.out.println("修改用户...");
        return NONE;
    }
    public String delete(){
        System.out.println("删除用户...");
        return NONE;
    }
    public String save(){
        System.out.println("保存用户...");
        return NONE;
    }
}
