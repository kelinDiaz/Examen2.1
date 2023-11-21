package hn.unah.examen2.carwash.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {
    
     @Id
    @Column(name = "idVehiculo")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int idVehiculo;
    
    @Column(name = "marca")
    private String marca; 

    @Column(name = "anio")
     private String anio;

     @Column(name = "disponible")
    private boolean  disponible; 
  

    
   @ManyToOne
   @JoinColumn(name = "idTipoVehiculo")
   private TipoVehiculo tipoVehiculo;  
   


}
