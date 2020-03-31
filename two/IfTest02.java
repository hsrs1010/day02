package com.java.two;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		//짝홀 판정
		//int a=1;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("화면에 숫자를 입력하세요.");
		int a=scan.nextInt();//숫자 입력받기
		
		int odd=a%2;
		if (a%2==0) {
			System.out.println(a + "숫자는 짝수이군요");
		}else {
			System.out.println(a + "숫자는 홀수이군요");
		
		}
		scan.close();
	}
}
