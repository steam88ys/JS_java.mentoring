import java.util.Scanner;

public class PrimeNum1_1102 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.print("�� �Է� : ");
		int su=scan.nextInt();
		int cnt=0;
		
		for(int i=1; i<=su; i++) {
			if(su%i==0) cnt++;
		}
		if(cnt==2){
			System.out.print(su+"��(��) �Ҽ� �Դϴ�.");
		}
		else {
			System.out.print(su+"��(��) �Ҽ��� �ƴմϴ�.");
		}
		
	}

}
