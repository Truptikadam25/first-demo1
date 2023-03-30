package com.polymorphismdemo;

public class MethodOverridingDemo {
public static void main(String[] args) {
	
	
	A a1=new B();
	a1.m1();
}
}
class A{
	void m1() {
		System.out.println("inside no method");
	}
	int m2() {
		System.out.println("int m1 method");
		return 0;
	}
	Integer m3() {
		System.out.println("void m1");
		return 0;
	}
	
}
class B extends A {
	void m1() {
		System.out.println("inside no method");
	}
	int m2() {
		System.out.println("void m1");
		return 0;
	}
}