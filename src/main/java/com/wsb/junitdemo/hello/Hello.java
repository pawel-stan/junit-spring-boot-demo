package com.wsb.junitdemo.hello;

public class Hello {

    private String name;
    private String content;

    public Hello(String name) {
        this.name = name;
        this.content = "Hello, " + name;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
