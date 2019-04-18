package com.java.lambda;
/**
 * super() as well as this() both are used to make constructor calls. super() is used to call Base class’s constructor(i.e, Parent’s class) while this() is used to call current class’s constructor.
 * @author Anuj Sharma
 *
 */
public class B extends A{
private String className = "B";

public void doSth() {
	super.doSth();
	System.out.println(super.className);
	System.out.println("derived do sth");
}
}
