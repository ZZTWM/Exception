package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * �ɲ��쳣
 * 	�ɲ��쳣�� CheckedException
 * 	�ɲ��쳣��������д�����쳣��Ҫôtry catchס,Ҫô�����ף�˭���ã�˭�������� FileNotFoundException
 * 	������������������Ͳ�����ͨ��
 * @author Administrator
 *
 */
public class Test13 {
	public static void main(String[] args) {
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
