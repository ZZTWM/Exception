package com.test;

import java.io.File;
import java.io.FileInputStream;

/**
 * 使用异常的父类进行catch
 * @author Administrator
 * FileNotFoundException是Exception的子类，使用Exception也可以catch住FileNotFoundException
 */
public class Test04 {
	public static void main(String[] args) {
		File file = new File("d:/LOL.exe");
		try {
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("成功打开");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
