package com.aluracursos.ScreeMatchSpring.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aluracursos.ScreeMatchSpring.models.DatosEpisodio;
import com.aluracursos.ScreeMatchSpring.models.DatosSerie;
import com.aluracursos.ScreeMatchSpring.models.DatosTemporada;
import com.aluracursos.ScreeMatchSpring.service.ConsumoAPI;
import com.aluracursos.ScreeMatchSpring.service.ConvertirDatos;

public class Principal {
    
    private Scanner escribir = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvertirDatos conversion = new ConvertirDatos();

    //Estructura de la URL
    private final String UrlBase = "https://www.omdbapi.com/?t=";
    private final String apiKey = "&apikey=3e86dbca";

    public void mostrarMenu(){
        System.out.println(" --  Bienvenido a ScreeMatch  -- ");
        System.out.println("Por favor, escribe el nombre de la serie que deseas vuscar:");
        
        //Buscar datos de la serie
        var nombreSerie = escribir.nextLine();
        var json = consumoAPI.getDatos( UrlBase + nombreSerie.replace(" ", "+") + apiKey);

        var datos = conversion.obtenerDatos(json,DatosSerie.class);
        System.out.println(datos);
        
        // Buscar datos de todas las temporadas
        List<DatosTemporada> temporadas = new ArrayList<>();
		for (int i = 1; i <= datos.totalTemporadas(); i++){
			json = consumoAPI.getDatos(UrlBase + nombreSerie.replace(" ", "+") + "&Season=" + i + apiKey);
			var datosTemporada = conversion.obtenerDatos(json, DatosTemporada.class);
			temporadas.add(datosTemporada);
		}
		//temporadas.forEach(System.out::println);

        //obtene titulo de los capitulos x temporada usando lambda para recorrer todas las temporada (simplifica el ciclo for)
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }
}
