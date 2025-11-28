Integrantes:

Micael Santos Azarias |RM552699

Felipe Megumi NAkama |RM552821

Carolina Cavalli Machado |RM552925

Nathan da Silveira Uflacker |RM553264


# 🏃‍♂️ HábitoPlus - API de Saúde e Bem-estar Corporativo

Este projeto consiste no backend de um módulo de **Saúde e Hábitos**, desenvolvido para incentivar, registrar e recompensar comportamentos saudáveis dos colaboradores através de gamificação (sistema de pontos).

O projeto segue os princípios de **SOA (Arquitetura Orientada a Serviços)** e utiliza **Java com Spring Boot**.

## 🚀 Tecnologias Utilizadas

- **Java 21** (LTS)
- **Spring Boot 3** (Web, Data JPA, Validation)
- **MySQL** (Banco de Dados Relacional)
- **Flyway** (Controle de Versão e Migrações de Banco)
- **Lombok** (Redução de boilerplate code)
- **Maven** (Gerenciador de dependências)

---

## 📂 Estrutura do Projeto (SOA)

A arquitetura foi desenhada para garantir a separação de responsabilidades, conforme exigido nos requisitos de modularidade.

```text
src/main/java/br/com/habitoplus
├── controller      # Camada de Apresentação (Endpoints REST)
│   └── HabitoController.java
├── dto             # Data Transfer Objects (Validação e Segurança de Entrada)
│   └── HabitoRequest.java
├── model           # Entidades do Banco de Dados (ORM)
│   └── RegistroHabito.java
├── repository      # Camada de Acesso a Dados (Interface JPA)
│   └── HabitoRepository.java
├── service         # Regras de Negócio e Lógica de Pontuação
│   └── HabitoService.java
└── HabitoplusApplication.java # Classe Principal
🗄️ Configuração do Banco de Dados (MySQL)
Para rodar o projeto, é necessário ter o MySQL 8 instalado e rodando. Siga os passos abaixo:

1. Criar o Banco de Dados
Abra seu terminal MySQL ou Workbench e execute o comando:

SQL

CREATE DATABASE habitoplus;
2. Configurar Credenciais
No arquivo src/main/resources/application.properties, verifique se o usuário e senha correspondem ao seu banco local:

Properties

spring.datasource.url=jdbc:mysql://localhost:3306/habitoplus?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=SUA_SENHA_AQUI
⚡ Como Rodar a Aplicação
Clone este repositório ou baixe o projeto.

Abra o projeto no IntelliJ IDEA.

Aguarde o Maven baixar as dependências.

Execute a classe HabitoplusApplication.java.

A API estará disponível em: http://localhost:8080.
_____________________________________________________________________________________________________________

🧪 Testes de API (Postman)
Para testar os endpoints, você pode importar a coleção que esta no git diretamente no Postman.

Endpoints Disponíveis
GET /api/v1/habitos - Verifica se a API está online.

POST /api/v1/habitos - Registra um hábito e calcula pontos.
