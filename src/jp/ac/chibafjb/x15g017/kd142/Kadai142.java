package jp.ac.chibafjb.x15g017.kd142;

import java.util.Scanner;

public class Kadai142 {

	public static void main(String[] args) {
		Scanner yomi = new Scanner(System.in);
		System.out.println("整数aの入力　-->");
		int a = yomi.nextInt();
		System.out.println("整数bの入力　-->");
		int b = yomi.nextInt();
		System.out.println(a + "+" + b +"="+(a+b));
		System.out.println(a + "-"+ b + "="+(a-b));
		System.out.println(a + "*"+ b +"="+(a*b));
		System.out.println(a +"/"+b +"="+(a/b));
	}

}
