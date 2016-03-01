package diaDos;

import java.util.ArrayList;
import org.slf4j.LoggerFactory;

import clientesYPaquetes.Empresa;
import clientesYPaquetes.Individuo;
import clientesYPaquetes.Paquete;
import clientesYPaquetes.PaqueteTipoPrecioFijo;
import clientesYPaquetes.PaqueteTipoPrecioXBaseSaldo;
import clientesYPaquetes.PaqueteTipoPrecioXHabitacion;

public class DiaDos {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DiaDos.class);
	public static void main (String[] args) {
		Individuo individuo1 = new Individuo("Juan", 2000.0);
		Empresa empresa1 = new Empresa("Despegando", 40000.0);
		PaqueteTipoPrecioXHabitacion tipoPrecioXHabitacion1 = new PaqueteTipoPrecioXHabitacion(2.0, 50.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo1 = new PaqueteTipoPrecioFijo(500.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo2 = new PaqueteTipoPrecioFijo(100.0);
		PaqueteTipoPrecioXBaseSaldo tipoPrecioXBaseSaldo1 = new PaqueteTipoPrecioXBaseSaldo();
		Paquete paquete1 = new Paquete(tipoPrecioFijo1, 0.25);
		Paquete paquete2 = new Paquete(tipoPrecioFijo2, 0.1);
		Paquete paquete3 = new Paquete(tipoPrecioXBaseSaldo1, 0.3);
		Paquete paqueteMardel = new Paquete(tipoPrecioXHabitacion1, 0.2);
		ArrayList<Paquete> paquetes1 = new ArrayList<Paquete>();
		
		/* Ejercicio 2: Punto 1 Prueba 1 */
		System.out.println("Punto 1");
		individuo1.comprarPaquete(paquete1);
		individuo1.comprarPaquete(paqueteMardel);
		LOGGER.info("Gasto total de Juan: " + individuo1.getGastoTotal());
		LOGGER.info("Cantidad de paquetes comprados por Juan: " + individuo1.cantidadPaquetesComprados());
		/* Ejercicio 2: Punto 2 */
		System.out.println("Punto 2");
		LOGGER.info("Paquete comprado mas caro: " + individuo1.getPaqueteCompradoMasCaro());
		/* Ejercicio 2: Punto 3 Prueba 1 */
		System.out.println("Punto 3 Prueba 1");
		paquetes1.add(paquete2);
		paquetes1.add(paquete3);
		paquetes1.add(paqueteMardel);
		LOGGER.info("Saldo empresa despegando: " + empresa1.getSaldo());
		empresa1.comprarPaquete(paquetes1);
		/* Ejercicio 2: Punto 3 Prueba 2 */
		System.out.println("Punto 3 Prueba 2");
		individuo1.setSaldo(2000.0);
		LOGGER.info("Saldo de Juan: " + individuo1.getSaldo());
		individuo1.reservarPaquete(paqueteMardel);
		LOGGER.info("Saldo de Juan luego de reservar paqueteMardel: " + individuo1.getSaldo());
		LOGGER.info("Cantidad de paquetes reservados por Juan: " + individuo1.getPaquetesReservados().size());
		/* Ejercicio 2: Punto 3 Prueba 3 */
		System.out.println("Punto 3 Prueba 3");
		LOGGER.info("Saldo de Juan antes de comprar reserva: " + individuo1.getSaldo());
		individuo1.comprarPaqueteReservado(paqueteMardel);
		LOGGER.info("Cantidad de paquetes reservados: " + individuo1.getPaquetesReservados().size());
		
	}
}
