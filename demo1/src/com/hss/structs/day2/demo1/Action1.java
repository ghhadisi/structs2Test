package com.hss.structs.day2.demo1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;

/**
 * 只能操作 request  session  application 的数据map集合,不能操作本神
 *
 * Servlet是单例的，多个程序访问同一个Servlet只会创建一个Servlet的实例。
 * Action是多例的，一次请求，创建一个Action的实例（不会出现线程安全的问题）。
 */
public class Action1 extends ActionSupport {
    @Override
    public String execute() throws Exception {

        ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> params = actionContext.getParameters();

        for (String key : params.keySet()){
            String [] values = (String[]) params.get(key);
            System.out.println(key + " =  "+ Arrays.toString(values));
        }
        actionContext.put("reqName","reqValue");//requeset setAttrr

        actionContext.getSession().put("sessionName","sessValue");
        actionContext.getApplication().put("appName", "appValue");
        return SUCCESS;
    }
}
