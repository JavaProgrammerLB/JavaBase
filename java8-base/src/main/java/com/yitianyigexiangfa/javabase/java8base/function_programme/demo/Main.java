package com.yitianyigexiangfa.javabase.java8base.function_programme.demo;

/**
 * @author Bill Lau
 * @date 2017-12-12
 */
public class Main {

    public static void main(String[] args) {
       String meet = new Party(() -> "Hello, World").whenMeet();
        System.out.println(meet);
    }

}
