package jp.ac.chibafjb.x15g017.kd151;

import java.util.Scanner;

public class Kadai151 {

	public static void main(String[] args) {
		Scanner yomu = new Scanner(System.in);
		System.out.println("aの入力　-->");
		float a = yomu.nextFloat();
		System.out.println("bの入力　-->");
		float b = yomu.nextFloat();
		yomu.close();
		System.out.println(a + "+" + b + "=" +Math.floor((a+b)*100000)/100000);
		System.out.println(a + "-" + b + "=" +Math.floor((a-b)*100000)/100000);
		System.out.println(a + "*" + b + "=" +Math.floor((a*b)*100000)/100000);
		System.out.println(a + "/" + b + "=" +Math.floor((a/b)*100000)/100000);
	}

}
