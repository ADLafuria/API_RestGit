package com.meet.restapicliente.repository;

import com.meet.restapicliente.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {

}
