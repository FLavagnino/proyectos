
public class Neflis {
	public static void main(String[] args) {
		Repositorio repositorio = new Repositorio();
		Usuario usuario1 = new Usuario("Jose");
		Pelicula pelicula1 = new Pelicula("Loca", 120.0, "Locura");
		Pelicula pelicula2 = new Pelicula("Piratas", 180.0, "Aventura");
		Pelicula pelicula3 = new Pelicula("Epica", 110.0, "Comedia");
		Serie serie1 = new Serie("Prision", "Accion");
		Temporada temporada11 = new Temporada("T1");
		Temporada temporada12 = new Temporada("T2");
		Capitulo capitulo111 = new Capitulo("T1 C1", 50.0);
		Capitulo capitulo112 = new Capitulo("T1 C2", 50.0);
		Capitulo capitulo113 = new Capitulo("T1 C3", 50.0);
		Capitulo capitulo121 = new Capitulo("T2 C1", 50.0);
		Capitulo capitulo122 = new Capitulo("T2 C2", 50.0);
		Capitulo capitulo123 = new Capitulo("T2 C3", 50.0);
		String actor1 = "Richard";
		repositorio.agregarContenido(serie1);
		repositorio.agregarContenido(pelicula1);
		repositorio.agregarContenido(pelicula2);
		repositorio.agregarContenido(pelicula3);
		repositorio.agregarContenido(capitulo111);
		repositorio.agregarContenido(capitulo112);
		repositorio.agregarContenido(capitulo113);
		repositorio.agregarContenido(capitulo121);
		repositorio.agregarContenido(capitulo122);
		repositorio.agregarContenido(capitulo123);
		repositorio.agregarDestacado(pelicula1);
		repositorio.agregarDestacado(pelicula2);
		repositorio.agregarDestacado(pelicula3);
		serie1.agregarTemporada(temporada11);
		serie1.agregarTemporada(temporada12);
		temporada11.agragarCapitulo(capitulo111);
		temporada11.agragarCapitulo(capitulo112);
		temporada11.agragarCapitulo(capitulo113);
		temporada12.agragarCapitulo(capitulo121);
		temporada12.agragarCapitulo(capitulo122);
		temporada12.agragarCapitulo(capitulo123);
		pelicula1.setActor("Ruperh");
		pelicula2.setActor("Richard");
		pelicula3.setActor("Richard");

		usuario1.verContenido(pelicula1);
		usuario1.verContenido(pelicula2);
		usuario1.verContenido(capitulo111);
		usuario1.verContenido(capitulo112);
		usuario1.verContenido(capitulo113);
		usuario1.verContenido(capitulo121);
//		usuario1.verContenido(capitulo122);
		usuario1.verContenido(capitulo123);
		/*Punto 1*/
		System.out.println("Punto 1");
		System.out.println(usuario1.vio(pelicula1));
		System.out.println(usuario1.vio(pelicula2));
		System.out.println(usuario1.vio(pelicula3));
		System.out.println(usuario1.vio(serie1) + "\n");
		/*Punto 2*/
		System.out.println("Punto 2");
		System.out.println(pelicula1.getDuracion());
		System.out.println(pelicula2.getDuracion());
		System.out.println(pelicula3.getDuracion());
		System.out.println(serie1.getDuracion() + "\n");
		/*Punto 3*/
		System.out.println("Punto 3");
		System.out.println(serie1.getUltimoCapitulo().getNombre() + "\n");
		/*Punto 4.a*/
		System.out.println("Punto 4.a");
		for(String genero : usuario1.generosVistos()) {
			System.out.println(genero);
		}
		System.out.println("\n");
		/*Punto 4.b*/
		System.out.println("Punto 4.b");
		System.out.println(usuario1.generoPreferido() + "\n");
		/*Punto 5.a*/
		System.out.println("Punto 5.a");
		System.out.println(pelicula1.actuoActor(actor1));
		System.out.println(pelicula2.actuoActor(actor1));
		System.out.println(pelicula3.actuoActor(actor1) + "\n");
		/*Punto 5.b
		 * controlar*/
		System.out.println("Punto 5.a");
		System.out.println(usuario1.esFanDe(actor1) + "\n");
		/*Punto 6*/
		System.out.println("Punto 6");
//		for(Contenido contenido : repositorio.recomendarContenidoA(usuario1)) {
//			System.out.println(contenido.getNombre());
//		}
		System.out.println(capitulo111.getSerie());
	}
}
