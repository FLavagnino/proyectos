package diaUno;

import org.slf4j.LoggerFactory;

import clientesYPaquetes.Individuo;
import clientesYPaquetes.Paquete;
import clientesYPaquetes.PaqueteTipoPrecioFijo;
import clientesYPaquetes.PaqueteTipoPrecioXBaseSaldo;
import clientesYPaquetes.PaqueteTipoPrecioXHabitacion;

public class DiaUno {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DiaUno.class);
	public static void main (String[] args) {
		Individuo individuo1 = new Individuo("Juan", 2000.0);
		PaqueteTipoPrecioXHabitacion tipoPrecioXHabitacion1 = new PaqueteTipoPrecioXHabitacion(2.0, 50.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo1 = new PaqueteTipoPrecioFijo(500.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo2 = new PaqueteTipoPrecioFijo(100.0);
		PaqueteTipoPrecioFijo tipoPrecioFijo3 = new PaqueteTipoPrecioFijo(3000.0);
		PaqueteTipoPrecioXBaseSaldo tipoPrecioXBaseSaldo1 = new PaqueteTipoPrecioXBaseSaldo();
		Paquete paquete1 = new Paquete(tipoPrecioFijo1, 0.25);
		Paquete paquete2 = new Paquete(tipoPrecioFijo2, 0.1);
		Paquete paquete3 = new Paquete(tipoPrecioXBaseSaldo1, 0.3);
		Paquete paqueteMardel = new Paquete(tipoPrecioXHabitacion1, 0.2);
		/* Ejercicio 1: Prueba 1 */
		LOGGER.info("Saldo de Juan antes de comprar paquete: " + individuo1.getSaldo());
		individuo1.comprarPaquete(paquete1);
		individuo1.setSaldo(2000.0);
		LOGGER.info("Saldo de Juan antes de comprar paquete: " + individuo1.getSaldo());
		individuo1.comprarPaquete(paquete2);
		/* Ejercicio 1: Prueba 2 con 2 habitaciones de $50 */
		LOGGER.info("Prueba 2.2; Precio del paquete mardel: " + paqueteMardel.precio());
		/* Ejercicio 1: Prueba 2 con precio base fijo $200 */
		paqueteMardel.setTipo(tipoPrecioFijo3);
		LOGGER.info("Prueba 2.2; Precio del paquete mardel: " + paqueteMardel.precio());
		/* Ejercicio 1: Prueba 3 */
		individuo1.setSaldo(2000.0);
		LOGGER.info("Saldo de Juan antes de comprar paquete: " + individuo1.getSaldo());
		individuo1.comprarPaquete(paquete3);
	}
}