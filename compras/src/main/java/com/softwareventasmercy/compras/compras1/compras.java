
package com.softwareventasmercy.compras.compras1;

//clase para elaborar la entidad de la aplicacion 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class compras {
    @Id
    @Column
    private Long id_carrito_de_compras;
    
    @Column
    private String nombre;
    
    @Column
    private String id_categoria;
    
    @Column
    private String id_producto;
    
    @Column
    private String cantidad;
    
    @Column
    private String costo;
    
    @Column
    private String subtotal;
     
    @Column
    private String total;
     
    @Column
    private String fecha_compra;
    
}
