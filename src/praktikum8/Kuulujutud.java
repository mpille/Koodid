package praktikum8;

import praktikum6.Meetodid;

public class Kuulujutud {

	public static void main(String[] args) {

		String[] meheNimed = { "Juku", "Kalle", "Peeter" };
		String[] naiseNimed = { "Jaana", "Kati", "Karin", "Maarja" };
		String[] tegusõnad = { "laulavad", "jooksevad", "jalutavad" };

		String mees = suvalineElement(meheNimed);
		String naine = suvalineElement(naiseNimed);
		String tegevus = suvalineElement(tegusõnad);

		System.out.format("%s ja %s %s.", mees, naine, tegevus);

	}

	public static String suvalineElement(String[] sõnad) {
		return sõnad[Meetodid.suvalineArv(0, sõnad.length - 1)];
	}
}