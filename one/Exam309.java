package com.java.one;

import java.util.Scanner;

public class Exam309 {
	public static void main(String[] args) {
			//���� 2�� num1, num2
			// 2���� ���ڸ� �Է� �޾� ���ϱ� ������ ����� ���
		int num1=0;
		int num2=0;
		//ù��° ���� �Է� �ޱ�
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
		num1= sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է� �Ͻÿ�");
		num2= sc.nextInt();
		
		//Ȯ��
		//System.out.println(num1+","+num2);
		
		//����(���ϱ� ����)
		int result=num1+num2;
		//���
		System.out.println("������ ����� : "+result);
	}
}
