# 📝 Workshop Spring Boot com MongoDB

Este projeto é uma aplicação RESTful construída com Spring Boot e MongoDB. Ele simula uma plataforma de posts e usuários, permitindo gerenciar pessoas, seus posts e comentários de forma simples, demonstrando o uso de banco de dados orientado a documentos no contexto de APIs.

## 🛠️ Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
- Postman

## 💡 Descrição

A aplicação foi desenvolvida para explorar na prática:

- O paradigma de banco de dados orientado a documentos
- As melhores práticas de modelagem com MongoDB no Spring Boot
- Criação de endpoints RESTful organizados em camadas (resources, services, repositories)
- Uso de Data Transfer Objects (DTO) para otimizar dados trafegados nas requisições
- Consultas simples e avançadas com Query Methods e @Query no Spring Data MongoDB


## ⚙️ Como executar

1. Clone o repositório
``` bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

2. Configure o MongoDB

- Certifique-se de ter o MongoDB instalado e rodando localmente.

- O banco esperado é workshop_mongo. Caso deseje alterar, modifique a URI em application.properties:

``` bash
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
```

3. Execute o projeto
Você pode executar via IDE (Spring Boot Run) ou via terminal:

```bash
./mvnw spring-boot:run
```

4. Testar endpoints
- A aplicação inicia em: http://localhost:8080

### Exemplos de endpoints

- GET /users – listar todos os usuários
- POST /users – inserir novo usuário
- PUT /users/{id} – atualizar usuário
- DELETE /users/{id} – deletar usuário
- GET /users/{id}/posts – listar posts de um usuário específico
- GET /posts/{id} – buscar post por id
- GET /posts/titlesearch?text=palavra – buscar posts pelo título
- GET /posts/fullsearch?text=palavra&minDate=2020-01-01&maxDate=2025-12-31 – buscar posts filtrando por texto e data

<br><br>

## 🙋 Sobre o Autor


Desenvolvido por Jefferson Sousa  
[GitHub](https://github.com/JeffSSousa) | [LinkedIn](https://www.linkedin.com/in/jefferson-sousa-8b93a81a2/)