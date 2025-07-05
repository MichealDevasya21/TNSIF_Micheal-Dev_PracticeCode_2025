package access_modifiersdemo.secondpackage;

import access_modifiersdemo.firstpackage.Base;

public class Executer {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
		

	}

}
