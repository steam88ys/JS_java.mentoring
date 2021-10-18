import java.util.Scanner;

public class DigitSum_1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("수 입력 : ");
		int N=scan.nextInt();
		System.out.print(N+" = ");
		while(true) {
			sum+=(N%i);		
			N/=10;
			if(N==0) {
				break;
			}
			else continue;
		}
		
		System.out.print(+sum);
		
	}

} 
//10으로 %하고 누적, /로 자릿수 하나 옮기고 다기 반복

//import java.util.Scanner;
//
//public class DigitSum_1102 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int sum=0;
//		int i=10;
//		Scanner scan=new Scanner(System.in);
//		System.out.print("수 입력 : ");
//		int N=scan.nextInt();
//		
//		int psu=N;
//		while (psu/i!=0) {
//			psu-=(%i);
//			i*=i;
//			
//		}
//		sum+=psu;
//		System.out.print(N+" = "+sum);
//		
//	}
//
//}

//0으로 반복문 끝내기



/* psu 빼기
 sum = 123 % 10 => 3
 N = 123 / 10 => 12
 
 */
