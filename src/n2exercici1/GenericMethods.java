package n2exercici1;

public class GenericMethods {

	public static <T,U> void printInfo(Persona persona, T t, U u) {
		System.out.printf("%s, %s, %s%n", persona, t, u);
	}
	
}
