package com.aluracursos.ScreeMatchSpring.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertirDatos implements IconvierteDatosl {
    
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        
        try {
            return objectMapper.readValue(json, clase);
            
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    
}
