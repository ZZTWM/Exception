package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���쳣��׽�취1
 * 	����취֮һ�Ƿֱ����catch
 * @author Administrator
 *
 */
public class Test05 {

	public static void main(String[] args) {
		File file = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("�ɹ���");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("2016-06-03");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("���ڸ�ʽ��������");
			e.printStackTrace();
		}
		
	}

}
