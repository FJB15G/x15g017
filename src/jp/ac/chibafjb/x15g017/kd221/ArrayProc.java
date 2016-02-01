package jp.ac.chibafjb.x15g017.kd221;

import java.util.Scanner;

public class ArrayProc {

	public static void main(String[] args) {
		int score[] = new int[101];
		for(int i = 0;i < 100;i++)
			score[i] = (int)(Math.random()*998);
		score[100] = 999;
		Scanner yomi = new Scanner(System.in);
		System.out.println("探索値を入力してください");
		int tan = yomi.nextInt();
		int iti = linerSearch1(score,tan);
		int iti2 = linerSearch2(score,tan);
		yomi.close();
		
		if(iti == 100 )
			System.out.println("linerSearch1 探索値"+tan+"は、配列score[]に存在しません");
		else
			System.out.println("linerSeach1 探索値"+tan+"は、配列score["+iti+"]に存在します");
		
		if(iti2 ==100)
			System.out.println("linerSearch2 探索値"+tan+"は、配列score[]に存在しません");
		else
			System.out.println("linerSearch2 探索値"+tan+"は、配列score["+iti2+"]に存在します");
	}
	
	public static int linerSearch1(int s[],int n){
		int i;
		for(i=0;i<100 && s[i]!=n;i++);
		return (i);	
	}
	
	public static int linerSearch2(int s[],int n){
		int  i;
		for(i = 99;i>=0 && s[i]!=n;i--);
		if(i == -1)
			return (100);
		else
			return (i);		
	}
}
