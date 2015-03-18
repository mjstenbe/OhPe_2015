import java.util.Scanner;

public class EtsiminenTaulukosta {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

		int[] lukuTaulu = { 55, 23, 6456, 324, 21, 234, 72, 21 };
		String[] nimiTaulu = { "Petteri", "Kauko", "Matti", "Minna", "Maisa",
				"Juuso", "Mauno" };

		System.out.print("Mit� lukua etsit? ");
		int number = lukija.nextInt();

		for (int o = 0; o < lukuTaulu.length; o++) {

			if (number == lukuTaulu[o]) {
				System.out.println("Luku l�ytyi alkiosta numero: " + o);
			}
		}

		System.out.print("Ket� haluat etsi�? ");
		String name = lukija.nextLine();

		for (int i = 0; i < nimiTaulu.length; i++) {

			if (name.equalsIgnoreCase((nimiTaulu[i]))) {
				System.out.println("Nimi l�ytyy alkiosta numero: " + i);
			}
		}

	}
}
