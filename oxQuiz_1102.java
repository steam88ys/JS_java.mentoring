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
		
		// ���ӵ� 1�� ��� ��Ÿ����
		for (int i=0; i<a.length; i++) {
			if(a[i] == 1) {		// 1�� ��
				++cnt;			// 1�� ���� Ƚ��
				jumsu+=cnt;	// ���� 1�� ����
			}
			else cnt=0;;		// 1�� �ƴҋ� ���� Ƚ�� �ʱ�ȭ
		}
		System.out.print(jumsu);
		
	}

}
