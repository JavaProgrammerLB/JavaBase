package com.yitianyigexiangfa.javabase.java8base.function_programme.demo;

/**
 * @author Bill Lau
 * @date 2017-12-12
 */
public class Party {

    private Person hoster;

    public Party(Person person) {
        this.hoster = person;
    }

    public String whenMeet() {
        return hoster.sayHi();
    }
}
