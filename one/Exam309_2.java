package com.java.one;

import java.util.Scanner;

public class Exam309_2 {
	public static void main(String[] args){


			//변수 2개 num1, num2
			// 2개의 숫자를 입력 받아 더하기 연산의 결과를 출력
		int num1=0;
		int num2=0;
		String str="";
		//첫번째 숫자 입력 받기
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오");
		num1= sc.nextInt();
		System.out.println("연산을 입력(덧셈)");
		str=sc.next();
		
		System.out.println("두번째 숫자를 입력 하시오");
		num2= sc.nextInt();
		
		
		//확인
		System.out.println(str);
		
		//조작(더하기 연산)
		int result=num1+num2;
		//출력
		System.out.println(str+"덧셈의 결과는 : "+result);
	}
}