public class TestUnidades {

	public static void main (String[] args) {
	
		double libras = 10.0;
		double kilogramos = Unidades.convertirLibrasKilogramos (double libras);
			
			System.out.println (libras + "lb son" + kilogramos + " kg");
	}
}
