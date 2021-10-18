import java.util.Scanner;

public class NoOverlap_1102 {

	public static void main(String[] args) {
		int nuzug = 0;
		System.out.print("배열 길이 : ");
		Scanner scan = new Scanner(System.in);
		int su=scan.nextInt();
		int[] a = new int[su];
		System.out.print("수 입력 : ");
		for(int i=0; i<a.length; i++) {
			nuzug=0;
			a[i]=scan.nextInt();
			nuzug=a[i];
		}
		System.out.print("=> ");
		for(int i=0; i<a.length; i++) {
			if(a[i]==nuzug) {
				System.out.print(a[i]);
			}
		}
		
	}

}
