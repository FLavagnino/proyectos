package Infierno;

public class LugarInfierno extends Lugar{
	private static String nombre = "Infierno";
	private static LugarInfierno instance;

	protected LugarInfierno() {}
	public static LugarInfierno getInstance() {
		if (instance == null){
			instance = new LugarInfierno();
		}
		return instance;
	}
	
	public String getNombre() {
		return nombre;
	}
}
