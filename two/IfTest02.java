package com.java.two;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		//¦Ȧ ����
		//int a=1;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ȭ�鿡 ���ڸ� �Է��ϼ���.");
		int a=scan.nextInt();//���� �Է¹ޱ�
		
		int odd=a%2;
		if (a%2==0) {
			System.out.println(a + "���ڴ� ¦���̱���");
		}else {
			System.out.println(a + "���ڴ� Ȧ���̱���");
		
		}
		scan.close();
	}
}
