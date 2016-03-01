package clientesYPaquetes;

import java.util.ArrayList;
import org.slf4j.LoggerFactory;

public class Empresa extends Cliente{
	public final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Empresa.class);

	public Empresa(String unNombre, Double unSaldo) {
		super(unNombre, unSaldo);
	}

	public void comprarPaquete(ArrayList<Paquete> unosPaquetes) {
		for(Paquete unPaquete : unosPaquetes) {
			super.comprarPaquete(unPaquete);
		}
	}
}
