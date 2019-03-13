package com.hss.structs.day1.demo1.action;

/**
 * Action的编写方式：Action类是一个POJO的类
 */
public class StudentAction {

    public String execute(){
        System.out.println("StudentAction");
        return "success";
    }

    public String add(){
        System.out.println("add");
        return "success";
    }

}
