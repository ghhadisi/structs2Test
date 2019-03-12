package com.hss.structs.demo1.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action的编写方式三：Action类继承ActionSupport类
 * * 推荐使用继承ActionSupport方式
 * 		* ActionSupport中提供了数据校验、国际化等一系列操作的方法。
 * @author jt
 *
 */
public class ActionDemo3 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("ActionDemo3");
        return NONE;
    }
}
