
public class Neflis {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Jose");
		Pelicula pelicula1 = new Pelicula("Loca", 120.0);
		Pelicula pelicula2 = new Pelicula("Piratas", 140.0);
		Pelicula pelicula3 = new Pelicula("Cavernas", 130.0);
		Serie serie1 = new Serie("Prision");
		Temporada temporada11 = new Temporada("T1");
		Temporada temporada12 = new Temporada("T2");
		Capitulo capitulo111 = new Capitulo("T1 C1", 50.0);
		Capitulo capitulo112 = new Capitulo("T1 C2", 50.0);
		Capitulo capitulo113 = new Capitulo("T1 C3", 50.0);
		Capitulo capitulo121 = new Capitulo("T2 C1", 50.0);
		Capitulo capitulo122 = new Capitulo("T2 C2", 50.0);
		Capitulo capitulo123 = new Capitulo("T2 C3", 50.0);
		serie1.agregarTemporada(temporada11);
		serie1.agregarTemporada(temporada12);
		temporada11.agragarCapitulo(capitulo111);
		temporada11.agragarCapitulo(capitulo112);
		temporada11.agragarCapitulo(capitulo113);
		temporada12.agragarCapitulo(capitulo121);
		temporada12.agragarCapitulo(capitulo122);
		temporada12.agragarCapitulo(capitulo123);
		 /*Punto 1*/
		usuario1.verPelicula(pelicula1);
		usuario1.verPelicula(pelicula2);
		usuario1.verCapitulo(capitulo111);
		usuario1.verCapitulo(capitulo112);
		usuario1.verCapitulo(capitulo113);
		usuario1.verCapitulo(capitulo121);
		usuario1.verCapitulo(capitulo122);
		usuario1.verCapitulo(capitulo123);
		System.out.println("Jose vio pelicula 1: " + usuario1.vioPelicula(pelicula1));
		System.out.println("Jose vio pelicula 2: " + usuario1.vioPelicula(pelicula2));
		System.out.println("Jose vio pelicula 3: " + usuario1.vioPelicula(pelicula3));
		System.out.println("Jose vio Serie 1: " + usuario1.vioSerie(serie1) + "\n");
		/*Punto 2*/
		System.out.println("Duracion pelicula 1: " + pelicula1.getDuracion());
		System.out.println("Duracion pelicula 2: " + pelicula2.getDuracion());
		System.out.println("Duracion pelicula 3: " + pelicula3.getDuracion());
		System.out.println("Duracion serie 1: " + serie1.getDuracion() + "\n");
		/*Punto 3*/
		
	}
}
