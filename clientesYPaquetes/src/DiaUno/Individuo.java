package DiaUno;

import java.util.ArrayList;

public class Individuo extends Cliente{
	private ArrayList<Paquete> paquetesReservados = new ArrayList<Paquete>();
	
	public Individuo(String unNombre, Double unSaldo) {
		super(unNombre, unSaldo);
	}

	public void reservarPaquete(Paquete unPaquete) {
		paquetesReservados.add(unPaquete);
		setSaldo(getSaldo() - 0.5 * unPaquete.precio(getSaldo()));
	}
	
//	public void comprarPaquete(Paquete unPaquete) {
//		if(paquetesReservados.contains(unPaquete)) {
//			agregarPaqueteComprado(unPaquete);
//			pagar(0.5 * unPaquete.precio(getSaldo()));
//			setPaqueteCompradoMasCaro(unPaquete);
//		} else {
//			super.comprarPaquete(unPaquete);
//		}
//	}
	
	public void comprarPaqueteReservado(Paquete unPaquete) {
		paquetesReservados.remove(unPaquete);
		agregarPaqueteComprado(unPaquete);
		pagar(0.5 * unPaquete.precio(getSaldo()));
		setPaqueteCompradoMasCaro(unPaquete);
	}
	
	public ArrayList<Paquete> getPaquetesReservados() {
		return paquetesReservados;
	}
}
