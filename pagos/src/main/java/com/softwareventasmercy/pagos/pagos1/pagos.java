
package com.softwareventasmercy.pagos.pagos1;


//clase para elaborar la entidad de la aplicacion 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class pagos {
    @Id
    @Column
    private Long id_numero_pago;
    
    @Column
    private String id_cliente;
    
    @Column
    private String metodo_de_pago;
    
    @Column
    private String valor;
    
    @Column
    private String fecha_pago;
    
    @Column
    private String monto_pago;
    
    @Column
    private String estado_pago;
     
    @Column
    private String decripcion_de_costo;
     
}


    
