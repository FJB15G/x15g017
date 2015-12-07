package jp.ac.chibafjb.x15g017.kd163;

public class Kadai163 {

	public static void main(String[] args) {
		int x[]={33,18,102,47,5};
		int n =x.length;
		int sum = 0;
		for(int i=0;i<n;i++)
			sum = sum + x[i];
		System.out.println("合計　＝" + sum);
	}

}
