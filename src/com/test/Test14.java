package com.test;

/**
 * 运行时异常RuntimeException指： 不是必须进行try catch的异常 
 * 常见运行时异常: 
 * 除数不能为0异常:ArithmeticException 
 * 下标越界异常:ArrayIndexOutOfBoundsException 
 * 空指针异常:NullPointerException 
 * 在编写代码的时候，依然可以使用try catch throws进行处理，与可查异常不同之处在于，即便不进行try catch，也不会有编译错误 
 * Java之所以会设计运行时异常的原因之一，是因为下标越界，空指针这些运行时异常太过于普遍，如果都需要进行捕捉，代码的可读性就会变得很糟糕。
 * @author Administrator
 *
 */
public class Test14 {
	public static void main(String[] args) {
		//任何除数不能为0:ArithmeticException
		//int k = 5/0;
		
		int j[] = new int[5];
		//下标越界异常：ArrayIndexOutOfBoundsException
		j[10] = 10;
		
		//空指针异常：NullPointerException
		String str = null;
		str.length();
 	}
}
