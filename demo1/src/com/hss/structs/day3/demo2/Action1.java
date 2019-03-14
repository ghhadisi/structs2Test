package com.hss.structs.day3.demo2;

import com.hss.structs.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class Action1 extends ActionSupport  implements ModelDriven<User> {

    private User u = new User();

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    private String  height;

    @Override
    public String execute() throws Exception {
        ValueStack vs = ActionContext.getContext().getValueStack();
        //2将u压入栈顶
//        vs.push(u);
        vs.getContext().put("name", "name1");
//        vs.getRoot().push(u);
        height = "180";
        System.out.println(u);
        return SUCCESS;
    }

//    public void prepare() throws Exception {
//        //压入栈顶
//        //1获得值栈
//        ValueStack vs = ActionContext.getContext().getValueStack();
//        //2将u压入栈顶
//        vs.push(u);
//    }

    @Override
    public User getModel() {
        return u;
    }
}
