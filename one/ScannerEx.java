package com.java.one;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중 독신여부를 빈칸으로 분리하여 입력");
		Scanner Scanner=new Scanner(System.in);

		String name = Scanner.next();
		System.out.println("이름은" + name + ",");
		
		String city = Scanner.next();
		System.out.println("도시는" + city + ",");
		
		int age = Scanner.nextInt();
		System.out.println("나이는" + age + "살");
		
		double weight = Scanner.nextDouble();
		System.out.println("체중은" + weight + "kg");
		
		boolean isSingle = Scanner.nextBoolean();
		System.out.println("독신여부는" + isSingle + "입니다.");	
		
		Scanner.close();
		System.out.println();
	}
}
