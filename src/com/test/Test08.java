package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �������������
 * ����������method1
 * method1����method2
 * method2�д��ļ�
 * method2����Ҫ�����쳣����
 * ����method2�����㴦�����ǰ�����쳣ͨ��throws�׳�ȥ
 * ��ômethod1�ͻ�ӵ����쳣�� ����취Ҳ�����֣�Ҫô��try catch�������ҪôҲ���׳�ȥ��
 * method1ѡ�񱾵�try catchס һ��try catchס�ˣ����൱�ڰ�����쳣�������ˣ��������ڵ���method1��ʱ�򣬾Ͳ���Ҫ�����쳣������
 * @author Administrator
 *
 */
public class Test08 {
	
	public static void main(String[] args) {
		method1();
	}
	
	private static void method1(){
		method2();
	}
	
	private static void method2(){
		File file = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("�ɹ���");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		}
	}
}
