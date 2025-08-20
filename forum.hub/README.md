# Fórum Hub - Challenge Alura

## Tecnologias
- Java 17
- Spring Boot
- H2 Database
- Maven

## Rodando a aplicação
1. Abra o projeto no IntelliJ.
2. Execute a classe `ForumHubApplication`.
3. Acesse o console H2 em `http://localhost:8080/h2-console`.
4. Teste os endpoints com Postman ou Insomnia:

### Endpoints
- GET /topicos → lista todos os tópicos
- GET /topicos/{id} → busca tópico por id
- POST /topicos → cria novo tópico
- PUT /topicos/{id} → atualiza tópico
- DELETE /topicos/{id} → deleta tópico

> Para criar, atualizar ou deletar tópicos, futuramente será necessário adicionar autenticação JWT.
