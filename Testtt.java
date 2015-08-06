//(Obect reference variable) instanceof (class/interface type)

/*If the object refferd to on the LHS of the operator passes the check for the class/interface type on the RHS then the result will be true*/

public class Testtt {

		public static void main(String args[]){
			String name = "James";
			//following will return true since name is a type of String
			boolean result = name instanceof String;
			System.out.println( result );
			}
}
