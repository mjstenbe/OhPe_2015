
public class kurssitaulukko {
	public static void main(String[] args) {

		final double markka = 5.94573;

		System.out.print("Euroa");
		System.out.println("\t     Markkaa");
		System.out.println("");

		for (int euro = 1; euro <= 10; euro++) {
			System.out.printf("%5d", euro);

			System.out.print("   =    ");

			System.out.printf(("%.2f\n"), euro * markka);

		}

	}
}