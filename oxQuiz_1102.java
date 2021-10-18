import java.util.Scanner;

public class oxQuiz_1102 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int [] a = new int [10];
		int su;
		int cnt=0;
		int jumsu=0;
		
		for (int i=0; i<a.length; i++) {
			su = scan.nextInt();
			a [i]  = su;
		}
		
		// 연속된 1을 어떻게 나타낼까
		for (int i=0; i<a.length; i++) {
			if(a[i] == 1) {		// 1일 때
				++cnt;			// 1이 나온 횟수
				jumsu+=cnt;	// 점수 1씩 증가
			}
			else cnt=0;;		// 1이 아닐떄 연속 횟수 초기화
		}
		System.out.print(jumsu);
		
	}

}
