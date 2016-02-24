package Infierno;

public class DemonioDeFuego extends Demonio {
	public boolean condicionPuedeCazarAlma(Alma unAlma) {
		return !unAlma.getEsFriolenta();
	}
	
	public void atormentarAlma(Alma unAlma) {
		unAlma.cambiarEstadoFriolento();
		super.atormentarAlma(unAlma);
	}
}
