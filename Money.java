import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.print("�� �Է� : ");
		int money=scan.nextInt();
		int i=50000;
		int cnt=0;
		while(i>9) {
			System.out.print(i+"�� : ");
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
�� �Է� : 102020
50000�� : 2
1000�� : 2
10�� : 2

50000��
10000��
5000��
1000��
500��
100��
50��
10��
*/