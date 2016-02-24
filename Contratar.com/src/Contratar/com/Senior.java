package Contratar.com;

public class Senior implements Categoria {
	private static Senior instance;
	private Senior() {}
	
	public static Senior getInstance() {
		if (instance == null){
			instance = new Senior();
		}
		return instance;
	}
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsuario) {
		return unUsuario.getSueldoActual() * 2;
	}
}
