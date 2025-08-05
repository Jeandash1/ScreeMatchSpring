package com.aluracursos.ScreeMatchSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aluracursos.ScreeMatchSpring.Main.Principal;


@SpringBootApplication
public class ScreeMatchSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreeMatchSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.mostrarMenu();
		
		/*var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.getDatos("https://www.omdbapi.com/?t=Game%20of%20Thrones&apikey=3e86dbca");
		ConvertirDatos conversion = new ConvertirDatos();
		var datos = conversion.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);

		json = consumoAPI.getDatos("https://www.omdbapi.com/?t=Game%20of%20Thrones&Season=1&episode=1&apikey=3e86dbca");
		DatosEpisodio episodio = conversion.obtenerDatos(json, DatosEpisodio.class);
		System.out.println(episodio);
		*/
	}
}
