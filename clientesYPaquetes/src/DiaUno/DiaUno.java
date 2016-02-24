package DiaUno;

import java.util.ArrayList;

public class DiaUno {
	public static void main (String[] args) {
		Individuo individuo1 = new Individuo("Juan", 2000.0);
		Empresa empresa1 = new Empresa("Despegando", 40000.0);
		PaqueteTipoPrecioXHabitacion tipoPrecioXHabitacion1 = new PaqueteTipoPrecioXHabitacion(2.0, 50.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo1 = new PaqueteTipoPrecioFijo(500.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo2 = new PaqueteTipoPrecioFijo(100.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo3 = new PaqueteTipoPrecioFijo(200.0);
		PaqueteTipoPrecioXBaseSaldo tipoPrecioXBaseSaldo1 = new PaqueteTipoPrecioXBaseSaldo();
		Paquete paquete1 = new Paquete(tipoPrecioFijo1, 0.25);
		Paquete paquete2 = new Paquete(tipoPrecioFijo2, 0.1);
		Paquete paquete3 = new Paquete(tipoPrecioXBaseSaldo1, 0.3);
		Paquete paqueteMardel = new Paquete(tipoPrecioXHabitacion1, 0.2);
		ArrayList<Paquete> paquetes1 = new ArrayList<Paquete>();
		/* Ejercicio 1: Prueba 1 */
		System.out.println("Saldo de Juan antes de comprar paquete: " + individuo1.getSaldo());
		individuo1.comprarPaquete(paquete1);
		System.out.println("Prueba 2.1; Saldo de Juan: " + individuo1.getSaldo());
		individuo1.setSaldo(2000.0);
		System.out.println("Saldo de Juan antes de comprar paquete: " + individuo1.getSaldo());
		individuo1.comprarPaquete(paquete2);
		System.out.println("Prueba 2.1; Saldo de Juan: " + individuo1.getSaldo() + "\n");
		/* Ejercicio 1: Prueba 2 con 2 habitaciones de $50 */
		System.out.println("Prueba 2.2; Precio del paquete mardel: " + paqueteMardel.precio());
		/* Ejercicio 1: Prueba 2 con precio base fijo $200 */
		paqueteMardel.setTipo(tipoPrecioFijo3);
		System.out.println("Prueba 2.2; Precio del paquete mardel: " + paqueteMardel.precio() + "\n");
		/* Ejercicio 1: Prueba 3 */
		individuo1.setSaldo(2000.0);
		System.out.println("Saldo de Juan antes de comprar paquete: " + individuo1.getSaldo());
		individuo1.comprarPaquete(paquete3);
		System.out.println("Prueba 2.3; Saldo de Juan: " + individuo1.getSaldo() + "\n");
		
		/* Ejercicio 2: Punto 1 Prueba 1 */
		individuo1.vaciarListaPaquetesComprados();
		individuo1.setGastoTotal(0.0);
		paqueteMardel.setTipo(tipoPrecioXHabitacion1);
		individuo1.comprarPaquete(paquete1);
		individuo1.comprarPaquete(paqueteMardel);
		System.out.println("Gasto total de Juan: " + individuo1.getGastoTotal());
		System.out.println("Cantidad de paquetes comprados por Juan: " + individuo1.cantidadPaquetesComprados() + " \n");
		/* Ejercicio 2: Punto 2 */
		System.out.println("Paquete comprado mas caro" + individuo1.getPaqueteCompradoMasCaro() + " \n");
		/* Ejercicio 2: Punto 3 Prueba 1 */
		paquetes1.add(paquete2);
		paquetes1.add(paquete3);
		paquetes1.add(paqueteMardel);
		System.out.println("Saldo empresa despegando: " + empresa1.getSaldo());
		empresa1.comprarPaquete(paquetes1);
		System.out.println("Saldo empresa despegando: " + empresa1.getSaldo() + " \n");
		/* Ejercicio 2: Punto 3 Prueba 2 */
//		public void mostrarPaquetes(ArrayList<Paquete> unosPaquetes) {
//			for(Paquete unPaquete : unosPaquetes) {
//				System.out.println(unPaquete);
//		}
		
		individuo1.setSaldo(2000.0);
		System.out.println("Saldo de Juan: " + individuo1.getSaldo());
		individuo1.reservarPaquete(paqueteMardel);
		System.out.println("Saldo de Juan luego de reservar paqueteMardel: " + individuo1.getSaldo());
		System.out.println("Paquetes reservados por Juan:");
//		mostrarPaquetes(individuo1.getPaquetesReservados());
		
		/* Ejercicio 2: Punto 3 Prueba 3 */
		individuo1.comprarPaqueteReservado(paqueteMardel);
		System.out.println("Saldo de Juan luego comprar reservar paqueteMardel: " + individuo1.getSaldo());
	}
}