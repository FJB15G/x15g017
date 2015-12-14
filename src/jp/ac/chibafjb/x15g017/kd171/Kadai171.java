package jp.ac.chibafjb.x15g017.kd171;

public class Kadai171 {

	public static void main(String[] args) {
		int data[] ={100,200,300,0};
		int k = data.length-1;
		
		for (int i = k;i>=1;i--)
			data[i]=data[i-1];
		
		for (int j =0;j<=k;j++)
			System.out.println("data["+j+"]="+data[j]);

	}	
}
