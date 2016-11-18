package praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class LoeJaSorteeri {

	public static void main(String[] args) {

		ArrayList<String> failiSisu = new ArrayList<String>();
		failiSisu = FailiLugeja.loeFail("kala.txt");
		Collections.sort(failiSisu);
		System.out.println(failiSisu);

	}

}
