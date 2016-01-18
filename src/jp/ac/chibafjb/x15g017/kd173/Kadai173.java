package jp.ac.chibafjb.x15g017.kd173;

import java.util.Scanner;

public class Kadai173 {

	public static void main(String[] args) {
		int data[] = new int[4];
		int k = data.length;
		Scanner sca = new Scanner(System.in);
		int kazu ;
		System.out.println("数を入力してください");
		for(int i =0;i<k;i++){
			kazu = sca.nextInt();
			data[i] = kazu;
		}
		sca.close();
		
		for (int j =0;j<k;j++)
			System.out.println("data["+j+"]="+data[j]);

	}

}
