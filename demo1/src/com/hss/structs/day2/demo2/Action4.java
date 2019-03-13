package com.hss.structs.day2.demo2;

import com.hss.structs.bean.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.5.1.1封装数据到List集合中
 */
public class Action4 extends ActionSupport {


    public Action4() {
        System.out.println(products);
    }

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }



    @Override
    public String execute() throws Exception {
        System.out.println(products);

        for (Product product : products) {
            System.out.println(product);
        }
        return NONE;
    }
}
