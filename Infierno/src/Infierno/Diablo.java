package Infierno;

public class Diablo {
	public static void main(String[] args) {
		DemonioDeSombras demonioDeSombras1 = new DemonioDeSombras();
		DemonioDeFuego demonioDeFuego1 = new DemonioDeFuego();
		DemonioDeHielo demonioDeHielo1 = new DemonioDeHielo();
		demonioDeSombras1.setNivelDeMaldad(30.0);
		demonioDeFuego1.setNivelDeMaldad(20.0);
		demonioDeHielo1.setNivelDeMaldad(10.0);
		Lugar lugar1 = new Lugar("Roma");
		LugarInfierno infierno = LugarInfierno.getInstance();
		Alma alma1 = new Alma("Pepe", 40.0, 20.0, true, lugar1);
		Alma alma2 = new Alma("Jose", 20.0, 10.0, true, lugar1);
		Alma alma3 = new Alma("Hugo", 10.0, 20.0, true, lugar1);
		Alma alma4 = new Alma("Juan", 20.0, 10.0, false, lugar1);
		Alma alma5 = new Alma("Marta", 10.0, 20.0, false, lugar1);
		/* Punto 1 */
		System.out.println("Demonio de Sombras puede cazar un alma friolenta con 10 de bondad y 10 de valor: " + demonioDeSombras1.almaEsCazable(alma1));
		System.out.println("Demonio de Fuego puede cazar un alma friolenta con 10 de bondad y 10 de valor: " + demonioDeFuego1.almaEsCazable(alma1));
		System.out.println("Demonio de Hielo puede cazar un alma friolenta con 10 de bondad y 10 de valor: " + demonioDeHielo1.almaEsCazable(alma1) + "\n");
		/* Punto 2 */
		System.out.println("Nivel de bondad alma: " + alma1.getNivelDeBondad());
		System.out.println("Nivel de maldad demonio: " + demonioDeSombras1.getNivelDeMaldad());
		System.out.println("Cantidad almas jodidas: " + demonioDeSombras1.cantidadDeAlmasJodidas());
		demonioDeSombras1.atormentarAlma(alma1);
		System.out.println("Nivel de bondad alma: " + alma1.getNivelDeBondad());
		System.out.println("Nivel de maldad demonio: " + demonioDeSombras1.getNivelDeMaldad());
		System.out.println("Cantidad almas jodidas: " + demonioDeSombras1.cantidadDeAlmasJodidas());
		System.out.println("Habita: " + alma1.getLugarQueHabita().getNombre() + "\n");
		/* Punto 3 */
		for(Alma unAlma : lugar1.almasCazablesPor(demonioDeSombras1)) {
			System.out.println("Alma que puede cazar: " + unAlma.getNombre());
		}
		System.out.println("");
		/* Punto 4 */
		lugar1.mostrarHabitantes();
		demonioDeSombras1.cazarEn(lugar1);
		lugar1.mostrarHabitantes();

	}
}
