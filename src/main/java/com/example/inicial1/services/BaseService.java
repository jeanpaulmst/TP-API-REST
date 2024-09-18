package com.example.inicial1.services;

import java.util.List;

public interface BaseService<E> {
    public List<E> findAll() throws Exception;  //trae una lista de todas las que se encuientran en nuestar BD
    public E findById(Long id) throws Exception;   //Encuentra elemento po id
    public E save(E entity) throws Exception;   //Guarda elemento en la BD
    public E update(Long id, E entity) throws Exception;    //Actualiza elemento en la BD
    public boolean delete(Long id) throws Exception;    //Elimina un registro de la BD

}
