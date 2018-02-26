package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass(String name, String period) {
    	this.message = "Good "+period+", "+name+"!";
    }

    public HelloClass(String name, String adjective, String period) {
    	String adj = adjective.substring(0, 1).toUpperCase()+adjective.substring(1);
    	this.message = adj+" "+name+", good "+period+"!";
    }
    
    public String getMessage() {
        return message;
    }
}
