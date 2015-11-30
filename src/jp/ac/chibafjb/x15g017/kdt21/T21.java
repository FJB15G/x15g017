package jp.ac.chibafjb.x15g017.kdt21;

import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		Scanner kau = new Scanner(System.in);
		System.out.print("ハンバーガーの個数 -->");
		int hanko = kau.nextInt();
		System.out.print("フライドポテトの個数 -->");
		int hurako = kau.nextInt();
		int handai = hanko *100;
		int huradai = hurako * 180;
		
		System.out.println("ハンバーガーの代金　＝"+handai+"円");
		System.out.println("フライドポテトの代金　＝"+huradai+"円");
		int syou = handai + huradai;
		System.out.println("小計　＝"+syou+"円");
		double zei = Math.floor(syou*0.08);
		System.out.println("消費税　＝"+zei+"円");
		
		
		double gou = syou + zei;
		System.out.println("合計金額　＝"+gou+"円");
		
		System.out.print("受取金額　-->");
		int kin = kau.nextInt();
		kau.close();
		double turi = kin - gou;
		System.out.print("つり銭　＝"+turi+"円");
	}

}
