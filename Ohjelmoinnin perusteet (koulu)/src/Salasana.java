import java.util.Scanner;

public class Salasana {



		public static void main(String[] args) {

			Scanner lukija = new Scanner(System.in);
			String tunnus, salasana;
			boolean tarkastus;

			do {
				System.out.println("Anna k�ytt�j�: ");
				tunnus = lukija.nextLine();

				System.out.println("Anna salasana");
				salasana = lukija.nextLine();

				// tallennetaan vertailun tulos tarkastus-muuttujaan

				tarkastus = salasana.equals("Sala$4na")	&& tunnus.equals("pekjarv");
						

				// Jos tunnukset eiv�t t�sm�nneet, tulostetaan virheilmoitus
				
				if (tarkastus == false)
					System.out.println("Virheellinen k�ytt�j� tai salasana");

				// Silmukan jatkamisehto: jatketaan jos tarkastus tuotti ep�toden
				
			} while (tarkastus != true);

			System.out.println("Kirjautuminen onnistui");
		}
	}

	
}
