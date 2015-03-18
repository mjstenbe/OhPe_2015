import java.util.Scanner;

public class Levykauppa {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		double rahaa;
		final double levynHinta = 20;
		System.out.print("Paljonko rahaa lompakossa on? ");
		rahaa = lukija.nextDouble();
		while (rahaa >= levynHinta) {
			System.out.println("Ostan levyn. Hinta " + levynHinta + " euroa.");
			rahaa -= levynHinta;
			System.out.println("Rahaa jäljellä lompakossa " + rahaa + " euroa");
		}
		System.out.println("Rahaa jäljellä " + rahaa
				+ " euroa. Ei riitä levyn ostamiseen.");
	}
}
