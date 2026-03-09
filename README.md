# 🚀 ElasticSearch & Spring Boot Study

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Elasticsearch-005571?style=for-the-badge&logo=elasticsearch&logoColor=white" alt="Elasticsearch" />
  <img src="https://img.shields.io/badge/Kibana-005571?style=for-the-badge&logo=kibana&logoColor=white" alt="Kibana" />
  <img src="https://img.shields.io/badge/Logstash-005571?style=for-the-badge&logo=logstash&logoColor=white" alt="Logstash" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" />
</p>

## 📝 Sobre o Projeto

Este repositório contém um **estudo prático** focado na integração do ecossistema **Spring Boot** com a **Elastic Stack (ELK)**. O objetivo principal foi explorar as capacidades de busca avançada, análise de dados e monitoramento de logs em tempo real.

> "Mini projeto para conhecimento, antes de implementar e fazer deploy para prod. Este estudo permite o aprofundamento em ferramentas de análise, filtragem de logs e um overview do estado das aplicações Java."

---

## 🛠️ Tecnologias e Ferramentas

O projeto utiliza as seguintes tecnologias:

| Tecnologia | Finalidade |
| :--- | :--- |
| **Java 17** | Linguagem base do projeto. |
| **Spring Boot 3.5.11** | Framework para construção da API REST. |
| **Elasticsearch 9.2.0** | Motor de busca e análise distribuído. |
| **Logstash 9.2.0** | Pipeline de processamento de dados e logs. |
| **Kibana 9.2.0** | Interface de visualização e exploração de dados. |
| **Docker & Docker Compose** | Orquestração de containers para o ambiente ELK. |
| **Lombok** | Redução de código boilerplate. |
| **MapStruct** | Mapeamento eficiente entre DTOs e Entidades. |

---

## 🏗️ Arquitetura do Estudo

O fluxo de dados do projeto segue o padrão clássico de observabilidade e busca:

1.  **Spring Boot App**: Gera logs e envia dados de produtos.
2.  **Logstash**: Recebe os logs via TCP (porta 5044), processa e os encaminha.
3.  **Elasticsearch**: Armazena e indexa os dados para buscas rápidas.
4.  **Kibana**: Fornece um dashboard para visualizar os logs e documentos indexados.

---

## 🚀 Como Executar

### Pré-requisitos
*   [Docker](https://www.docker.com/) instalado.
*   [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) (opcional, se for rodar a app fora do container).
*   [Maven](https://maven.apache.org/) (opcional).

### Passo a Passo

1.  **Clonar o repositório:**
    ```bash
    git clone https://github.com/luger-mano/ElasticSearchSpringBoot.git
    cd ElasticSearchSpringBoot
    ```

2.  **Subir a Elastic Stack:**
    ```bash
    docker-compose up -d
    ```
    *Isso iniciará o Elasticsearch, Logstash e Kibana.*

3.  **Executar a aplicação Spring Boot:**
    ```bash
    ./mvnw spring-boot:run
    ```

---

## 🔍 Endpoints Principais (Exemplos)

A aplicação expõe endpoints para gerenciamento de produtos e integração com o Elasticsearch:

*   `POST /products`: Cria um novo produto e indexa no Elasticsearch.
*   `GET /products/{id}`: Busca um produto pelo ID.
*   `GET /products/search?name=...`: Realiza buscas textuais.

---

## 📊 Visualização no Kibana

Após subir o ambiente, você pode acessar o Kibana em:
👉 [http://localhost:5601](http://localhost:5601)

Lá você poderá criar **Index Patterns** para visualizar os logs enviados pelo Logstash e os documentos do Elasticsearch.

---

## 👨‍💻 Autor

Desenvolvido por **Lucas Germano (luger-mano)**.
Sinta-se à vontade para entrar em contato ou contribuir com o projeto!

---
<p align="center">
  Feito com ❤️ para fins de estudo.
</p>


ao vivo
