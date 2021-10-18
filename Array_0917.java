import java.util.Scanner;

public class Array_0917 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum=0;
		int jumsu;
		System.out.print("수 입력 : ");
		int su = scan.nextInt();
		int [] a = new int [3];
		for(int i=0; i<su; i++) {
			System.out.print("점수 입력 : ");
			jumsu = scan.nextInt();
			a[i] = jumsu;
			sum+=a[i];
		}
		System.out.print("총 점수 합 : "+sum);
		
	}

}
