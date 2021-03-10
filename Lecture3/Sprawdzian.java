import javax.swing.*; // To support simple input
public class Sprawdzian { // Quadratic formula
 public static void main(String[] args) {
 final double TOL= 1E-15; // Constant (use final)
 String input= JOptionPane.showInputDialog("Enter a");
 double a= Double.parseDouble(input);
 input= JOptionPane.showInputDialog("Enter b");
 double b= Double.parseDouble(input);
 input= JOptionPane.showInputDialog("Enter c");
 double c= Double.parseDouble(input);
 double discriminant= b*b - 4.0*a*c;
 if ( discriminant < 0)
 System.out.println("Sorry, no real root");
 else if (Math.abs(discriminant) <= TOL) {
 double root= -0.5 * b / a;
 System.out.println("Root is " + root); }
 else { // Redefine root; blocks have own scopes
 double root=(-b + Math.sqrt(discriminant))/ (2.0*a);
 double root2=(-b- Math.sqrt(discriminant))/ (2.0*a);
 System.out.println("Roots: " + root +   " + root2"); 
}
 System.exit(0); 
 }
}
