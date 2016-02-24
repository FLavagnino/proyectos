package Contratar.com;

import java.util.List;

public class Usuario {
	private Empresa empresa;
	private Double sueldoActual;
	private Categoria categoria;
	private int aniosExp;
	private List<Empresa> listaEmpresas;
	
	public Usuario(Double sueldoActual, Categoria categoria, int aniosExp) {
		this.sueldoActual = sueldoActual;
		this.categoria = categoria;
		this.aniosExp = aniosExp;
	}
	public Usuario(Empresa empresa, List<Empresa> listaEmpresas, Double sueldoActual, Categoria categoria, int aniosExp) {
		this.empresa = empresa;
		this.listaEmpresas = listaEmpresas;
		this.sueldoActual = sueldoActual;
		this.categoria = categoria;
		this.aniosExp = aniosExp;
	}
	
	/* seters y geters */
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Double getSueldoActual() {
		return sueldoActual;
	}
	public void setSueldoActual(Double sueldoActual) {
		this.sueldoActual = sueldoActual;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getAniosExp() {
		return aniosExp;
	}
	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}
	
	public List<Empresa> getListaEmpresas() {
		return this.listaEmpresas;
	}
	
	/* metodos */
	public Double sueldoEsperado(Empresa unaEmpresa) {
		return categoria.sueldoPromedio(unaEmpresa, this);
	}
	
	public void escucharOferta(Double unSueldo, Empresa unaEmpresa) {
		if (unSueldo >= this.sueldoEsperado(unaEmpresa)) {
			this.cambiarTrabajo(unSueldo, unaEmpresa);
		}
	}
	
	public void cambiarTrabajo(Double unSueldo, Empresa unaEmpresa) {
		this.setSueldoActual(unSueldo);
		this.setEmpresa(unaEmpresa);
		this.listaEmpresas.add(unaEmpresa);
	}
}
