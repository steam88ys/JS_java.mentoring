import java.util.Scanner;

public class NoOverlap_1102 {

	public static void main(String[] args) {
		int nuzuk = 0;	// �������� �Էµ� ��
		
		System.out.print("�迭 ���� : ");
		Scanner scan = new Scanner(System.in);
		int su=scan.nextInt();
		
		int[] a = new int[su];
		System.out.print("�� �Է� : ");
		
		// �Է�
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
		}
		
		// ���
		for(int i=0; i<a.length; i++) {
			if(i==a.length-1){
				System.out.print(a[i]);
			}
			else if(a[i]!=a[i+1]){		// ���������� �Էµ� ��
				System.out.print(a[i]+" ");
			}
			
		}
		
	}

}

/*   - �� ��
import java.util.Scanner;

public class NoOverlap_1102 {

	public static void main(String[] args) {
		int nuzuk = 0;	// �������� �Էµ� ��
		
		System.out.print("�迭 ���� : ");
		Scanner scan = new Scanner(System.in);
		int su=scan.nextInt();
		
		int[] a = new int[su];
		System.out.print("�� �Է� : ");
		
		// �Է�
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
		}
		
		// ���
		for(int i=0; i<a.length; i++) {
			if(i==0){
				System.out.print(a[i]);
			}
			else if(a[i-1]!=a[i]){		// ���������� �Էµ� ��
				System.out.print(" "+a[i]);
			}
			
		}
		
	}

}

*/
