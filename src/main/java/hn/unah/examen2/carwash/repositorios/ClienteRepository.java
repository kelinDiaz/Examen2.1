package hn.unah.examen2.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen2.carwash.modelos.Clientes;

public interface ClienteRepository  extends JpaRepository<Clientes , Integer>{
    
}
