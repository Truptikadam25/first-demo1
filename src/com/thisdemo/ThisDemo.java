package com.thisdemo;

public class ThisDemo {
public static void main(String[] args) {
	B b1=new B();
	System.out.println("end of pgm");
}
}



class A {
	int id;
	String sname;
	A(){
		this(10);
		System.out.println("inside no arg A");
	}
	A(int a){
		System.out.println("single para A");
	}
}


class B extends A {
	int d;
	B(){
		this(10);
		System.out.println("inside no arg B");
	}
	B(int a){
		this(10,20);
		System.out.println("single para B");
	}
	B(int a,int b){
		this(10.0f,20);
		System.out.println("double int para B");
	}
	B(float b,int a){
		super();
		System.out.println("double float and int para B");
	}
}