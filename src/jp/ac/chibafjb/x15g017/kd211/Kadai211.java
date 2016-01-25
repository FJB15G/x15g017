package jp.ac.chibafjb.x15g017.kd211;

import java.util.Scanner;

public class Kadai211 {
	public static void main(String[] args) {
		Scanner yomu = new Scanner(System.in);
		System.out.println("配列の長さを入力してください");
		int kazu = yomu.nextInt();
		int num[] = new int[kazu];
		System.out.println("整数を"+kazu+"個入力してください");
		
		for(int i = 0;i<kazu;i++){
			int seisu = yomu.nextInt();
			num[i] = seisu;
		}
		yomu.close();
		int a = num.length;
		int m = maxFind1(num,a);
		int n = maxFind2(num,a);
		
		System.out.println("maxFind1 最大値は"+m+"です");
		System.out.println("maxFind2 最大値は"+n+"です");
	}
	
	public static int maxFind1(int num[],int a){
		int m = 0;
		for(int i = 0;i<a;i++){
			if(num[i]>m)
				m = num[i];
		}
		return (m);
	}
	
	public static int maxFind2(int num[],int a){
		int m = num[0];
		for(int i = 1;i<a;i++){
			if(num[i]>m)
				m = num[i];
		}
		return (m);
				
	}

}
