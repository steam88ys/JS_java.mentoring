 import java.util.Scanner;

public class PrimeNum2_1102 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cnt=0;
		int result_cnt=0;
		
		System.out.print("�� �Է� : ");
		int su=scan.nextInt();
		
		for(int i=1; i<=su; i++) {			//i => �������� �� j => ������ ��	
			cnt=0;
			for(int j=1; j<=i; j++) {		//��ġ�� 0�� �Ҽ��� �ƴ�
				
				if(i%j==0) cnt++;
				else continue;				// 1 �� ū���� ������
			}
			if(cnt==2) result_cnt+=(cnt/2);
		}
		
		System.out.print("0 ~ "+su+"������ �Ҽ��� ������ �� "+result_cnt+"�� �Դϴ�.");
	}

}


// ����� �������� �͵��� 2���� Ŀ�� 2���� ����
// �޼ҵ� Ȱ���ϱ�



/*
 import java.util.Scanner;

public class PrimeNum2_1102 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cnt=0;
		int result_cnt=0;
		
		System.out.print("�� �Է� : ");
		int su=scan.nextInt();
		
		for(int i=1; i<=su; i++) {			//i => �������� �� j => ������ ��
			for(int j=1; j<=i; j++) {		//��ġ�� 0�� �Ҽ��� �ƴ�
				if(i%j==0) cnt++;
				
					// �Ҽ��϶� 1�� ����
				else continue;				// 1 �� ū���� ������
			}
			if(cnt==2) result_cnt+=cnt;
		}
		
		System.out.print("0 ~ "+su+"������ �Ҽ��� ������ �� "+result_cnt+"�� �Դϴ�.");
	}

}
 */