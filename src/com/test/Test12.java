package com.test;

/**
 * ������һ������ public int method()�� �᷵��һ������
 * �������������try catch �� finally.
 * try �ﷵ�� 1
 * catch �� ���� 2
 * finally �� ����3
 * ��ô������������׷��ض��٣�
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
