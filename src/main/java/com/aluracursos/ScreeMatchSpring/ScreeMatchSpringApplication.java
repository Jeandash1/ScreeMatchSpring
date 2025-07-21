package com.aluracursos.ScreeMatchSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aluracursos.ScreeMatchSpring.models.DatosSerie;
import com.aluracursos.ScreeMatchSpring.service.ConsumoAPI;
import com.aluracursos.ScreeMatchSpring.service.ConvertirDatos;

@SpringBootApplication
public class ScreeMatchSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreeMatchSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.getDatos("https://www.omdbapi.com/?t=juego+de+tronos&apikey=3e86dbca");
		System.out.println(json);
		ConvertirDatos conversion = new ConvertirDatos();
		var datos = conversion.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);

	}

}
