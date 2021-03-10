
public class NauticalMile {

	public static void main(String[] args) {
		double circum = 24859.82*5280;
		int minutesInCircle = 360*60;
		double nautMile = circum / minutesInCircle;
		System.out.println(
				"feet in a nautical mile =" + nautMile);
	}

}
