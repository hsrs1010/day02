 package com.java.one;

public class BitTest2 {
	public static void main(String[] args) {
		byte a=10;//0000 1010
		byte b=9;// 0000 1001
		byte c=1;// 0000 0001
		
		System.out.println(a+"&"+b+"="+(a&b));
		System.out.println(a+"|"+b+"="+(a|b));
		System.out.println(a+"^"+b+"="+(a^b));
		
		//Ãß°¡
		System.out.println(a+">>"+c+"="+(a>>c));
		System.out.println(-1*a+">>"+c+"="+(-1*a>>c));
		System.out.println(a+">>>"+c+"="+(a>>>c));
	}

}
