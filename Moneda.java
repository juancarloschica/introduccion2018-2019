/** @author Juan Carlos
 * @version 1.0
 */

public class Moneda {

	static final double DOLARES_EUROS = 0.86;
	static final double EUROS_DOLARES = 1.16;

	public static void main (String[] args) {

		convertirDolaresEuros ( (double) 1.0 );
		convertirEurosDolares ( (double) 10.0 );

	}

	private static void convertirDolaresEuros (double dolares) {
		double euros = dolares * DOLARES_EUROS;
			System.out.println (dolares + "$ " + "son " + euros + "€");
	}

	private static void convertirEurosDolares (double euros) {
		double dolares = euros * EUROS_DOLARES;
			System.out.println (euros + "€ " + "son " + dolares + "$");
	}

}
