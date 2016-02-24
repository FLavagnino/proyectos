package Contratar.com;

public class Trainee {
	private static Trainee instance;
	private Trainee() {}
	
	public static Trainee getInstance() {
		if (instance == null){
			instance = new Trainee();
		}
		return instance;
	}
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsuario) {
		return unaEmpresa.getSueldoBase();
	}
}
