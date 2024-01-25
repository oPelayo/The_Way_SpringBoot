package com.bezkoder.spring.thymeleaf.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.thymeleaf.entity.Clientes;

@Repository
@Transactional
public interface ClienteRepository extends JpaRepository<Clientes, Integer>{

}
