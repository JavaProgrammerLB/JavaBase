package com.yitianyigexiangfa.javabase.java8base.function_programme;

import java.util.concurrent.TimeUnit;

/**
 * @author Bill Lau
 * @date 2017-12-12
 */
public class FunctionProgrammeHelloWorld {

    public static void main(String[] args) throws Exception {
        new Thread(() -> System.out.println("Hello world")).start();
        TimeUnit.SECONDS.sleep(2);
    }
}
