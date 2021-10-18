import java.util.Scanner;

public class ArraySum_1102 {

	public static void main(String[] args) {
		System.out.print("수 입력 : ");
		int[] a = new int[10];
		
		Scanner scan = new Scanner (System.in);
		int su;
		
		for(int i=0; i<10; i++) {
			su = scan.nextInt();
			a[i]=su;
		}
		
		System.out.println("--- 메뉴 --- \n 1. 짝수의 합 \n 2. 홀수의 합 \n 3. 배열 요소의 합 \n 4. 종료 \n-----------");
		
		
		int hap=0;
		
		while(true) {
			System.out.print("▶");
			int in=scan.nextInt();
			hap=0;
			if(in==1) {
				for(int i=0; i<10; i++) {
					if(a[i]%2==0) hap+=a[i];
				}
				System.out.println("배열의 짝수의 합은 "+hap+"입니다.\n");
			}
			else if(in==2) {
				for(int i=0; i<10; i++) {
					if(a[i]%2!=0) hap+=a[i];
				}
				System.out.println("배열의 홀수의 합은 "+hap+"입니다.\n");
			}
			else if(in==3) {
				for(int i=0; i<10; i++) {
					hap+=a[i];
				}
				System.out.println("배열의 요소의 합은 "+hap+"입니다.\n");
			}	
			else {
				System.out.println("종료합니다.\n");
				break;
			}
		}
	}

}
