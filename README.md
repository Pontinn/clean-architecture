# EventClean: Estudo de Arquitetura Limpa

Este é um projeto de estudo focado na implementação prática dos princípios da **Arquitetura Limpa (Clean Architecture)** de Robert C. Martin.

O objetivo é construir uma API RESTful para um sistema de gerenciamento de eventos, mantendo uma separação clara entre as regras de negócio e as dependências externas, como o framework (Spring) e o banco de dados (PostgreSQL).

## 🎯 Objetivo Principal

O foco deste projeto não é criar um software complexo, mas sim explorar os seguintes conceitos:

* **Separação de Camadas:** Isolar o Domínio (regras de negócio puras) da Aplicação (casos de uso) e da Infraestrutura (Spring, banco de dados, etc.).
* **Regra da Dependência:** Garantir que as dependências fluam sempre para o centro (Domínio), fazendo com que as camadas internas não saibam nada sobre as externas.
* **Independência de Framework:** A lógica de negócio principal é escrita em Java puro, sem depender de anotações ou classes do Spring Boot.
* **Independência de Banco de Dados:** O núcleo da aplicação não sabe que está usando PostgreSQL. A camada de persistência (JPA) é um detalhe de infraestrutura.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17
* **Framework:** Spring Boot (Web, Data JPA)
* **Banco de Dados:** PostgreSQL
* **Migrations:** Flyway
* **Containerização:** Docker Compose (para o banco de dados)
* **Build:** Apache Maven

## 🚀 Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Pontinn/clean-architecture
    cd EventClean
    ```

2.  **Configure o Ambiente:**
    * Copie o arquivo de exemplo `.env`:
        ```bash
        cp example.env .env
        ```
    * **Importante:** Edite o arquivo `.env` com os valores que você deseja para o banco (usuário, senha e nome do banco). Os valores padrão `postgres`/`postgres` funcionarão com a configuração do `docker-compose.yml`.

3.  **Inicie o Banco de Dados (Docker):**
    * Certifique-se de ter o Docker instalado e rodando.
    * Execute o comando para subir o contêiner do Postgres em segundo plano:
        ```bash
        docker-compose up -d
        ```

4.  **Execute a Aplicação (Spring Boot):**
    * Use o Maven Wrapper para iniciar a aplicação:
        ```bash
        ./mvnw spring-boot:run
        ```

A aplicação estará disponível em `http://localhost:8080`.
