package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ���쳣��׽�취2:
 * ��һ���ְ취�ǰѶ���쳣������һ��catch��ͳһ��׽ 
 * 	���ַ�ʽ�� JDK7��ʼ֧�֣��ô��ǲ�׽�Ĵ�������գ�����֮���ǣ�
 * 	һ�������쳣������ȷ�������������쳣����Ҫͨ��instanceof �����жϾ�����쳣����
 * @author Administrator
 *
 */
public class Test06 {

	public static void main(String[] args) {
		File file  = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("�ɹ���");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
			Date date = sdf.parse("2019-08-29");
		} catch (FileNotFoundException | ParseException e) {
			if(e instanceof FileNotFoundException)
				System.out.println("d:/LOL.exe������");
			if(e instanceof ParseException)
				System.out.println("���ڸ�ʽ��������");
			e.printStackTrace();
		}
		
	}

}
