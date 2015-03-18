import java.util.Scanner;

public class Avainluku {
	
	public static void main(String[] args) {
		
		int avainluku;
		int vertaaAvainluku;
		
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna avainluku: ");
		avainluku = lukija.nextInt();
		
		do {
			System.out.print("Arvaa syötettyluku:");
			vertaaAvainluku = lukija.nextInt();
			if (vertaaAvainluku > avainluku) {
				System.out.print("Avainluku on pienempi. ");
			} 
			else if (vertaaAvainluku < avainluku) {
				System.out.print("Avainluku on suurempi. ");
			}
		} while (vertaaAvainluku != avainluku);
		System.out.println("Arvasit oikein!");
	}
}
