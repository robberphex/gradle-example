package com.app1;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        tryLoadFromAdapter();
        tryLoadFromCore();
    }

    private static void tryLoadFromAdapter() {
        String success = "success";
        try {
            Class<?> cls = Class.forName("com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.UrlCleaner");
            System.out.println("load adapter success!\t" + cls.getName());
        } catch (Throwable e) {
            System.out.println("load adapter failed!\t" + e);
            e.printStackTrace();
        }
    }

    private static void tryLoadFromCore() {
        String success = "success";
        try {
            Class<?> cls = Class.forName("com.alibaba.csp.sentinel.Env");
            System.out.println("load core success!\t" + cls.getName());
        } catch (Throwable e) {
            System.out.println("load core failed!\t" + e);
        }
    }
}

