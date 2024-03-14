package com.example;

import com.alibaba.csp.sentinel.Env;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(BlockExceptionHandler.class);
        try {
            System.out.println(Class.forName("com.alibaba.csp.sentinel.Env"));
        } catch (ClassNotFoundException e) {
            System.out.println("cannot find class com.alibaba.csp.sentinel.Env.");
        }
        System.out.println(Env.class);
    }
}

