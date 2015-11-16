package jp.ac.chibafjb.x15g017.kd143;

import java.util.Scanner;

public class Kadai143 {

	public static void main(String[] args) {
		Scanner yomi = new Scanner(System.in);
		System.out.println("住所の入力　-->");
		String juu = yomi.next();
		System.out.println("氏名の入力　-->");
		String mei = yomi.next();
		System.out.println("電話番号の入力　-->");
		int den = yomi.nextInt();
		yomi.close();
		System.out.format("%s\n%s\n%d",juu,mei,den);
	}

}