package com.hfut.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    int i=5;
    int j=3;
//    System.out.println("i+j="+(i+j));
//    System.out.println("i/j="+(i/j));
//    System.out.println("i%j="+(i%j));
//	//前缀递增
//    System.out.println(++i);
//    //后缀递增
//    System.out.println(j++);
    

  //关系运算符
  if(i>=j)
  {
	  System.out.println("i大于等于j");
  }
  //逻辑运算符
  boolean flag=true;
  int m=0;
  if(flag&&(++m)>0)
  {
	  
  }
  System.out.println("m的值："+m);
	

	
	//位操作
	int a=3;//00000000 00000000 00000000 00000011
	int b=2;//00000000 00000000 00000000 00000010
//	System.out.println("a&b:"+(a&b));
//	System.out.println("a|b:"+(a|b));
//	System.out.println("a^b:"+(a^b));
//	
//	System.out.println("a>>b:"+(a>>b));
//	System.out.println("a<<b:"+(a<<b));
	
	//赋值运算
	a+=b;
	System.out.println(a+" "+b);
	
	
	//三目运算符
		int score=80;
		String type=score<60?"不及格":"及格";
		System.out.println(type);
		
		//+
		System.out.println("1"+1+1);
		System.out.println(1+1+"1");
		
		//运算符优先级
		boolean flag1=i+j<=8&&i-j>=2;
		System.out.println(flag1);
	}
	
	
} 
 