package com.hss.structs.day2.demo1;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 借口注入
 * Servlet是单例的，多个程序访问同一个Servlet只会创建一个Servlet的实例。
 *  * Action是多例的，一次请求，创建一个Action的实例（不会出现线程安全的问题）。
 */
public class Action3 extends ActionSupport implements ServletRequestAware, ServletContextAware {

    HttpServletRequest request;
    ServletContext context;
     @Override
    public String execute() throws Exception {
         Map<String, String[]> params = request.getParameterMap();
         for (String key : params.keySet()){
             String [] values = (String[]) params.get(key);
             System.out.println(key + " =  "+ Arrays.toString(values));
         }
//        ServletActionContext.getPageContext().setAttribute("pageName","pageValue");

         request.setAttribute("reqName","reqValue");//requeset setAttrr

         request.getSession().setAttribute("sessionName","sessValue");

         context.setAttribute("appName", "appValue");
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        request = httpServletRequest;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        context = servletContext;
    }
}
