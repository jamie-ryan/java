/*The break keyword will stop the execution of the innermost loop and start executing the next line of code after the block.*/

public class Testbreakloop {
	public static void main(String args[]) {
		int [] numbers = {10, 20, 30, 40 ,50};

		for(int x : numbers ) {
			if( x == 30 ) {
				break;
			}
			System.out.print( x );
			System.out.print("\n");
		}
	}
}
