// Printf ohjeita mm. // http://www.java2s.com/Tutorial/Java/0120__Development/printftocommandlinesummary.htm

package Sessio4;

public class TulostuksenMuotoilua {

	public static void main(String[] args) {
		
		for (int i = 0; i < 15; ++i) {
			System.out.printf("(%15.5f)", Math.pow(Math.PI, i));
			System.out.println();
		}
		
		for (int i = 0; i < 15; ++i) {
				System.out.println( Math.pow(Math.PI, i));
		}

		

	}
}
