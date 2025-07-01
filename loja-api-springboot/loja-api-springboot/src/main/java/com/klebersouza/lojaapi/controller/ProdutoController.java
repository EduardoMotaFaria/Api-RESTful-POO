package com.klebersouza.lojaapi.controller;

import com.klebersouza.lojaapi.model.Produto;
import com.klebersouza.lojaapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// importando o Swagger
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/produtos") // Endpoints começam com /produtos
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // GET: Lista todos os produtos
    @Operation(
            summary = "Listar produtos",
            description = "Retorna todos os produtos cadastrados no banco de dados H2."
    )
    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    //  POST: Cadastra um novo produto
    @Operation(
            summary = "Cadastrar produto",
            description = "Adiciona um novo produto com nome, preço e quantidade."
    )
    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // DELETE: Exclui produto por ID
    @Operation(
            summary = "Excluir produto",
            description = "Remove um produto existente com base no ID fornecido."
    )
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }

    //  PUT: Atualiza produto por ID
    @Operation(
            summary = "Atualizar produto",
            description = "Atualiza os dados de um produto existente (nome, preço, quantidade)."
    )
    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
        Produto produto = produtoRepository.findById(id).orElseThrow();
        produto.setNome(produtoAtualizado.getNome());
        produto.setDescricao(produtoAtualizado.getDescricao());
        produto.setPreco(produtoAtualizado.getPreco());
        produto.setQuantidade(produtoAtualizado.getQuantidade());
        return produtoRepository.save(produto);
    }
}
