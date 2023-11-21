package hn.unah.examen2.carwash.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Clientes {

   @Id
    @Column(name ="codigoCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoCliente; 

    @Column(name="nombre")
   private String nombre; 

    @Column(name= "apellido")
   private String apellido; 

   @Column(name ="fechaingreso")
   private Date fechaingreso; 

   @ManyToOne
   @JoinColumn(name = "idtipocliente")
   private TipoCliente tipoCliente; 
   


    
}
