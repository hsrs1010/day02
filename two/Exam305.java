package com.java.two;

import java.util.Scanner;

public class Exam305 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in); //객체생성
	//데이터를 입력 받을 수 있게 도와주는 클래스

	//int num=0;
	System.out.println("화면에 숫자를 입력하세요.");
	int num=scan.nextInt();//숫자 입력받기
	System.out.println("당신의 숫자 : "+num);
	//간단한 조작
	num=num-10;
	System.out.println("당신의 숫자 : "+num);
	}
}
