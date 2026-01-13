package com.informaticonfig.spring.heidydf.entity;

import jakarta.persistence.*;

@Entity
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

    // --- REGLAS DE ORO DE JPA ---

    // 1. Constructor vacío (Obligatorio para que Spring funcione)
    public MemoryEntity() {
    }

    // 2. Constructor lleno (Para facilitarte la vida a ti)
    public MemoryEntity(String titulo, String descripcion, String rutaImagen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    // 3. Getters y Setters (Para que Spring pueda leer y escribir datos)
    // (Puedes ahorrarte esto si usas la librería Lombok con @Data, pero hazlo a mano por ahora)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getRutaImagen() { return rutaImagen; }
    public void setRutaImagen(String rutaImagen) { this.rutaImagen = rutaImagen; }
}