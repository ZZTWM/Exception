package com.test;

/**
 * 假设有一个方法 public int method()， 会返回一个整数
 * 在这个方法中有try catch 和 finally.
 * try 里返回 1
 * catch 里 返回 2
 * finally 里 返回3
 * 那么，这个方法到底返回多少？
 * @author Administrator
 *
 */
public class Test12 {
	
	public static void main(String[] args) {
		int result = method();
		System.out.println("result:" + result);
	}
	
	@SuppressWarnings("finally")
	public static int method(){
		try {
			return return1();
		} catch (Exception e) {
			return return2();
		}finally{
			return return3();
		}
	}
	
	private static int return2(){
		System.out.println("return 2");
		return 2;
	}
	
	private static int return3(){
		System.out.println("return 3");
		return 3;
	}
	
	private static int return1(){
		System.out.println("return 1");
		return 1;
	}
	
	
}
