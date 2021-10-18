
public class ArraySum {

	public static void main(String[] args) {
		int [] a = new int [100];
		int sum=0;
		int buho=1;
		for(int i=0; i<a.length; i++) {
			a[i] = (i+1);
			if(a[i]%2==0) {
				buho=-1;
				a[i]*=buho;
				System.out.print(a[i]);
			}
			else if (a[i]==1) {
				System.out.print(a[i]);
			}
			else {
				buho=1;
				a[i]*=buho;
				System.out.print("+"+a[i]);
			}
			sum+=a[i];
		}
		System.out.print(" = "+sum);
	}

}
