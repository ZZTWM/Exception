package com.test;

/**
 * 捕捉运行时异常：空指针异常
 * @author Administrator
 *
 */
public class Test16 {
	public static void main(String[] args) {
		String str = null;
		try {
			str.toString();
		} catch (NullPointerException e) {
			System.out.println("捕捉到运行时异常: NullPointerException ");
			e.printStackTrace();
		}
	}
}
