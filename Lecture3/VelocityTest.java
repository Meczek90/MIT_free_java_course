import javax.swing.*;

public class VelocityTest {
	public static void main (String[] args) {
	String input= JOptionPane.showInputDialog("Enter time");
	int time= Integer.parseInt(input);
	double d=225;
	double d2=d-25;
	double v=d2/time;
	 System.out.println((v>60 || v<225));
		
	}
}