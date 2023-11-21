package hn.unah.examen2.carwash.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipocliente")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoCliente {
    
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipocliente")
    private int idtipocliente; 
     


    @Column(name = "descripcion")
    private String descripcion;
  
}
