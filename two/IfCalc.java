package com.java.two;

import java.util.Scanner;

public class IfCalc {
	public static void main(String[] args) {
	double num1=0;
	double num2=0;
	String oper="";//������ ����(add min mult div), if(oper.equals("add"))
						
	//ù��° ���� �Է� �ޱ�
	Scanner sc=new Scanner(System.in);
	System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
	num1= sc.nextInt();
	
	System.out.println("������ �Է�(+, /, *, /)");
	oper=sc.next();
	
	System.out.println("�ι�° ���ڸ� �Է� �Ͻÿ�");
	num2=sc.nextInt();
	
	//Ȯ��
	//System.out.println(num1+","+num2);
	
	//����(���ϱ� ����)
	double result1=num1+num2;
	double result2=num1-num2;
	double result3=num1*num2;
	double result4=num1/num2;
	
	//���
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