package claseUno;

public class ClaseUno {
	public static void main(String[] args) {
		Pasajero paxA = new Pasajero(1.0, 10.0);
		Pasajero paxB = new Pasajero(0.99, 20.0);
		EmpleadoDespegar empleado = new EmpleadoDespegar();
		Cliente cliente1 = new Cliente("Facu", paxA);
		Cliente cliente2 = new Cliente("Juan", paxB);
		Cliente cliente3 = new Cliente("Lucio", empleado);
		CalculadorDePrecio calculador = new CalculadorDePrecio();
		System.out.println("Precio para " + cliente1.getNombre() + ": " + calculador.calcularPrecio(cliente1, 10.0));
		System.out.println("Precio para " + cliente2.getNombre() + ": " + calculador.calcularPrecio(cliente2, 10.0));
		System.out.println("Precio para " + cliente3.getNombre() + ": " + calculador.calcularPrecio(cliente3, 100.0));
	}
}
