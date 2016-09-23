package praktikum6;

import lib.TextIO;

public class Kuup {

	public static void main(String[] args) {

		int kuup;
		System.out.println("Sisestage arv");
		kuup = TextIO.getlnInt();
		int tulemus;
		tulemus = kuup * kuup * kuup;
		System.out.println(tulemus);

	}

}
