package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * ʲô���쳣��
 * 	�ļ��������쳣
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("d/LOL.exe");
		//��ͼ���ļ�LOL.exe�����׳�FileNotFoundException�������������쳣���ͻ��б������
		new FileInputStream(f);
	}
}
