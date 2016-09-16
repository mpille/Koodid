package praktikum4;

import lib.TextIO;

public class AI {
	public static void main(String[] args) {
		int vanus1;
		int vanus2;
		System.out.println("Sisestage esimene vanus");
		vanus1 = TextIO.getlnInt();
		System.out.println("Sisestage teine vanus");
		vanus2 = TextIO.getlnInt();

		int vanusevahe = Math.abs(vanus1 - vanus2);

		if (vanusevahe > 10) {
			System.out.println("midagi väga krõbedat");
		} else if (vanusevahe > 5) {
			System.out.println("No ikka ei sobi");
		} else {
			System.out.println("Sobib");

		}
	}
}