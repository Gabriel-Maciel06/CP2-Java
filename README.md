# CP2 - API de Brinquedos

Projeto desenvolvido para o CheckPoint 2 da disciplina de Programação Spring Boot com Persistência (Professor: Dr. Marcel Stefan Wagner).

## Integrantes
-Vitória Rodrigues Martins 
565160

-Augusto Bonomo Júnior 
565155

-Thomas Fontes 
562254

-Gabriel Maciel
RM562795

-Matheus Pereira Molina
RM563399

## Sobre o Projeto
Este é um aplicativo para uma empresa de brinquedos (crianças até 14 anos) desenvolvido em Spring Boot usando a linguagem Java e gerenciador de dependências Gradle.
O projeto implementa uma API RESTFUL completa (CRUD - Create, Read, Update e Delete) conectada ao banco de dados Oracle usando JPA/Hibernate.

### Tecnologias e Dependências
- **Linguagem**: Java 21
- **Framework**: Spring Boot 3.x
- **Dependências**:
  - Spring Web
  - Spring Data JPA
  - Validation
  - Oracle Driver

A configuração das dependências do Spring Initializr pode ser validada pela imagem fornecida na pasta do projeto.

---

## Como Rodar e Testar

1. Certifique-se de que o **Oracle SQL Developer** esteja rodando localmente (porta 1521).
2. O usuário e senha configurados no `application.properties` são `ORACLE_FIAP` e `sua_senha_aqui`. Altere a senha se necessário.
3. Inicie o projeto pelo IDE ou rodando `./gradlew bootRun`. O Tomcat rodará na porta **8080**.
4. Teste a API pelo **Postman** ou **Insomnia**.

---

## Exemplos de JSON para o CRUD (Postman / Insomnia)

Abaixo estão as estruturas JSON para você colar no Body (raw -> JSON) nas requisições.

### 1. CREATE (POST)
**Endpoint**: `http://localhost:8080/brinquedos`

**JSON de Requisição:**
```json
{
  "nome": "Boneco Max Steel",
  "tipo": "Ação",
  "classificacao": "Livre",
  "tamanho": "Médio",
  "preco": 89.90
}
```

### 2. READ (GET) - Listar Todos
**Endpoint**: `http://localhost:8080/brinquedos`
*(Não precisa de JSON no Body)*

### 3. READ (GET) - Buscar por ID
**Endpoint**: `http://localhost:8080/brinquedos/1`
*(Não precisa de JSON no Body)*

### 4. UPDATE (PUT)
**Endpoint**: `http://localhost:8080/brinquedos/1`

**JSON de Requisição (atualizando o preço):**
```json
{
  "nome": "Boneco Max Steel - Edição Especial",
  "tipo": "Ação",
  "classificacao": "10 anos",
  "tamanho": "Grande",
  "preco": 120.50
}
```

### 5. DELETE (DELETE)
**Endpoint**: `http://localhost:8080/brinquedos/1`
*(Não precisa de JSON no Body)*
