package clientesYPaquetes;

import java.util.ArrayList;

public class Empresa extends Cliente{

	public Empresa(String unNombre, Double unSaldo) {
		super(unNombre, unSaldo);
	}

	public void comprarPaquete(ArrayList<Paquete> unosPaquetes) {
		for(Paquete unPaquete : unosPaquetes) {
			super.comprarPaquete(unPaquete);
		}
	}
}
