package com.java.lambda;

import java.math.BigDecimal;
import java.util.Optional;
/**
 * https://dev.to/piczmar_0/java-optional-in-class-fields-why-not-40df
 * @author Anuj Sharma
 *
 */
public class Lambda2 {
	public static void main(String[] args) {
		Employee e = new Employee();
	String name = e.getName().orElseGet(()-> "Hello");
	name = e.getName().orElse("Hey");
	BigDecimal sal = Optional.ofNullable(e.getSalary()).orElse(new BigDecimal("2000"));
	System.out.println(sal);
	}
}
