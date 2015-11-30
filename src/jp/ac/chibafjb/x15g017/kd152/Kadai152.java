package jp.ac.chibafjb.x15g017.kd152;

import java.util.Scanner;

public class Kadai152 {

	public static void main(String[] args) {
		Scanner yomi = new Scanner(System.in);
		System.out.print("半径ｒ　-->");
		int a = yomi.nextInt();
		yomi.close();
		double b = 2 * 3.14 * a;
		double c = 3.14 * a * a;
		System.out.println("円周　＝"+b);
		System.out.println("面積　＝"+c);
	}

}
