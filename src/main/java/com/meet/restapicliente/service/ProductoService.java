package com.meet.restapicliente.service;

import com.meet.restapicliente.model.Productos;

import java.util.List;

public interface ProductoService {

    Productos buscarPorId(int IdProducto);
    List<Productos> buscarTodosLosProductos();


}
