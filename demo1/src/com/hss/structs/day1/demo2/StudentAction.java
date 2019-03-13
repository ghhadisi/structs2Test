package com.hss.structs.day1.demo2;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

    public String add(){
        System.out.println("add");
        return NONE;
    }

    public String del(){
        System.out.println("del");
        return NONE;
    }

    public String save(){
        System.out.println("save");
        return NONE;
    }
}
