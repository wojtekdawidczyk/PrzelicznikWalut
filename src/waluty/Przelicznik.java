package waluty;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Przelicznik {
	private final BigDecimal kurs;

	public Przelicznik(BigDecimal kurs) {
		this.kurs = kurs;
	}

	public BigDecimal getKurs() {
		return kurs;
	}

	public BigDecimal przeliczNaPLN(BigDecimal kwotaObca) {
		return kwotaObca.multiply(kurs).setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal przeliczNaWalute(BigDecimal kwotaPLN) {
		return kwotaPLN.divide(kurs, 2, RoundingMode.HALF_UP);
	}
	
}
