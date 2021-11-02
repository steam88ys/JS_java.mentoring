import java.util.Scanner;

public class NoOverlap_1102 {

	public static void main(String[] args) {
		int nuzuk = 0;	// 연속으로 입력된 수
		
		System.out.print("배열 길이 : ");
		Scanner scan = new Scanner(System.in);
		int su=scan.nextInt();
		
		int[] a = new int[su];
		System.out.print("수 입력 : ");
		
		// 입력
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
		}
		
		// 출력
		for(int i=0; i<a.length; i++) {
			if(i==a.length-1){
				System.out.print(a[i]);
			}
			else if(a[i]!=a[i+1]){		// 연속적으로 입력된 값
				System.out.print(a[i]+" ");
			}
			
		}
		
	}

}

/*   - 일 떄
import java.util.Scanner;

public class NoOverlap_1102 {

	public static void main(String[] args) {
		int nuzuk = 0;	// 연속으로 입력된 수
		
		System.out.print("배열 길이 : ");
		Scanner scan = new Scanner(System.in);
		int su=scan.nextInt();
		
		int[] a = new int[su];
		System.out.print("수 입력 : ");
		
		// 입력
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
		}
		
		// 출력
		for(int i=0; i<a.length; i++) {
			if(i==0){
				System.out.print(a[i]);
			}
			else if(a[i-1]!=a[i]){		// 연속적으로 입력된 값
				System.out.print(" "+a[i]);
			}
			
		}
		
	}

}

*/
