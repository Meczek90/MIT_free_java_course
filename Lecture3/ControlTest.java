import javax.swing.*;

public class ControlTest {

	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog("demand");
		int d=Integer.parseInt(input); //demand
		//double d=100; //demand
		double s=50; //supply
		double p=10; //price
		double a=.1; 
		double b=.2;
		
		if (d>s)
			p=p+(a*(d-s));
		else if (d==s)
			p=p;
		else if (d<s)
			p=p-(b*(s-d));
		System.out.println(p);
	}

}
