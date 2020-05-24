package io.github.dougllasfps.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.dougllasfps.domain.entity.Cliente;
import io.github.dougllasfps.domain.entity.Pedido;

@Repository
public interface Pedidos extends JpaRepository<Pedidos, Integer>{

	Object findByCliente(Cliente fulano);

	void save(Pedido p);
	
}
