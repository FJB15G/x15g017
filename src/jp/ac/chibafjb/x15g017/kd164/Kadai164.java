package jp.ac.chibafjb.x15g017.kd164;

public class Kadai164 {

	public static void main(String[] args) {
		int a[] = {5,10,15};
		int m = a.length;
		int b[] = new int[m];
		for(int i = 0;i<m;i++){
			b[i] = a[i];
			System.out.println("b[" + i + "]="+b[i]);
		}	
	}

}
