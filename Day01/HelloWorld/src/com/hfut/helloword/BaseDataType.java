package com.hfut.helloword;

public class BaseDataType {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //byte类型数据位数以及最大最小值
		System.out.println("基本类型：byte二进制位数"+Byte.SIZE);
		System.out.println("基本类型：byte最大值"+Byte.MAX_VALUE);
		System.out.println("基本类型：byte最小值"+Byte.MIN_VALUE);
		 //float类型数据位数以及最大最小值
		System.out.println("基本类型：float二进制位数"+Float.SIZE);
		System.out.println("基本类型：float最大值"+Float.MAX_VALUE);
		System.out.println("基本类型：float最小值"+Float.MIN_VALUE);
	
		//byte类型数据赋值
		byte b=50;
		//byte b1=130;//超出byte类型标示的数据范围
		//float变量赋值
		float f=10.0f;
	
	}

}
