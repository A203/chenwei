package com.huft.demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    for(int num=2;num<=50;num++){
    	//判断num是否为质数
    	boolean flag=true;//默认num是质数
    	for(int i=2;i<num;i++){
    		if(num%i==0){
    			flag=false;
    			break;
    		}
    	}
    	if(flag){
    		System.out.println(num+"\t");
    	}
    }
  }
}
