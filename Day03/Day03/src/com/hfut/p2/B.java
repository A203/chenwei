package com.hfut.p2;


import com.hfut.p1.A;

public class B {

	public void methodB1() {
		// TODO 自动生成的方法存根
		A a=new A();
//		a.methodA1();
//		a.methodA2();methodA2是私有的
//		a.methodA3();default方法只能是同一个包中的类才能访问
//	    a.methodA4();
	}
	
	public static void main(String[] args){
		B b=new B();
		b.methodB1();
	
	}

}
