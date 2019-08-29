package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 多异常捕捉办法2:
 * 另一个种办法是把多个异常，放在一个catch里统一捕捉 
 * 	这种方式从 JDK7开始支持，好处是捕捉的代码更紧凑，不足之处是，
 * 	一旦发生异常，不能确定到底是哪种异常，需要通过instanceof 进行判断具体的异常类型
 * @author Administrator
 *
 */
public class Test06 {

	public static void main(String[] args) {
		File file  = new File("d:/LOL.exe");
		try {
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(file);
			System.out.println("成功打开");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
			Date date = sdf.parse("2019-08-29");
		} catch (FileNotFoundException | ParseException e) {
			if(e instanceof FileNotFoundException)
				System.out.println("d:/LOL.exe不存在");
			if(e instanceof ParseException)
				System.out.println("日期格式解析错误");
			e.printStackTrace();
		}
		
	}

}
