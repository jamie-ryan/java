//(Obect reference variable) instanceof (class/interface type)

/*If the object refferd to on the LHS of the operator passes the check for the class/interface type on the RHS then the result will be true*/

class Vehicle {}

public class Car extends Vehicle {
	public static void main(String args[]){
		Vehicle a = new Car();
		boolean result = a instanceof Car;
		System.out.println( result );
	}
}
