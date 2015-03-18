import java.util.Scanner;

public class Arvauspeli {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Arvaa mikä viikonpäivä? ");
		String arvaus = lukija.nextLine();
		
		String su = "sunnuntai";
		String la = "lauantai";
		
		if (arvaus.equals(la) || arvaus.equals(su)) {
			System.out.println("On viikonloppu");
		} else {
			System.out.println("Ei viikonloppu");
		}
	}
}
