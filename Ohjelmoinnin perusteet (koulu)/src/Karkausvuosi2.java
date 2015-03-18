public class Karkausvuosi2 {

	public static void main(String args[]) {

		for (int i = 1753; i <= 2050; i++) {
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
				System.out.println(i + " oli karkausvuosi.");

		}

	}
}
