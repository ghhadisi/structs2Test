package com.hss.structs.demo1.action;

import com.opensymphony.xwork2.Action;
/**
 * Action的编写方式二：实现一个Action的接口
 * * 实现接口的这种方式：提供了五个常量（五个逻辑视图的名称）
 * 		* SUCCESS	:成功
 * 		* ERROR		:失败
 * 		* LOGIN		:登录出错页面跳转
 * 		* INPUT		:表单校验的时候出错
 * 		* NONE		:不跳转
 * @author jt
 *
 */
public class ActionDemo2 implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("ActionDemo2");
        return SUCCESS;
        /*
        * SUCCESS
        * NONE
        * ERROR
        * INPUT
        * LOGIN
        * */
    }
}
