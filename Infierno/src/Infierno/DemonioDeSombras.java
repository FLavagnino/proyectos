package Infierno;

public class DemonioDeSombras extends Demonio {
	private static Double limiteNivelDeValor = 50.0;
	
	public boolean condicionPuedeCazarAlma(Alma unAlma) {
		return (unAlma.getNivelDeValor() < limiteNivelDeValor);
	}
	
	public void atormentarAlma(Alma unAlma) {
		unAlma.restarNivelDeValor(unAlma.getNivelDeValor() / 2);
		super.atormentarAlma(unAlma);
	}
}
