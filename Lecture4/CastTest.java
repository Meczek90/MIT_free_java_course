
public class CastTest {

	public static void main(String[] args) {
		int x1=1;
		int x2=0;
		int x3=12;
		
		double x=((x1+x2+x3)/3);
		
		System.out.print(x);
		
		long big=9876543210L;
		int x4=big;
		
		System.out.print(x4);

		int small=2.0 -0.000000000000001;
		int s=small;
	}

}
