package io.github.dougllasfps.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.github.dougllasfps.domain.entity.Cliente;

@Repository
public interface Clientes extends JpaRepository<Cliente, Integer>{
	
	@Query(value = "select c from Cliente c where c.nome like :nome") 
	List<Cliente> encontrarPorNome(@Param("nome") String nome);
	
	@Modifying 
	void deleteByNome(String nome);
	
	boolean existsByNome(String nome);
	
}
