/*for(declaration : expression)
{
   Statements or expressions
}

this type of loop is mainly used for arrays*/

public class Testenhancedforloop {
	public static void main(String args[]){
		int [] numbers = {10, 20, 30, 40, 50}; //intarr = int []

		for(int x : numbers ){
			System.out.print( x );
			System.out.print(",");
		}
		System.out.print("\n");
		String [] names = {"James", "Larry", "Tom", "Lacy"};
		for( String name : names ) {
			System.out.print( name );
			System.out.print(",\n");
		}
	}
}
