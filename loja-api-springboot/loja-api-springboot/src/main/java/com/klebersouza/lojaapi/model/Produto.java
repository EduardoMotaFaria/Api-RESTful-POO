package com.klebersouza.lojaapi.model;

import jakarta.persistence.*;

// Define que esta classe é uma entidade gerenciada pelo JPA
@Entity
public class Produto {

    // Identificador único do produto, gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome do produto
    private String nome;

    // Descrição do produto
    private String descricao;

    // Preço do produto
    private Double preco;

    // Quantidade disponível em estoque
    private Integer quantidade;

    // Getters e setters para acesso e modificação dos atributos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
