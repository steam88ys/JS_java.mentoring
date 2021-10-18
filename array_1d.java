import java.util.Scanner;

public class array_1d {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] su = new int [10];
		int num;
		System.out.print("입력할 수 10개 : ");
		for (int i=0; i<10; i++) {
			num=scan.nextInt();
			if(num%2==0) {
				su[i] = num;
			}
			else continue;
			System.out.println("짝수 : "+su[i]);
		}
		
	}

}
