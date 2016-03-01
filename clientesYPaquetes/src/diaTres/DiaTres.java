package diaTres;

import java.util.ArrayList;
import org.slf4j.LoggerFactory;

import clientesYPaquetes.Individuo;
import clientesYPaquetes.Paquete;
import clientesYPaquetes.PaqueteTipoPrecioFijo;

public class DiaTres {
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DiaTres.class);
	public static void main (String[] args) {
		Individuo individuo1 = new Individuo("Juan", 2000.0);
		LOGGER.info("Se crea un cliente");
		PaqueteTipoPrecioFijo tipoPrecioFijo3 = new PaqueteTipoPrecioFijo(3000.0);
		Paquete paquete4 = new Paquete(tipoPrecioFijo3, 0.1);
		LOGGER.info("Se crea un nuevo paquete");
		ArrayList<Paquete> paquetes1 = new ArrayList<Paquete>();
		
		/* Ejercicio 3: Punto 1 y Punto 3 */
		System.out.println("Punto 1");
		individuo1.setSaldo(2000.0);
		LOGGER.debug("Saldo del cliente 2000");
		individuo1.comprarPaquete(paquete4);
		LOGGER.info("El cliente compra el paquete");
		System.out.println("\n");
		
		/* Ejercicio 3: Punto 2 */
		System.out.println("Punto 2");
		individuo1.comprarPaquete(paquetes1);
	}
}
