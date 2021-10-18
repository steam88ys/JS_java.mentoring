import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.print("돈 입력 : ");
		int money=scan.nextInt();
		int i=50000;
		int cnt=0;
		while(i>9) {
			System.out.print(i+"원 : ");
			if(money/i>0) {
				money-=(money/i);
				i/=5;
				cnt++;
				money-=(money/i);
				i/=2;
				cnt++;
			}
			
			else {
				break;
			}
			
			System.out.println(cnt);
		}
		
	}

}

/*
돈 입력 : 102020
50000원 : 2
1000원 : 2
10원 : 2

50000원
10000원
5000원
1000원
500원
100원
50원
10원
*/