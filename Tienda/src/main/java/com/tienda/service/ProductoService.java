/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author andre
 */

public interface ProductoService {
     // Se obtiene un listado de categorias en un List
    public List<Producto> getProductos(boolean activos);
    
    //Se obtiene un Categoria, a partir del id de un categoria
    public Producto getProducto(Producto producto);
    
    //Se inserta un nuevo categoria si el id del categoria esta vacio
    //Se actualiza un categoria si el id del categoria NO esta vacio
    public void save(Producto producto);
    
    //Se elimina el categoria que tiene el id pasado por parametro
    public void delete(Producto producto);
}
