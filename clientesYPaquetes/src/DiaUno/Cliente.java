package DiaUno;

import java.util.ArrayList;

public abstract class Cliente {
	private String nombre;
	private Double saldo;
	private ArrayList<Paquete> paquetesComprados = new ArrayList<Paquete>();
	private Double gastoTotal = 0.0;
	private Paquete paqueteCompradoMasCaro;
	
	public Cliente(String unNombre, Double unSaldo) {
		nombre = unNombre;
		saldo = unSaldo;
	}
	
	public void setSaldo(Double unSaldo) {
		saldo = unSaldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPaqueteCompradoMasCaro(Paquete unPaquete){
		if(paqueteCompradoMasCaro == null) {
			paqueteCompradoMasCaro = unPaquete;
		} else {
			if(unPaquete.precio(saldo) > paqueteCompradoMasCaro.precio(saldo)) {
				paqueteCompradoMasCaro = unPaquete;
			}
		}
	}
	
	public void pagar(Double unMonto){
		gastoTotal += unMonto;
		saldo -= unMonto;
	}
	
	public void agregarPaqueteComprado(Paquete unPaquete) {
		paquetesComprados.add(unPaquete);
	}
	
	public void comprarPaquete(Paquete unPaquete) {
		agregarPaqueteComprado(unPaquete);
		pagar(unPaquete.precio(saldo));
		setPaqueteCompradoMasCaro(unPaquete);
	}
	
	public int cantidadPaquetesComprados() {
		return paquetesComprados.size();
	}
	
	public Double getGastoTotal() {
		return gastoTotal;
	}
	
	/* Metodo solo para testeo*/
	public void vaciarListaPaquetesComprados() {
		paquetesComprados.clear();
	}
	
	/* Metodo solo para testeo*/
	public void setGastoTotal(Double gastoTotal) {
		this.gastoTotal = gastoTotal;
	}
	
	public Paquete getPaqueteCompradoMasCaro() {
		return paqueteCompradoMasCaro;
	}
}
