import java.util.Scanner;

public class ArraySum_1102 {

	public static void main(String[] args) {
		System.out.print("�� �Է� : ");
		int[] a = new int[10];
		
		Scanner scan = new Scanner (System.in);
		int su;
		
		for(int i=0; i<10; i++) {
			su = scan.nextInt();
			a[i]=su;
		}
		
		System.out.println("--- �޴� --- \n 1. ¦���� �� \n 2. Ȧ���� �� \n 3. �迭 ����� �� \n 4. ���� \n-----------");
		
		
		int hap=0;
		
		while(true) {
			System.out.print("��");
			int in=scan.nextInt();
			hap=0;
			if(in==1) {
				for(int i=0; i<10; i++) {
					if(a[i]%2==0) hap+=a[i];
				}
				System.out.println("�迭�� ¦���� ���� "+hap+"�Դϴ�.\n");
			}
			else if(in==2) {
				for(int i=0; i<10; i++) {
					if(a[i]%2!=0) hap+=a[i];
				}
				System.out.println("�迭�� Ȧ���� ���� "+hap+"�Դϴ�.\n");
			}
			else if(in==3) {
				for(int i=0; i<10; i++) {
					hap+=a[i];
				}
				System.out.println("�迭�� ����� ���� "+hap+"�Դϴ�.\n");
			}	
			else {
				System.out.println("�����մϴ�.\n");
				break;
			}
		}
	}

}
