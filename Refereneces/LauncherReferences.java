package Refereneces;

import java.awt.List;
import java.util.ArrayList;

public class LauncherReferences {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i< 10; i++)
			list.add(i);
				
		list.forEach(System.out::println);
	}

}
