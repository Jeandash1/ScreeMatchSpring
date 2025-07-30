package com.aluracursos.ScreeMatchSpring;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.aluracursos.ScreeMatchSpring.models.DatosEpisodio;
import com.aluracursos.ScreeMatchSpring.models.DatosSerie;
import com.aluracursos.ScreeMatchSpring.models.DatosTemporada;
import com.aluracursos.ScreeMatchSpring.service.ConsumoAPI;
import com.aluracursos.ScreeMatchSpring.service.ConvertirDatos;

@SpringBootApplication
public class ScreeMatchSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreeMatchSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/* 	var consumoAPI = new ConsumoAPI();
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
