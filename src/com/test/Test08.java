package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 考虑如下情况：
 * 主方法调用method1
 * method1调用method2
 * method2中打开文件
 * method2中需要进行异常处理
 * 但是method2不打算处理，而是把这个异常通过throws抛出去
 * 那么method1就会接到该异常。 处理办法也是两种，要么是try catch处理掉，要么也是抛出去。
 * method1选择本地try catch住 一旦try catch住了，就相当于把这个异常消化掉了，主方法在调用method1的时候，就不需要进行异常处理了
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
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("成功打开");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe不存在");
			e.printStackTrace();
		}
	}
}
