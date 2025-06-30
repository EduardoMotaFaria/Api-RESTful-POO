# 🛒 API RESTful - Loja Virtual (Produtos)

API desenvolvida em **Java** com **Spring Boot** para gerenciamento de produtos de uma loja virtual. Permite operações CRUD completas, com persistência em banco de dados **H2** e documentação interativa via **Swagger UI**.

---

## 👨‍🏫 Informações do Projeto Acadêmico

- **Instituição:** Fatec Mogi Mirim – Arthur de Azevedo  
- **Curso:** Tecnologia em Análise e Desenvolvimento de Sistemas  
- **Disciplina:** Programação Orientada a Objetos  
- **Professor:** Marcos Roberto de Moraes  
- **Autores:** Eduardo Faria, Mateus Felix, Kleber Souza  

---

## 🎯 Objetivo

Criar uma aplicação backend que implemente os principais conceitos de **POO**, **MVC**, e **APIs RESTful** com **Spring Boot**, integrando o uso de:

- Camadas desacopladas (`controller`, `service`, `repository`, `model`)
- Banco de dados H2 em memória
- Swagger UI para documentação automática dos endpoints

---

## 🚀 Como executar o projeto

### ✔️ Pré-requisitos

- Java JDK 17+
- Maven 3.8+

### ▶️ Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/loja-api-springboot.git
   cd loja-api-springboot
   ```

2. Compile e execute:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse no navegador:

   - **Swagger UI:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
   - **Console H2:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 🗂️ Estrutura de Pacotes

| Pacote                    | Responsabilidade                                 |
|---------------------------|--------------------------------------------------|
| `controller`              | Define os endpoints REST da aplicação           |
| `model`                   | Entidade Produto com anotações JPA              |
| `repository`              | Interface com Spring Data para acesso ao banco  |
| `service` (opcional)      | Camada de regras de negócio (pode ser adicionada futuramente) |

---
## 📌 Entidade: Produto

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;
private String descricao;
private double preco;
private int quantidade;
```

---

## 📡 Endpoints da API

| Verbo  | Rota              | Descrição                                          |
|--------|-------------------|----------------------------------------------------|
| GET    | `/produtos`       | Lista todos os produtos                           |            |
| POST   | `/produtos`       | Cadastra um novo produto                          |
| PUT    | `/produtos`  | Atualiza um produto existente                     |
| DELETE | `/produtos`  | Remove um produto com base no ID informado        |

Todos os endpoints seguem boas práticas REST e estão acessíveis via Swagger UI.

---

## 💾 Banco de Dados H2

- **Driver:** org.h2.Driver  
- **Console Web:** `/h2-console`  
- **URL JDBC (default):** `jdbc:h2:file:./data/meubanco`  
- **Usuário padrão:** `sa` (sem senha)

---

## 📖 Documentação Swagger

O projeto utiliza Swagger para documentação automática dos endpoints. A interface é acessível em:

📍 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 🧪 Exemplo de Requisição (POST)

```json
{
  "id": 1,
  "nome": "Teclado Gamer",
  "descricao": "Teclado Mecánico Gamer vermelho, Switch Blue",
  "preco": 250.00,
  "quantidade": 10
}
```

---

## ✅ Conclusão

Este projeto permitiu aplicar, na prática, conceitos fundamentais de desenvolvimento backend com Java, tais como:

- Estruturação de projetos Spring Boot
- Modelagem com JPA
- Criação da API RESTful
- Testes com Swagger e banco H2

Foi possível executar todas as operações de CRUD com sucesso e visualizar os dados em tempo real.

---

## 👥 Nome dos Autores

- Eduardo Faria  
- Mateus Felix  
- Kleber Souza
