
package com.softwareventasmercy.administrador.administrador1;

//clase para elaborar la entidad de la aplicacion 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class administrador {
    @Id
    @Column
    private Long id_administrador_tienda_virtual;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column
    private String teléfono;
    
    @Column
    private String correo_electronico;
    
    @Column
    private String recidencia;
    
}
