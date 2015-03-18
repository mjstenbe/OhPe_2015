import java.util.Scanner;


public class Valikko {

		public static void main(String args[]) {

			Scanner lukija = new Scanner(System.in);

			int joo;

			
			
			do {
			
			System.out.println("***************************");
			System.out.println("* 1 – Käynnistä auto");
			System.out.println("* 2 – Aja autoa");
			System.out.println("* 3 – Sammuta auto");
			System.out.println("* 4 – Lopeta peli");
			System.out.println("***************************");

			System.out.print("Mitä haluat tehdä? (Syötä numero 1-4) ");
			
			joo = lukija.nextInt();
			
			
			switch (joo) {
			case 1:
				System.out.println("Käynnistä auto.");
				break;
			case 2:
				System.out.println("Aja autoa.");
				break;
			case 3:
				System.out.println("Sammuta auto.");
				break;
			case 4:
				System.out.println("Lopeta peli.");
				break;

			default:
			System.out.println("Koita syöttää numero 1-4 väliltä.");
			
		}
		}
			while (joo != 4);
			System.out.println("GAME IS OVER MAN.");
		}
	
	
}










