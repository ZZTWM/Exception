package com.test;

import java.io.File;
import java.io.FileInputStream;

public class Test19 {
	public static void main(String[] args){
		try {
			method();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	public static void method() throws Throwable{
		File file = new File("d:/LOL.exe1");
		new FileInputStream(file);
	}
	
}
