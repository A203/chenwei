package 动态绑定;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		Animal a=new Animal();
		System.out.println(a.str);
		a.hello();
       */
		
//		Tiger b=new Tiger();
//		System.out.println(b.str);
//		b.hello();
//		
		Animal a=new Tiger();
		System.out.println(a.str);
		a.hello();//动态绑定
	}

}
