package com.test;

/**
 * ����ʱ�쳣RuntimeExceptionָ�� ���Ǳ������try catch���쳣 
 * ��������ʱ�쳣: 
 * ��������Ϊ0�쳣:ArithmeticException 
 * �±�Խ���쳣:ArrayIndexOutOfBoundsException 
 * ��ָ���쳣:NullPointerException 
 * �ڱ�д�����ʱ����Ȼ����ʹ��try catch throws���д�����ɲ��쳣��֮ͬ�����ڣ����㲻����try catch��Ҳ�����б������ 
 * Java֮���Ի��������ʱ�쳣��ԭ��֮һ������Ϊ�±�Խ�磬��ָ����Щ����ʱ�쳣̫�����ձ飬�������Ҫ���в�׽������Ŀɶ��Ծͻ��ú���⡣
 * @author Administrator
 *
 */
public class Test14 {
	public static void main(String[] args) {
		//�κγ�������Ϊ0:ArithmeticException
		//int k = 5/0;
		
		int j[] = new int[5];
		//�±�Խ���쳣��ArrayIndexOutOfBoundsException
		j[10] = 10;
		
		//��ָ���쳣��NullPointerException
		String str = null;
		str.length();
 	}
}
