package praktikum4;

import lib.TextIO;

public class CumLaudeDetektor {
	public static void main(String[] args) {
		double keskmine;

		System.out.print("Mis on teie keskmine hinne? ");
		keskmine = TextIO.getlnDouble();

		if (keskmine < 0 || keskmine > 5) {
			System.out.println("Keskmine hinne peab olema üle 4.5 ja ei tohi olla üle 5!");
			return;
		}
		int loputoo;

		System.out.print("Mis on teie lõputöö hinne? ");
		loputoo = TextIO.getlnInt();

		if (loputoo < 0 || loputoo > 5) {
			System.out.println("Lõputöö hinne peab olema 5!");
			return;
		}
		if (keskmine > 4.5 && loputoo == 5) {
			System.out.println("Jah saad cum laude diplomile!");
		} else {

			System.out.println("Ei saa!"); {
		}
	}
}
}
