package com.test;

import java.io.File;
import java.io.FileInputStream;

public class Test18 {
	public static void main(String[] args) {
		File file = new File("d:/LOL.exe1");
		
		try {
			new FileInputStream(file);
			//ʹ��Throwable�����쳣��׽
		} catch (Throwable t) {
			// TODO Auto-generated catch block
			t.printStackTrace();
		}
		
	}
}
