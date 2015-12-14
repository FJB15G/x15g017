package jp.ac.chibafjb.x15g017.kd172;

public class Kadai172 {

	public static void main(String[] args) {
		int x[] = {1,2,3};
		int y[] = {7,8};
		int m = x.length;
		int n = y.length;
		int z[] = new int[m+n];
		int b = z.length;
		
		for (int i =0;i<m;i++)
			z[i] = x[i];
		
		for (int j = m;j<b;j++)
			z[j] = y[j-m];
		
		System.out.print("z[]={");
		for(int c =0;c<b;c++)
			System.out.print(z[c]+",");
		System.out.print("}");
		
		
		
	}
	}

