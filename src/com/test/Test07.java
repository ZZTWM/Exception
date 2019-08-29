package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * finally:无论是否出现异常，finally中的代码都会被执行
 * @author Administrator
 *
 */
public class Test07 {

	public static void main(String[] args) {
		File file = new File("d:/LOL.exe");
		try {
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("成功打开");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe不存在");
			e.printStackTrace();
		}finally{
			System.out.println("无论文件是否存在， 都会执行的代码");
		}
		
	}

}
