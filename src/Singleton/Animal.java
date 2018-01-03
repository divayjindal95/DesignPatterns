package Singleton;

import Singleton.*;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton obj = Singleton.getInstance();
		obj.print();
		
		Singleton obj1 = Singleton.getInstance();
	}

}
