package com.test;

/**
 * ��׽����ʱ�쳣����ָ���쳣
 * @author Administrator
 *
 */
public class Test16 {
	public static void main(String[] args) {
		String str = null;
		try {
			str.toString();
		} catch (NullPointerException e) {
			System.out.println("��׽������ʱ�쳣: NullPointerException ");
			e.printStackTrace();
		}
	}
}
