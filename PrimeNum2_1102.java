 import java.util.Scanner;

public class PrimeNum2_1102 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cnt=0;
		int result_cnt=0;
		
		System.out.print("수 입력 : ");
		int su=scan.nextInt();
		
		for(int i=1; i<=su; i++) {			//i => 나눠지는 수 j => 나누는 수	
			cnt=0;
			for(int j=1; j<=i; j++) {		//어치피 0은 소수가 아님
				
				if(i%j==0) cnt++;
				else continue;				// 1 더 큰수로 나누기
			}
			if(cnt==2) result_cnt+=(cnt/2);
		}
		
		System.out.print("0 ~ "+su+"까지의 소수의 갯수는 총 "+result_cnt+"개 입니다.");
	}

}


// 약수가 여러개인 것들이 2보다 커도 2에서 멈춤
// 메소드 활용하기



/*
 import java.util.Scanner;

public class PrimeNum2_1102 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cnt=0;
		int result_cnt=0;
		
		System.out.print("수 입력 : ");
		int su=scan.nextInt();
		
		for(int i=1; i<=su; i++) {			//i => 나눠지는 수 j => 나누는 수
			for(int j=1; j<=i; j++) {		//어치피 0은 소수가 아님
				if(i%j==0) cnt++;
				
					// 소수일때 1번 세기
				else continue;				// 1 더 큰수로 나누기
			}
			if(cnt==2) result_cnt+=cnt;
		}
		
		System.out.print("0 ~ "+su+"까지의 소수의 갯수는 총 "+result_cnt+"개 입니다.");
	}

}
 */