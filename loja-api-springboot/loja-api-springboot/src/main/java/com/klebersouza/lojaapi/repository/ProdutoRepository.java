package com.klebersouza.lojaapi.repository;

import com.klebersouza.lojaapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface que permite acessar os dados do banco relacionados ao Produto
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // O Spring Data JPA já implementa os métodos básicos de CRUD (como salvar, buscar, deletar, etc.)
}
