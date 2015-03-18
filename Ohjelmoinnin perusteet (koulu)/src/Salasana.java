import java.util.Scanner;

public class Salasana {



		public static void main(String[] args) {

			Scanner lukija = new Scanner(System.in);
			String tunnus, salasana;
			boolean tarkastus;

			do {
				System.out.println("Anna käyttäjä: ");
				tunnus = lukija.nextLine();

				System.out.println("Anna salasana");
				salasana = lukija.nextLine();

				// tallennetaan vertailun tulos tarkastus-muuttujaan

				tarkastus = salasana.equals("Sala$4na")	&& tunnus.equals("pekjarv");
						

				// Jos tunnukset eivät täsmänneet, tulostetaan virheilmoitus
				
				if (tarkastus == false)
					System.out.println("Virheellinen käyttäjä tai salasana");

				// Silmukan jatkamisehto: jatketaan jos tarkastus tuotti epätoden
				
			} while (tarkastus != true);

			System.out.println("Kirjautuminen onnistui");
		}
	}

	
}
