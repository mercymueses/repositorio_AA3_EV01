
package com.softwareventasmercy.productos.modelo;

//clase para laborar la entidad de la aplicaación

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class productos {
    @Id
    @Column
    private Long id_producto;
    
    @Column
    private String nombre;
    
    @Column
    private String descripción;
    
    @Column
    private String valor;
    
    @Column
    private String cantidad;
    
    @Column
    private String id_categoria;
    
}
    

