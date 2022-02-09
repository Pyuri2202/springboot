package com.algaworks.algalog.domain.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algalog.api.domain.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
