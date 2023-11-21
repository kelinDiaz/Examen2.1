package hn.unah.examen2.carwash.servicios.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.carwash.modelos.Clientes;
import hn.unah.examen2.carwash.repositorios.ClienteRepository;
import hn.unah.examen2.carwash.servicios.ClienteService;

@Service
public class ClientesServiceImpl implements ClienteService {

   @Autowired
    private ClienteRepository clienteRepository; 

@Override
public Clientes crearCliente(Clientes cliente) {
    // TODO Auto-generated method stub

    if (cliente != null) {
        cliente..setArtista(artista);
    }

    return null;
}
    
}
