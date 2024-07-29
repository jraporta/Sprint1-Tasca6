package n2exercici2;

import java.util.Iterator;
import java.util.List;

public class GenericMethods {

	public static void printInfo(List<?> list) {
		for (Iterator<?> it = list.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}
	
}
