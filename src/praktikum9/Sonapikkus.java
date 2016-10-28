package praktikum9;

import lib.TextIO;

public class Sonapikkus {
	public static void main(String[] args) {
		String[] nimed = new String[10];
		System.out.println("Sisesta 10 sõna");
		for (int i = 0; i < 10; i++) {
			nimed[i] = TextIO.getlnString();
		}
		for (int j = 0; j < 10; j++) {
			int k = nimed[j].length();

			System.out.println(k + " " + nimed[j]);
		}

	}
}
