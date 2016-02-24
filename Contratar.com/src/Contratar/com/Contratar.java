package Contratar.com;

import java.util.ArrayList;
import java.util.List;

public class Contratar {
	public static void main(String[] args) {
		Empresa empresaA = new Empresa(8000.0, 15);
		Empresa empresaB = new Empresa(10000.0, 20);
		Empresa empresaC = new Empresa(9500.0, 40);
		Empresa empresaD = new Empresa(5000.0, 12);
		Senior senior = Senior.getInstance();
		Usuario usuario = new Usuario(10000.0, senior, 1);
		System.out.println("Sueldo actual de Senior: " + usuario.getSueldoActual());
		System.out.println("Sueldo actual de Senior: " + usuario.getCategoria().sueldoPromedio(empresaA, usuario));
		/* Ahora el usuario pasa de senior a gerente */
		Gerente gerente = Gerente.getInstance();
		usuario.setCategoria(gerente);
		System.out.println("Sueldo actual de Gerente: " + usuario.getSueldoActual());
		System.out.println("Sueldo actual de Gerente: " + usuario.getCategoria().sueldoPromedio(empresaA, usuario));
		
		/* Implemento Lista de empresas */
		List<Empresa> listaEmpresas = new ArrayList<Empresa>();
		usuario.setListaEmpresas(listaEmpresas);
		usuario.cambiarTrabajo(8000.0, empresaA);
		usuario.cambiarTrabajo(10000.0, empresaB);
		usuario.cambiarTrabajo(9500.0, empresaC);
		usuario.cambiarTrabajo(8000.0, empresaA);
		usuario.cambiarTrabajo(10000.0, empresaD);
		
		for(Empresa empresa : usuario.getListaEmpresas()) {
			System.out.println("Empresa: " + empresa);
		}
	}
}
