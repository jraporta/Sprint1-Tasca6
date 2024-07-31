package n1exercici1;

public class App {
	
	public static void main(String[] args) {
		String s1 = "patates";
		String s2 = "cigrons";
		String s3 = "cogombres";

		NoGenericMethods objecte = new NoGenericMethods(s1, s2, s3);
		NoGenericMethods objecte2 = new NoGenericMethods(s2, s1, s3);
		NoGenericMethods objecte3 = new NoGenericMethods(s2, s3, s1);
		
		System.out.println(objecte);
		System.out.println(objecte2);
		System.out.println(objecte3);
	}

}
