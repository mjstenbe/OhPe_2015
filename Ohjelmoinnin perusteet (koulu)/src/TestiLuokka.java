public class TestiLuokka {

	public static void main(String[] args){
		
	omaMetodi();
	String merkkijono = omaMetodi2("Merkkijono!");
	System.out.println(merkkijono);
	
	int tulos = 10;		
	System.out.println("Tulos: "+tulos+" euroa.");
			
	}
	public static void omaMetodi(){
		System.out.println("Oma metodi!");
	}
	
	public static String omaMetodi2(String teksti){
		
		System.out.println("Oma metodi! "+teksti);
		return "Loppu";
	}
	
}









