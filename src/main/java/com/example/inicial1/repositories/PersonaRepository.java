package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {   //Se conecta directamente con la BD
    // Aquí puedes agregar métodos personalizados si es necesario
}