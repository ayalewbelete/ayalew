package lesson1;

public class Class2 {
	/*
	 * == is equal to
	 * != is not equal to
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 10;
		if (X != 20) {
			System.out.println("yes X == 10");
		}
		else {
			System.out.println("no X != 10");
		}
		// && = and     || = or
		int A =35;
		int B = 50;
		if ((A >=35) && (B >=45)){
			System.out.println("THE CONDITION IS TRUE");
		}
		else {
			System.out.println("the condition is false");
		}
		float C = (float) 45.5;
		double D = 562;
		if ((C!=(float)55.5) || (D+C == (float)607.5)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
