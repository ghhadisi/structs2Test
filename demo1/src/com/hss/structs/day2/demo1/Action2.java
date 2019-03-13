package com.hss.structs.day2.demo1;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 这种方式可以操作域对象的数据，同时也可以获得对象的方法
 * Servlet是单例的，多个程序访问同一个Servlet只会创建一个Servlet的实例。
 *  * Action是多例的，一次请求，创建一个Action的实例（不会出现线程安全的问题）。
 */
public class Action2 extends ActionSupport {
    @Override
    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();
        Map<String, String[]> params = request.getParameterMap();
        for (String key : params.keySet()){
            String [] values = (String[]) params.get(key);
            System.out.println(key + " =  "+ Arrays.toString(values));
        }
//        ServletActionContext.getPageContext().setAttribute("pageName","pageValue");

        request.setAttribute("reqName","reqValue");//requeset setAttrr

        request.getSession().setAttribute("sessionName","sessValue");

        ServletActionContext.getServletContext().setAttribute("appName", "appValue");
        return SUCCESS;
    }
}
