package waluty;

import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;


public class Pobieranie {
	public static final String baseUrl = "http://api.nbp.pl/api/exchangerates/rates/";
	
	
	public static BigDecimal pobierzAktualnyKurs(String kodWaluty) throws ProblemZPobieraniem {
		String tabela = "A";
		String adres = baseUrl + tabela + "/" + kodWaluty + "/?format=xml";
		
		System.out.println("Wysyłam zapytanie pod adres " + adres);
		
		try {
			URL url = new URL(adres);
			try(InputStream in = url.openStream()) {
				InputSource xml = new InputSource(in);
				
				return wczytajWaluteZXml(xml);
			}
		} catch (Exception e) {
			throw new ProblemZPobieraniem("Problem z pobieraniem", e);
		}
	}


	private static BigDecimal wczytajWaluteZXml(InputSource xml) throws XPathException {
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpath = xpf.newXPath();
		
		String wynik = xpath. evaluate("/ExchangeRatesSeries/Rates/Rate/Mid", xml);
		return new BigDecimal(wynik);
	}
	

}
