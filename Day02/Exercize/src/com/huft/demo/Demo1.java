package com.huft.demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    for(int num=2;num<=50;num++){
    	//�ж�num�Ƿ�Ϊ����
    	boolean flag=true;//Ĭ��num������
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