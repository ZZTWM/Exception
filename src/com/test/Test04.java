package com.test;

import java.io.File;
import java.io.FileInputStream;

/**
 * ʹ���쳣�ĸ������catch
 * @author Administrator
 * FileNotFoundException��Exception�����࣬ʹ��ExceptionҲ����catchסFileNotFoundException
 */
public class Test04 {
	public static void main(String[] args) {
		File file = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("�ɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
