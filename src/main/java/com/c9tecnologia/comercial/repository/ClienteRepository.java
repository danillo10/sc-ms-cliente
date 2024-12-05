package com.c9tecnologia.comercial.repository;

import com.c9tecnologia.comercial.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
