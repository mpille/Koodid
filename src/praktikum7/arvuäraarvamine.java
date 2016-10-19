package praktikum7;

import lib.TextIO;

public class arvu√§raarvamine {

	public static void main(String[] args) {

		int tundmatuarv = (int) (Math.random() * 100);
		System.out.println("Arva ‰ra arv 1 kuni 100");
		while (true) {
			// System.out.println(tundmatuarv);
			int kasutajaarv = TextIO.getlnInt();
			if (kasutajaarv == tundmatuarv) {
				System.out.println("’ige arv!");
				break;
			}
			if (kasutajaarv < tundmatuarv)
				System.out.println("Arv on suurem, proovi uuesti");
			if (kasutajaarv > tundmatuarv)
				System.out.println("Arv on v‰iksem, proovi uuesti");
		}
	}
}
