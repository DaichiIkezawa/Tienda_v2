package com.tienda_v2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_categoria")
    List<Producto> productos;
    
    public Categoria() {
    }

    public Categoria(String descripcion, String imagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = imagen;
        this.activo = activo;
    }
}
