import java.util.Scanner;

public class LeffanTiedot {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

		System.out.println("Mik� on elokuvan nimi?");
		int luku1 = lukija.nextInt();
		System.out.println("Kuka elokuvan ohjasi?");
		int luku2 = lukija.nextInt();
		System.out.println("Min� vuonna elokuva valmistui?");
		int luku3 = lukija.nextInt();
		System.out.println("L�ytyyk� leffahyllyst� (true/false)?");
		boolean luku4 = lukija.nextBoolean();

		System.out.println("ELOKUVAN TIEDOT:");
		System.out.println(luku1 + (luku3));
		System.out.println("Ohjaus: " + luku2);

		if (luku4 == true) {
			System.out.println("L�ytyy leffahyllyst�: Kyll�");
		} else {
			System.out.println("L�ytyy leffahyllyst�: Ei");

		}

	}
}