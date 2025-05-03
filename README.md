
# 🚀 Projeto API RESTful - CRUD com Spring Boot

Este projeto consiste na criação de uma API RESTful completa utilizando o **Spring Boot**, implementando operações de **CRUD (Create, Read, Update, Delete)** para gerenciamento de usuários. Explora diversos conceitos modernos aplicados no desenvolvimento de APIs com Java.

---

## 🧰 Tecnologias e Ferramentas Utilizadas

- 💻 Java 17
- 🌱 Spring Boot 3.3.0
- 🧪 Spring Data JPA
- 🧾 Spring Web
- 🐘 PostgreSQL (ou H2 para testes)
- 🧪 JUnit para testes automatizados
- ☕ Spring Tool Suite (STS)
- 🛠️ Maven (Gerenciador de dependências)

---

## 📂 Estrutura do Projeto

```
src
├── main
│   ├── java
│   │   └── com.example.project
│   │       ├── controllers
│   │       ├── entities
│   │       ├── repositories
│   │       ├── services
│   │       └── exceptions
│   └── resources
│       ├── application.properties
│       └── application-test.properties
```

---

## 🔧 Funcionalidades da API

A API oferece os seguintes endpoints para gerenciamento de usuários:

### ✅ Criar Usuário
- `POST /users`
- Cria um novo usuário com os dados informados.

### 🔍 Buscar Usuário por ID
- `GET /users/{id}`
- Retorna os dados de um usuário específico.

### 📋 Listar Todos os Usuários
- `GET /users`
- Retorna uma lista com todos os usuários cadastrados.

### ✏️ Atualizar Usuário
- `PUT /users/{id}`
- Atualiza os dados de um usuário com base no ID.

### ❌ Deletar Usuário
- `DELETE /users/{id}`
- Remove um usuário do sistema.

---

## 🧠 Camadas e Abordagens Aplicadas

### 🏗️ Entities
- Estrutura das entidades que mapeiam as tabelas do banco de dados.

### 🗃️ Repositories
- Interface `UserRepository` estendida de `JpaRepository` para facilitar operações com o banco de dados.

### 🧠 Services
- Contém as regras de negócio e manipulação de dados da aplicação.

### 📡 Controllers
- Responsáveis por mapear os endpoints e realizar a comunicação com o front-end ou clientes externos.

### ⚠️ Exceptions
- Implementações para tratamento de exceções com classes como:
  - `ResourceNotFoundException`
  - `StandardError`
  - `ResourceExceptionHandler`

---

## 🧪 Ambiente de Teste

- Arquivo `application-test.properties` configurado para rodar testes automatizados em ambiente isolado.
- Banco de dados populado automaticamente com dados fictícios ao iniciar a aplicação de teste.

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/gabszin/springboot-user-crud.git
   ```

2. Abra o projeto no **Spring Tool Suite** ou **IDE de sua preferência**.

3. Configure o banco de dados no arquivo `application.properties`.

4. Execute a aplicação pela classe principal `ProjectApplication.java`.

5. Utilize o Postman ou Insomnia para testar os endpoints REST.

---

## 📈 Diferenciais do Projeto

- Arquitetura bem organizada em camadas (MVC)
- Uso de injeção de dependência e padrão Service/Repository
- Tratamento de exceções robusto e centralizado
- Preparado para integração com front-ends modernos (React, Angular, etc.)

---


## 📌 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para utilizar, modificar e compartilhar!

---

## 🎨 Inspiração

Esse projeto foi desenvolvido durante uma aula prática da faculdade, com foco em aplicar conceitos fundamentais do desenvolvimento web utilizando **Spring Boot**, buscando excelência e preparação para o mercado de trabalho.
