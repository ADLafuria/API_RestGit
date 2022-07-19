package com.meet.restapicliente.service;

import com.meet.restapicliente.model.Productos;
import com.meet.restapicliente.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository repository;


    @Override
    public Productos buscarPorId(int IdProducto) {
        return repository.findById(IdProducto).orElse(null);
    }

    @Override
    public List<Productos> buscarTodosLosProductos() {
        return repository.findAll();
    }
}
