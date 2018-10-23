/************************************
 * Clase Unidades, que nos sirve    *
 * para convertir distintos tipos   *
 * de unidades					    *
 * @author Juan Carlos			    *
 * @version 1.0					    *
 * **********************************/

public class Unidades {

	/** Constante para convertir unidades */
	public static final double LIBRAS_KILOGRAMOS = 0.45;
	static final double PIES_METROS       = 0.30;
	static final double YARDAS_METROS     = 0.91;
	static final double MILLAS_METROS     = 1609.34;
	static final double ACRES_HECTAREAS   = 0.40;
	static final double ONZAS_MILILITROS  = 29.57;
	static final double GALONES_LITROS    = 3.78;

	public static void main (String[] args) {

		convertirLibrasKilogramos ( (double) 100.0 );
		convertirPiesMetros       ( (double) 10.0 );
		convertirYardasMetros     ( (double) 1.0 );
		convertirMillasMetros     ( (double) 100.0 );
		convertirAcresHectareas   ( (double) 100.0 );
		convertirOnzasMililitros  ( (double) 10.0 );
		convertirGalonesLitros    ( (double) 1.0 );

	}
	/** @param libras a convertir */
	public static void convertirLibrasKilogramos (double libras) {
		/** @return Operación para convertir a kilogramos */
		double kilogramos = libras * LIBRAS_KILOGRAMOS;
			System.out.println (libras + "lb " + "son " + kilogramos + "kg");
	}

	public static void convertirPiesMetros (double pies) {
		double metros = pies * PIES_METROS;
			System.out.println (pies + "f " + "son " + metros + "m");
	}

	public static void convertirYardasMetros (double yardas) {
		double metros = yardas * YARDAS_METROS;
			System.out.println (yardas + "yd " + "son " + metros + "m");
	}

	public static void convertirMillasMetros (double millas) {
		double metros = millas * MILLAS_METROS;
			System.out.println (millas + "mi " + "son " + metros + "m");
	}

	public static void convertirAcresHectareas (double acres) {
		double hectareas = acres * ACRES_HECTAREAS;
			System.out.println (acres + "a " + "son " + hectareas + "ha");
	}
	
	public static void convertirOnzasMililitros (double onzas) {
		double mililitros = onzas * ONZAS_MILILITROS;
			System.out.println (onzas + "oz " + "son " + mililitros + "ml");
	}
	
	public static void convertirGalonesLitros (double galones) {
		double litros = galones * GALONES_LITROS;
			System.out.println (galones + "gal " + "son " + litros + "l");
	}

}
