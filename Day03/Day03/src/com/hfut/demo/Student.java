package com.hfut.demo;

public class Student {

		 //属性（特征）
	       String number;
		   String name;
		   String address;
		   
		   
		   //行为（方法）
		   //void 方法的返回类型
		   //introduction 方法名
		   void introduction(){
			   System.out.println("自我介绍:");
		   }

		public static void main(String[] args) {
			// TODO 自动生成的方法存根
		    //实例化一个手机
			Student s=new Student();
			
			s.number="2012214284";
			s.name="陈薇";
			s.address="苏州市工业园区仁爱路1号高博教育";
			
			s.introduction();
			System.out.println(s.number);
			System.out.println(s.name);
			System.out.println(s.address);
			
	}

}
