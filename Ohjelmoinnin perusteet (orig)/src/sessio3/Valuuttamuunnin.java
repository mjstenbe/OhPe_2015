package sessio3;

import java.util.Scanner;

public class Valuuttamuunnin {
	public static void main(String[] args) {

		double m‰‰r‰, kurssi;

		Scanner lukija = new Scanner(System.in);

		System.out.print("VALUUTTAMUUNNIN 1.0\n------------------------\n");
		System.out.print("Anna dollarin kurssi euroina: ");
		kurssi = lukija.nextDouble();
		System.out.print("Anna rahan m‰‰r‰ dollareina: ");
		m‰‰r‰ = lukija.nextDouble();

		if (kurssi > m‰‰r‰ ){
			System.out.println("Eka oli suurempi!");
		}
		else {
			System.out.println("Eka oli pienempi!");
		}
		
		// Tulostuksen muotoilua
		
		System.out.println("Rahan arvo dollareina = " + m‰‰r‰ / kurssi);
		// Kahden desimaalin tarkkuudella
		System.out.printf("(%.2f)\n", m‰‰r‰/kurssi);
		
		// Kahden desimaalin tarkkuudella, vasemmalle tasattuna (-), 16 merkin kent‰ss‰
		System.out.printf("(%-16.2f)\n", m‰‰r‰/kurssi);
		
		// Kolmen desimaalin tarkkuudella, oikealle tasattuna, 16 merkin kent‰ss‰
		System.out.printf("(%16.3f)\n", m‰‰r‰/kurssi);
		
		// Viiden desimaalin tarkkuudella, 16 merkin kent‰ss‰, zero padding
		System.out.printf("(%016.5f)\n", m‰‰r‰/kurssi);
		
		// Sama kuin edell‰, mutta pos/neg merkinn‰n kera
		System.out.printf("(%+16.3f)\n", m‰‰r‰/kurssi);
		System.out.printf("(%+16.3f)\n", m‰‰r‰/kurssi*-1);
		
		System.out.printf("(%50s)\n", "Java ohjelmointi");
		System.out.printf("(%-50s)\n", "Java ohjelmointi");
	}
}
