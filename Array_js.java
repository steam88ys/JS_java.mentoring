import java.util.Scanner;

public class Array_js {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] a = new int [10];
		int su;
		int max=0;
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			su = scan.nextInt();
			a[i]=su;
			while(true) {
				if(!(su>=1 && su<=20 )) {
					System.out.print("재입력 : ");
					su = scan.nextInt();
				}
				else {
					break;
				}
				a[i]=su;
			}
			
			if(max<a[i]) {
				max=a[i];
			}
			else {
				continue;
			}
		}
		System.out.print("가장 큰 수는 "+max);
	}

}
