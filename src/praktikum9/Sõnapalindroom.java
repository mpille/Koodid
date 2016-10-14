package praktikum9;

import lib.TextIO;

public class Sõnapalindroom {

	public static void main(String[] args) {
		System.out.println("Sisestage sõna");
		String s6na = TextIO.getlnString();
		if (onPalindroom(s6na)) {
			System.out.println("On palindroom");
		} else {
			System.out.println("Ei ole palindroom");
		}

	}

	public static boolean onPalindroom(String s6na) {
		return s6na.equals(tagurpidi(s6na));
	}

	public static String tagurpidi(String oigetpidi) {
		String tagurpidi = "";
		for (int i = 0; i < oigetpidi.length(); i++) {
			tagurpidi = oigetpidi.charAt(i) + tagurpidi;
		}

		return tagurpidi;
	}

}
