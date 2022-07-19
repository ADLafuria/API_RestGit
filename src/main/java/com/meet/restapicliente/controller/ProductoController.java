package com.meet.restapicliente.controller;


import com.meet.restapicliente.model.Productos;
import com.meet.restapicliente.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @RequestMapping("/allproductos")
    public List<Productos>buscarTodosLosProductos(){
        return productoService.buscarTodosLosProductos();
    }
    @RequestMapping("/{id}")
    public Productos buscarPorID(@PathVariable int IdProducto) {
        return productoService.buscarPorId(IdProducto);
    }

}
