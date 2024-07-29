package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		list.add(new Persona("Jordi", "Pérez", 19));
		list.add("patates");
		list.add(25);
		list.add(3.14);
		int[] array = {1, 2, 3, 4};
		list.add(Arrays.toString(array));
		
		GenericMethods.printInfo(list);
	}

}
