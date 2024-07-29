package n1exercici2;

public class GenericMethods {

	public static <T,U,V> void printInfo(T t, U u, V v) {
		System.out.printf("%s, %s, %s%n", t, u, v);
	}
	
}
