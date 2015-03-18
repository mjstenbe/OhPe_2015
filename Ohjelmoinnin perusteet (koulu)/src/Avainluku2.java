import java.util.Scanner;

public class Avainluku2 {
	public static void main(String[] args) {
		int luku;
		int lukukaksi;
		
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna kokonaisluku: ");
		luku = lukija.nextInt();
		
		do {
			System.out.print("Arvaa luku: ");
			lukukaksi = lukija.nextInt();
			if (lukukaksi < luku)
				System.out.print("Arvaamasi luku oli liian pieni. ");
			
			else if (lukukaksi > luku)
				System.out.print("Arvaamasi luku oli liian suuri. ");
			
		} while (lukukaksi < luku || lukukaksi > luku);
		
		System.out.println("Luku oli oikein!");
	}
}
