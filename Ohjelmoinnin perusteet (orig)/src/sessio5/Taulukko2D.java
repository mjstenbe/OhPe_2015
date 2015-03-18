package sessio5;

public class Taulukko2D {

	public static void main(String[] args) {

		String[] vaaka = {"A","B","C","D","E","F","G"};
		int [] pysty = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < 7; ++i){
			System.out.println();
			System.out.print(vaaka[i]+" ");
			for (int j = 0; j < 10; ++j) {
				System.out.print(pysty[j]);
			}
		}
	}
}
