package com.hss.structs.day3.demo1;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;
import org.junit.Test;

public class GetValueStack extends ActionSupport {

    @Test
    public void demo1(){
        ValueStack stack1 = ActionContext.getContext().getValueStack();
        ValueStack stack2 = (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.VALUE_STACK);
        System.out.println(stack1 == stack2);
    }
}
