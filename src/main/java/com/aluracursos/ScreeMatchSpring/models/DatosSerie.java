package com.aluracursos.ScreeMatchSpring.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("TotalSeasons") String totalTemporadas,
        @JsonAlias("ImdbRating")  String evaluacion ) {
    

}

    

