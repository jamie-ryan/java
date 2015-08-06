/*switch(expression){
    case value :
       //Statements
       break; //optional
    case value :
       //Statements
       break; //optional
    //You can have any number of case statements.
    default : //Optional
       //Statements
}*/

public class Testselectcase{
	public static void main(String args[]){
		int x = 5;
		
		switch( x ){
			case 1 :
				System.out.print("x equals 1 \n");
				break; //optional	
			
			case  5 :
				System.out.print("x equals 5 \n");
				break; //optional	
			
			default :
				System.out.print("Error, x doesn't appear to match any case \n"); //optional
		}
	}
}
