import java.util.Scanner;

public class UserPassword {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		String user = "Niko";
		String password = "e";
		System.out.println("Sy�t� k�ytt�j�tunnus: ");
		String syotto = lukija.nextLine();
		if (syotto.equals(user)) {
			do {
				System.out.println("Anna salasana: ");
				String salas = lukija.nextLine();
				if (salas.equals(password)) {
					System.out.println("Tervetuloa Niko.");
					break;
				} else {
					System.out
							.println("Sy�tt�m�si salasana tai tunnus on v��r�.");
				}
			} while (syotto.equals(user));
		} else {
			System.out.println("K�ytt�j� tunnus on v��r�.");
		}
	}
}
