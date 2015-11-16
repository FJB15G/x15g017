package jp.ac.chibafjb.x15g017.kd144;

import java.util.Scanner;

public class Kadai144 {

	public static void main(String[] args) {
		Scanner yomi = new Scanner(System.in);
		System.out.println("住所の入力　-->");
		String a = yomi.next();
		System.out.println("氏名の入力　-->");
		String b = yomi.next();
		System.out.println("電話番号の入力　-->");
		int c = yomi.nextInt();
		yomi.close();
		System.out.print("＜確認＞");
		System.out.println("住　　所："+a);
		System.out.println("　　　　氏　　名："+b);
		System.out.println("　　　　電話番号："+c);
	}

}
