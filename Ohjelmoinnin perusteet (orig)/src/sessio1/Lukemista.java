package sessio1;
import java.util.Scanner;

public class Lukemista{

  public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);
    
    System.out.print("Kuinka vanha olet: ");
    int ika = lukija.nextInt();
    lukija.nextLine();
    
    System.out.print("Kenelle sanotaan hei: ");
    String nimi = lukija.nextLine(); 
    // Luetaan käyttäjältä rivi tekstiä ja asetetaan sen arvo muuttujaan nimi

    
    System.out.print("Hei " + nimi +" olet "+ika+ " vuotta vanha.");
  }
}