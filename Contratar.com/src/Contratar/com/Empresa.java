package Contratar.com;

public class Empresa {
	private Double sueldoBase;
	private int cantidadEmpleados;
	
	public Empresa(Double sueldoBase, int cantidadEmpleados) {
		this.sueldoBase = sueldoBase;
		this.cantidadEmpleados = cantidadEmpleados;
	}
	
	/* seters y geters */
	public Double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
	
}
