import java.util.Scanner;

public class array_1d {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] su = new int [10];
		int num;
		System.out.print("�Է��� �� 10�� : ");
		for (int i=0; i<10; i++) {
			num=scan.nextInt();
			if(num%2==0) {
				su[i] = num;
			}
			else continue;
			System.out.println("¦�� : "+su[i]);
		}
		
	}

}
