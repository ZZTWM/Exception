package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * 什么是异常：
 * 	文件不存在异常
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("d/LOL.exe");
		//试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
		new FileInputStream(f);
	}
}
