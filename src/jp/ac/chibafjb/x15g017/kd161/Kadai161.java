package jp.ac.chibafjb.x15g017.kd161;

public class Kadai161 {

	public static void main(String[] args) {
		int test[]={10,20};
		int work = 0;
		work = test[1];
		test[1] = test[0];
		test[0] = work;
		
		for(int i =0;i<2;i++)
			System.out.println("test["+i+"]="+test[i]);
	}

}
