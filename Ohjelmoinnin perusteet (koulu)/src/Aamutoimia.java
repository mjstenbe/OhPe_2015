import java.util.Scanner;

public class Aamutoimia {
	public static void main(String[] args) {
		boolean vastaus = true;
		boolean vastaus2 = true;
		boolean vastaus3 = true;
		boolean vastaus4 = true;
		boolean t = true;

		Scanner lukija = new Scanner(System.in);
		System.out.println("Oletko sy�nyt aamupalan? (true/false)");
		vastaus = lukija.nextBoolean();

		System.out.println("Oletko k�ynyt pesulla? (true/false): ");
		vastaus2 = lukija.nextBoolean();

		System.out.println("Oletko pakannut laukun? (true/false)");
		vastaus3 = lukija.nextBoolean();

		System.out.println("Oletko pukenut p��lle? (true/false)");
		vastaus4 = lukija.nextBoolean();

		if (vastaus == t & vastaus2 == t & vastaus3 == t & vastaus4 == t) {
			System.out.println("Tervemenoa kouluun!");
		} else {
			System.out.println("�l�s l�hde viel�, jotain puuttuu;)");
		}

	}

}
