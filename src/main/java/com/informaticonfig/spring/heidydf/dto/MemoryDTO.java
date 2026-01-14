package com.informaticonfig.spring.heidydf.dto;

import com.informaticonfig.spring.heidydf.entity.MemoryEntity;

public record MemoryDTO(
        Long id,
        String titulo,
        String descripcion,
        String urlImagen
) {
    // Método estático para convertir de Entidad a DTO
    public static MemoryDTO fromEntity(MemoryEntity memory, String baseUrl) {
        // baseUrl sería algo como "http://localhost:8080/uploads/"
        return new MemoryDTO(
                memory.getId(),
                memory.getTitulo(),
                memory.getDescripcion(),
                baseUrl + memory.getRutaImagen() // ¡Aquí ocurre la magia de la URL!
        );
    }
}