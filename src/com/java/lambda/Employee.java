package com.java.lambda;

import java.math.BigDecimal;
import java.util.Optional;

public class Employee {
private int id;
private Optional<String> name = Optional.empty();
private BigDecimal salary;
private int age;
private Optional<String> desc;



public Optional<String> getDesc() {
	return desc;
}
public void setDesc(Optional<String> desc) {
	this.desc = desc;
}
public int getId() {
	return id;
}
public Optional<String> getName() {
	return name;
}
public void setName(Optional<String> name) {
	this.name = name;
}
public void setId(int id) {
	this.id = id;
}

public BigDecimal getSalary() {
	return salary;
}
public void setSalary(BigDecimal salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
