import java.util.Scanner;

public class Array_0917 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sum=0;
		int jumsu;
		System.out.print("�� �Է� : ");
		int su = scan.nextInt();
		int [] a = new int [3];
		for(int i=0; i<su; i++) {
			System.out.print("���� �Է� : ");
			jumsu = scan.nextInt();
			a[i] = jumsu;
			sum+=a[i];
		}
		System.out.print("�� ���� �� : "+sum);
		
	}

}
