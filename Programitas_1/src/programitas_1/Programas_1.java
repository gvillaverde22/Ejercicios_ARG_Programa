package programitas_1;

public class Programas_1 {
	 
	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		
		System.out.println("LISTA DE NUMEROS:");
		
		while (numeroInicio >=5 && numeroFin <=14) {
			
			System.out.println(numeroInicio);
			numeroInicio++;
			
			if (numeroInicio > numeroFin)
				numeroFin++;
			
		}
	}
}

