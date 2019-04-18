package com.java.lambda;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class C {
public static void main(String[] args) {
	/*
	 * Graceful shutdown hook of application
	 */
	Runtime.getRuntime().addShutdownHook(new Thread() {
	    public void run() { 
	    	System.out.println("shutdown done");
	    }
	 });
	System.out.println(((A)new B()).className);
	A a = new B();
	A ba = new A();
	B b = new B();
	a.doSth();
	ba.doSth();
	b.doSth();
	//We can use this as well as super anywhere except static area
	// b.super won't work
	"Hello".chars().mapToObj(x -> (char)x).forEach(System.out::print);
	String[] s = {"A","C","B"};
	Arrays.sort(s);
	Arrays.stream(s).sorted();
	Arrays.stream(s).forEach(System.out::print);
	System.out.println(callA());
	
}

private static boolean callA() {
	try {
		return true;
	}
	finally {
		return false;
	}
}
}
