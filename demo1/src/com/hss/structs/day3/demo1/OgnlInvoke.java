package com.hss.structs.day3.demo1;

import com.hss.structs.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

public class OgnlInvoke  {

    @Test
    public void objInvoke() throws OgnlException {
        OgnlContext context = new OgnlContext();
        Object obj = Ognl.getValue("'helloworld'.length()",context,context.getRoot());
        System.out.println(obj);
    }


    @Test
    public void staticMethodInvoke() throws OgnlException {
        OgnlContext context = new OgnlContext();
        Object obj = Ognl.getValue("@java.lang.Math@random()",context,context.getRoot());
        System.out.println(obj);
    }

    @Test
    public void dataGet() throws OgnlException {
        OgnlContext context = new OgnlContext();
        context.put("name","在家爱漫画");
        context.put("name","撒大声地");
        String name = (String) Ognl.getValue("#name", context,context.getRoot());
        System.out.println(name);
    }

    @Test
    public void dataGet1() throws OgnlException {
        OgnlContext context = new OgnlContext();
        User user = new User();
        user.setUsername("利阿达");
        context.setRoot(user);
        String name = (String) Ognl.getValue("username", context,context.getRoot());
        System.out.println(name);


    }
}
