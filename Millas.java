public class Millas {
	
		public static void main (String[] args) {

			double millas = 1.387;
			final double MILLAS_POR_KILOMETRO = 1.609; //Se escribe final porque es una constante que no queremos que sea modificada
			double kilometros = millas * MILLAS_POR_KILOMETRO;
				
				System.out.println ("Las millas son: " +millas + ", las millas por kilometro son: " +
					MILLAS_POR_KILOMETRO + " y los kilómetros son: " +kilometros);
		}
}
