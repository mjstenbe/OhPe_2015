import java.util.Scanner;

public class MittaajanApuri {

	public static void main(String[] args) {
		// esitell‰‰n muuttuja
		int lukumaara;

		// luodaan lukija (myˆs rivi 1)
		Scanner lukija = new Scanner(System.in);

		// kysyt‰‰n k‰ytt‰j‰lt‰ montako mittausta suoritetaan
		System.out.println("Montako mittausta suoritetaan?");
		lukumaara = lukija.nextInt();

		// luodaan taulukko
		double[] mittausTulokset = new double[lukumaara];

		// Kysyt‰‰n mittaus tulokset ja tallennetaan ne taulukkoon
		for (int i = 0; i <= lukumaara - 1; i++) {
			System.out.print("Anna " + (i + 1) + ". mittauksen tulos: ");
			double tulos = lukija.nextDouble();
			mittausTulokset[i] = tulos;
		}

		// suoritetaan metodien tulostaMitat ja laskeKeskiarvo toiminnot
		tulostaMitat(mittausTulokset);
		laskeKeskiarvo(mittausTulokset);

	}

	// metodi tulostaMitat tulostaa taulukkoon tallennetut mitat jokaisen
	// erikseen
	public static void tulostaMitat(double[] mittausTulokset) {
		System.out.println("");
		System.out.println("MITTAUSTULOKSET:");

		for (int i = 0; i < mittausTulokset.length; i++) {
			System.out.println((i + 1) + ") " + mittausTulokset[i]);
		}

	}

	// metodi laskeKeskiarvo laskee taulukon tietojen keskiarvon ja tulostaa sen
	// ruudulle
	public static void laskeKeskiarvo(double[] mittausTulokset) {
		double summa = 0;
		double keskiarvo = 0;
		for (int i = 0; i < mittausTulokset.length; i++) {
			summa += mittausTulokset[i];
			keskiarvo = summa / (i + 1);
		}
		System.out.println("MITTAUSTEN KESKIARVO: " + keskiarvo);
	}

}