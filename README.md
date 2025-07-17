# SocialMediaGraphQL

API para criação de **posts** e **comentários** utilizando **Spring Boot** e **GraphQL**. Esse projeto simula funcionalidades básicas de uma rede social, permitindo a criação de posts, adição de comentários e consultas via GraphQL.

## 🚀 Tecnologias

- Java 17+
- Spring Boot
- Spring GraphQL
- Maven

## 📁 Estrutura

```bash
src/
 └── main/
     ├── java/com/graphql/socialmedia/
     │   ├── ForumController.java
     │   ├── ForumData.java
     │   ├── ForumService.java
     └── resources/
         ├── application.properties
         └── graphql/schema.graphqls
```

## ⚙️ Como executar

```bash
# Clone o repositório
git clone https://github.com/welingtonjunior/SocialMediaGraphQL.git
cd SocialMediaGraphQL

# Execute com Maven Wrapper
./mvnw spring-boot:run
```

> A aplicação será iniciada na porta `8080` por padrão.

## 🔍 Exemplo de Schema GraphQL

### 🔎 Query

```graphql
query {
    postById(id: "1") {
        id
        content
        comments {
            id
            content
        }
    }
}
```

### ✍️ Mutations

```graphql
mutation {
    createPost(content: "Meu primeiro post") {
        id
        content
    }
}

mutation {
    createComment(content: "Comentando aqui", postId: "1") {
        id
        content
        postId
    }
}
```

## 📌 Endpoints

Acesse o playground do GraphQL (como o Altair ou GraphiQL) apontando para:

```
http://localhost:8080/graphql
```

## 📄 Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Desenvolvido por [Welington Fagundes](https://github.com/welingtonjunior)
