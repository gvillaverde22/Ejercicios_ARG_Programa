package programitas_1;

public class Programas_1B {
	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		
		System.out.println("LISTA DE NUMEROS:");
		
		while (numeroInicio >=5 && numeroFin <=14) {
			
			numeroInicio++;
			if ((numeroInicio % 2) == 0)
				System.out.println(numeroInicio);
				
			if (numeroInicio > numeroFin)
				numeroFin++;
			
		}
	}
}
