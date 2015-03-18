import java.util.Scanner;

public class Toistoa {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int salasana = 0;
		int kertoja = 0;

		do {
			kertoja++;

			try {
				System.out.print("Syötä salasana (" + kertoja + ". yritys) :");
				salasana = lukija.nextInt();

				if (salasana == 1234)
					System.out.println("OIKEIN, TERVETULOA!");

				else
					System.out.println("VÄÄRIN!");
			} catch (Exception e) {
				System.out.println("Tuli virhe.");
			}

		} while (salasana != 1234 && kertoja < 3);
	}
}