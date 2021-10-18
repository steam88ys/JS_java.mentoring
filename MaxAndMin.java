import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int su=scan.nextInt();
		int input_su;
		int max=0, min =0;
		
		for (int i=1; i<=su; i++) {
			input_su=scan.nextInt();
			if(max<input_su) max=input_su;
			else min=input_su;
		}
		System.out.print("ÃÖ¼Ú°ª : "+min+", ÃÖ´ñ°ª : "+max);
	}

}
