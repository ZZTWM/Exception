package com.test;

public class Test17 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		try {
			for (int i = 0; i < 100; i++) {
				sb.append(sb.toString());
			}			
		} catch (OutOfMemoryError e) {
			System.out.println("捕捉到内存用光错误:  OutOfMemoryError");
			e.printStackTrace();
		}
	}
}
