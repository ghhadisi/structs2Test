package com.hss.structs.day2.demo2;

import com.hss.structs.bean.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.5.1.2封装数据到Map集合中
 */
public class Action5 extends ActionSupport {

    private Map<String, Product> map =new HashMap<>();

    public Map<String, Product> getMap() {
        System.out.println("getMap");

        return map;
    }

    public void setMap(Map<String, Product> map) {
        System.out.println("setMap");
        this.map = map;
    }
    @Override
    public String execute() throws Exception {
        for (String key : map.keySet()) {
            Product product = map.get(key);
            System.out.println(key+"    "+product);
        }
        return NONE;
    }
}
