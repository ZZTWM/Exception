package com.test;

/**
 * ����Error��ָ����ϵͳ������쳣��ͨ�����ڴ��ù���
 * 	��Ĭ�������£�һ��java����������ʱ��������ʹ��16m���ڴ�
 * 	������ͣ�ĸ�StringBuffer׷���ַ����ܿ�Ͱ��ڴ�ʹ�ù��ˡ��׳�OutOfMemoryError
 * 	������ʱ�쳣һ��������Ҳ�ǲ�Ҫ��ǿ�Ʋ�׽��
 * @author Administrator
 *
 */
public class Test15 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sb.append('a');
		}
	}
}	
