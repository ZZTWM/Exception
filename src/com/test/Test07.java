package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test07 {

	public static void main(String[] args) {
		File file = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("�ɹ���");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		}finally{
			System.out.println("�����ļ��Ƿ���ڣ� ����ִ�еĴ���");
		}
		
	}

}
