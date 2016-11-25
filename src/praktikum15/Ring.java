package praktikum15;

public class Ring {
	Punkt keskpunkt;
	double raadius;

	public Ring(Punkt p1, double r) {
		keskpunkt = p1;
		raadius = r;
	}

	public double ymbermoot() {

		return 2 * Math.PI * raadius;
	}

	public double pindala() {

		return Math.pow(raadius, 2) * Math.PI;
	}

	@Override
	public String toString() {
		return "Ring(" + keskpunkt + ", raadius " + raadius + ")";
	}
}
