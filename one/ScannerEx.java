package com.java.one;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü�� ���ſ��θ� ��ĭ���� �и��Ͽ� �Է�");
		Scanner Scanner=new Scanner(System.in);

		String name = Scanner.next();
		System.out.println("�̸���" + name + ",");
		
		String city = Scanner.next();
		System.out.println("���ô�" + city + ",");
		
		int age = Scanner.nextInt();
		System.out.println("���̴�" + age + "��");
		
		double weight = Scanner.nextDouble();
		System.out.println("ü����" + weight + "kg");
		
		boolean isSingle = Scanner.nextBoolean();
		System.out.println("���ſ��δ�" + isSingle + "�Դϴ�.");	
		
		Scanner.close();
		System.out.println();
	}
}
