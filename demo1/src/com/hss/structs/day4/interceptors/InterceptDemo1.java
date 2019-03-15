package com.hss.structs.day4.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptDemo1 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("InterceptorDemo1执行了...");
        String obj = invocation.invoke();
        System.out.println("InterceptorDemo1执行结束了...");
        return obj;
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
