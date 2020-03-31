package com.java.two;

import java.util.Scanner;

public class IfCalc {
	public static void main(String[] args) {
	double num1=0;
	double num2=0;
	String oper="";//연산의 종류(add min mult div), if(oper.equals("add"))
						
	//첫번째 숫자 입력 받기
	Scanner sc=new Scanner(System.in);
	System.out.println("첫번째 숫자를 입력하시오");
	num1= sc.nextInt();
	
	System.out.println("연산을 입력(+, /, *, /)");
	oper=sc.next();
	
	System.out.println("두번째 숫자를 입력 하시오");
	num2=sc.nextInt();
	
	//확인
	//System.out.println(num1+","+num2);
	
	//조작(더하기 연산)
	double result1=num1+num2;
	double result2=num1-num2;
	double result3=num1*num2;
	double result4=num1/num2;
	
	//출력
	if(oper.equals("+")) {
		System.out.println(result1);
	}
	
	if(oper.equals("-")) {
	System.out.println(result2);
	}
	
	if(oper.equals("*")) {
	System.out.println(result3);
	}
	
	if(oper.equals("/")) {
	System.out.println(result4);
	}
	sc.close();
	
	}
	
		
	
	
}