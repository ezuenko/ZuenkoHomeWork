package Task1;

public class Power {

	public static void main(String[] args) {
		Pow(2, -2);

	}

	public static double Pow(double a, int b) {
		double res = 1;
		if (b < 0) {
			for (int i = 0; i <= (-1) * b - 1; i++) {
				res *= (1 / a);
			}
		}

		for (int i = 0; i <= b - 1; i++) {

			res *= a;

		}
		// String s = a + " в степени " + b + " равно " + res;
		System.out.println(a + " в степени " + b + " равно " + res);
		return res;
	}

}
