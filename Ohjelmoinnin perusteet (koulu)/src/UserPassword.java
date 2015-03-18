import java.util.Scanner;

public class UserPassword {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		String user = "Niko";
		String password = "e";
		System.out.println("Syötä käyttäjätunnus: ");
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
							.println("Syöttämäsi salasana tai tunnus on väärä.");
				}
			} while (syotto.equals(user));
		} else {
			System.out.println("Käyttäjä tunnus on väärä.");
		}
	}
}
