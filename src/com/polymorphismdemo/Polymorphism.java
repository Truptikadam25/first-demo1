package com.polymorphismdemo;

public class Polymorphism {
public static void main(String[] args) {
	Poly p=new Poly();
	int i=10;
	p.add(10);
}
}
class Poly {
	void add() {
		System.out.println("inside no method");
		
	} 
	/*void add(int a) {
		System.out.println("inside int para");
	}*/
	/*void add(float a) {
		System.out.println("inside float para");
	}*/
	/*void add(double a) {
		System.out.println("inside double para");
	}*/
	void add(Integer a) {
		System.out.println("inside Interger para");
	}
	void add(Double a) {
		System.out.println("inside Double para");
	}
	void add(Object a) {
		System.out.println("inside Object para");
	}
}