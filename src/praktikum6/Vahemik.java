package praktikum6;

import lib.TextIO;

public class Vahemik {

	public static int kasutajaSisestus(int min, int max) {
		int sisestus;
		while (true) {
			System.out.println("Palun sisesta arv vahemikus " + min + " kuni " + max);
			sisestus = TextIO.getlnInt();
			if (sisestus < min || sisestus > max) {
				System.out.println("No see arv ei ole ju vahemikus!");
			} else {
				return sisestus;
			}
		}
	}

	public static int ruut(int i) {
		return i * i;
	}

	public static int kuup(int i) {
		return (int) Math.pow(i, 3);
	}

	public static void main(String[] args) {
		int kasutajaSisestatudArv = kasutajaSisestus(0, 10);
		System.out.println("Kasutaja sisestas: " + kasutajaSisestatudArv);
	}
}