import java.util.Scanner;

public class NoNum_1102 {

	public static void main(String[] args) {
		int sum=45;
		
		System.out.print("배열 길이 : ");
		Scanner scan = new Scanner (System.in);
		int su = scan.nextInt();
		
		System.out.print("수 입력 : ");
		int[]a=new int [su];
		
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
			for(int j=0; j<10; j++) {
				if(j==a[i]) {
					sum-=j;
				}
			}
		}
		System.out.print("실행 결과 : "+sum);
	}

}
