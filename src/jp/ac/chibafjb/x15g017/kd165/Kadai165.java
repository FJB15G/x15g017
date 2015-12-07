package jp.ac.chibafjb.x15g017.kd165;

public class Kadai165 {

	public static void main(String[] args) {
		int a[] = {5,10,15};
		int m = a.length;
		int b[] = new int[m];
		int z = m;
		for(int i = 0;i<m;i++){
			z = z-1;
			b[i] = a[z];
			System.out.println("b["+i+"]="+b[i]);
		}	
	}

}
