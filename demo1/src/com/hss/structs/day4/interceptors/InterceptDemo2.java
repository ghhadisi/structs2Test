package com.hss.structs.day4.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptDemo2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("InterceptorDemo2执行了...");
        String obj = invocation.invoke();
        System.out.println("InterceptorDemo2执行结束了...");
        return obj;
    }
}
