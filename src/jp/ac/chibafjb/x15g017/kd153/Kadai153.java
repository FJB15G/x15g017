package jp.ac.chibafjb.x15g017.kd153;

import java.util.Scanner;

public class Kadai153 {

	public static void main(String[] args) {
		Scanner yomu = new Scanner(System.in);
		System.out.print("半径ｒ　-->");
		float a = yomu.nextFloat();
		yomu.close();
		double b = 2 * 3.14 * a;
		double c = a * a * 3.14;
		System.out.println("円周　＝"+ Math.round((b * 10)/10));
		System.out.println("面積　＝"+ Math.round((c * 10)/10));
		
	}

}
