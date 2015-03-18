
import java.util.Scanner;

public class Lukujono {

	// Main metodi
	public static void main(String[] args) {
		// muuttujat
		int ekaLuku, tokaLuku;
		int summa = 0;

		try {
			// Luetaan syöte Scanner luokalla
			Scanner s = new Scanner(System.in);

			// Luetaan eka luku
			// s.nextLine() tyhjentää rivinvaihdon bufferista
			System.out.print("Anna eka luku: ");
			ekaLuku = s.nextInt();
			s.nextLine();

			// Luetaan toka luku
			// s.nextLine() tyhjentää rivinvaihdon bufferista
			System.out.print("Anna toka luku: ");
			tokaLuku = s.nextInt();
			s.nextLine();

			// Ensimmäinen tulostus
			// lasketaan samalla lukujen summa valmiiksi!

			System.out.println("\nLUKUJONO a):");
			for (int i = ekaLuku; i < tokaLuku; i++) {
				System.out.print(i + ", ");
				summa += i;
			}
			summa += tokaLuku;
			System.out.println(tokaLuku);

			// Toinen tulostus
			System.out.println("\nLUKUJONO b):");
			for (int i = tokaLuku; i > ekaLuku; i--) {
				System.out.print(i + ", ");
			}
			System.out.println(ekaLuku);

			System.out.println("\nLUKUJEN SUMMA c): " + summa);

		} catch (Exception e) {
			System.out.println("Ohjelman suorituksessa tapahtui virhe!");
			e.printStackTrace();
		}
	}

}
