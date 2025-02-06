# **Student Management API**

Esta é uma API RESTful para gerenciar estudantes. A API permite criar, atualizar, deletar e buscar informações de estudantes.

## **Tecnologias Utilizadas**
- **Java 17**
- **Spring Boot**
- **PostgreSQL**
- **Maven**


---

## **Pré-requisitos**
Antes de rodar o projeto, certifique-se de ter os seguintes itens instalados:
. **Java 17**
. **Maven**
. **PostgreSQL**
. Uma ferramenta para testar a API, como **Postman** ou **cURL**.

---

## **Configuração do Banco de Dados Local**
- CREATE USER crud_user WITH PASSWORD admin;
- CREATE DATABASE escola OWNER crud_user;
- CREATE SCHEMA schema_escola AUTHORIZATION crud_user;
- GRANT ALL PRIVILEGES ON DATABASE escola TO crud_user;
- GRANT ALL PRIVILEGES ON SCHEMA schema_escola TO crud_user;
- CREATE TABLE schema_escola.alunos (id SERIAL PRIMARY KEY, name VARCHAR(100), age INT);
 
## **Como rodar o projeto**
- Executar o comando```mvn spring-boot:run```