package waluty;

import java.math.BigDecimal;

public class PobierzKursEuro {

	public static void main(String[] args) {
		try {
			BigDecimal wynik = Pobieranie.pobierzAktualnyKurs("EUR");
			System.out.println(wynik);
		} catch (ProblemZPobieraniem e) {
			e.printStackTrace();
		}
		

	}

}
