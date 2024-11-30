
package com.softwareventasmercy.cliente.modelo;

//clase para elaborar la entidad de la aplicación

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class cliente {
    @Id
    @Column
    private Long id_cliente;
    
    @Column
    private String nombre;
    
    @Column
    private String dirección;
    
    @Column
    private String correo_electronico;
    
    @Column
    private String telefono;
    
}
