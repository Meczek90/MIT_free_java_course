
public class IterationTest {

	public static void main(String[] args) {
	double x=11;
	double y=1;
	while(x<47) {
		x+=3;
		y= x%2;
		if (y>=1)
		System.out.print("odd");
		else
		System.out.print("even");
		
		System.out.print(x);
	}
	
		
	}

}
