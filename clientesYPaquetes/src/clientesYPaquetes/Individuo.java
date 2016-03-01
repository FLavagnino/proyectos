package clientesYPaquetes;

import java.util.ArrayList;

import org.slf4j.LoggerFactory;
import java.lang.IllegalArgumentException;

public class Individuo extends Cliente{
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Individuo.class);
	private ArrayList<Paquete> paquetesReservados = new ArrayList<Paquete>();
	
	public Individuo(String unNombre, Double unSaldo) {
		super(unNombre, unSaldo);
	}

	public void reservarPaquete(Paquete unPaquete) {
		paquetesReservados.add(unPaquete);
		setSaldo(getSaldo() - 0.5 * unPaquete.precio(getSaldo()));
	}
	
	public void comprarPaquete(Paquete unPaquete) {
		if(paquetesReservados.contains(unPaquete)) {
			agregarPaqueteComprado(unPaquete);
			pagar(0.5 * unPaquete.precio(getSaldo()));
			setPaqueteCompradoMasCaro(unPaquete);
		} else {
			super.comprarPaquete(unPaquete);
		}
	}
	
	public void comprarPaqueteReservado(Paquete unPaquete) {
		paquetesReservados.remove(unPaquete);
		agregarPaqueteComprado(unPaquete);
		pagar(0.5 * unPaquete.precio(getSaldo()));
		setPaqueteCompradoMasCaro(unPaquete);
	}
	
	public ArrayList<Paquete> getPaquetesReservados() {
		return paquetesReservados;
	}
	
	public void comprarPaquete(ArrayList<Paquete> unosPaquetes) throws IllegalArgumentException {
		throw new IllegalArgumentException("No puede comprar mas de un paquete a la vez");
	}
}
