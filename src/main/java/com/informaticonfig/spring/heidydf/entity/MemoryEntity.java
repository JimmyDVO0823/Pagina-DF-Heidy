package com.informaticonfig.spring.heidydf.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class MemoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    // Si la descripción es muy larga, usamos @Column para ampliarla
    @Column(length = 500)
    private String descripcion;

    // Aquí guardaremos la RUTA ("uploads/foto1.jpg"), NO la imagen binaria
    private String rutaImagen;

    @Override
    public String toString() {
        return "id: " +  id + ", titulo: " + titulo + ", descripcion: " + descripcion;
    }
}