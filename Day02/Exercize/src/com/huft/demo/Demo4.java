package com.huft.demo;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Scanner input =new Scanner(System.in);
		   System.out.print("请输入行号：");
		   int num=input.nextInt();
		   
		   for(int i=1;i<=num;i++){
			   //打印空格
			   for(int j=1;j<=num-1;j++){
				   System.out.println(" ");
			   }
			   
			   //打印星号
			   for(int j=1;j<=i*2-1;j++){
				   System.out.println("*");
			   }
			   System.out.println();
		   }
		   
	}

}
