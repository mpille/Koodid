package praktikum8;

import lib.TextIO;

public class Vastupidinearv {

	public static void main(String[] args) {

		int arvud[] = new int[11];

		for (int i = 1; i < arvud.length; i++) {
			System.out.println("Sisestage arv " + i);
			arvud[i] = TextIO.getlnInt();
		}

		for (int i = arvud.length - 1; i > 0; i--) {
			System.out.println("Väärtus kohal " + i + " on " + arvud[i]);
		}

	}
}