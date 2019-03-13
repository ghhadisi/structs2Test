package com.hss.structs.day2.demo2;

import com.hss.structs.bean.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * 数据封装方式一：提供属性的set方法的方式
 */
public class Action1 extends ActionSupport {

    // 提供了对应的属性
    private String username;
    private String password;
    private Integer age;
    private Date birthday;
    private Double salary;


    @Override
    public String execute() throws Exception {
        // 接收数据:
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        System.out.println(birthday);
        System.out.println(salary);
        // 封装数据:
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setBirthday(birthday);
        user.setSalary(salary);
        return SUCCESS;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
