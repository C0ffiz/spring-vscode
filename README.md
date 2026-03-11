# 🧁 Patisserie Bolos — Spring Boot

> Reimplementação do sistema de gerenciamento da Pâtisserie Bolos utilizando Java e Spring Boot

Uma aplicação web full-stack desenvolvida em **Java com Spring Boot**, que reimplementa o sistema de gerenciamento da confeitaria Pâtisserie Bolos — originalmente construído em Node.js. O projeto aplica o padrão MVC com persistência via JPA/Hibernate, templates Thymeleaf e banco de dados MySQL.

> 📌 Este repositório é a versão Java do projeto [patisserie-bolos](https://github.com/C0ffiz/patisserie-bolos), desenvolvida como exercício acadêmico para praticar Spring Boot.

---

## 🚀 Tecnologias

### Backend
- **[Java 17](https://www.oracle.com/java/)** — Linguagem principal
- **[Spring Boot 3](https://spring.bootproject.io/)** — Framework principal
- **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)** — Persistência e ORM via Hibernate
- **[Spring Web MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)** — Controladores e roteamento
- **[Lombok](https://projectlombok.org/)** — Redução de boilerplate (getters, setters, construtores)
- **[Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools)** — Reload automático em desenvolvimento

### Frontend
- **[Thymeleaf](https://www.thymeleaf.org/)** — Template engine para renderização server-side
- **[Bootstrap 5](https://getbootstrap.com/)** — Framework CSS

### Banco de Dados
- **[MySQL](https://www.mysql.com/)** — Banco de dados relacional
- **[H2](https://www.h2database.com/)** — Banco em memória (disponível para testes)

### Build
- **[Maven](https://maven.apache.org/)** — Gerenciamento de dependências e build

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    ├── java/com/coffee/springvscode/
    │   ├── SpringVscodeApplication.java   # Ponto de entrada
    │   ├── controller/
    │   │   └── ClientesController.java    # Controlador principal (rotas)
    │   ├── dao/
    │   │   ├── ClienteDao.java            # Repository de clientes
    │   │   ├── PromosDao.java             # Repository de promoções
    │   │   └── SobreDao.java             # Repository da seção Sobre
    │   └── model/
    │       ├── Clientes.java              # Entidade cliente
    │       ├── Promos.java                # Entidade promoção
    │       └── Sobre.java                 # Entidade sobre
    └── resources/
        ├── application.properties         # Configurações da aplicação
        ├── static/images/                 # Imagens estáticas
        └── templates/
            ├── home/
            │   └── index.html             # Página pública da confeitaria
            └── Clientes/
                ├── formClientes.html      # Formulário de cadastro de cliente
                ├── formDashboard.html     # Dashboard administrativo
                └── alterar.html           # Edição de cliente
```

---

## 🧾 Rotas da Aplicação

| Método | Rota | Descrição |
|--------|------|-----------|
| `GET` | `/` | Página pública — vitrine com promoções e seção sobre |
| `GET` | `/dashboard` | Dashboard administrativo |
| `GET` | `/inserirClientes` | Formulário de cadastro de novo cliente |
| `POST` | `/insertClientes` | Salva novo cliente |
| `GET` | `/alterar/{id}` | Formulário de edição de cliente |
| `POST` | `/alterar` | Atualiza dados do cliente |
| `GET` | `/excluir/{id}` | Remove cliente |
| `POST` | `/insertPromos` | Adiciona nova promoção |
| `POST` | `/inserirSobre` | Atualiza conteúdo da seção "Sobre" |

---

## ⚙️ Instalação e Configuração

### Pré-requisitos

- [Java 17+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/) (v5.7 ou superior)

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/C0ffiz/PatisserieBolos-SpringBoot.git
cd PatisserieBolos-SpringBoot
```

### 2️⃣ Configure o banco de dados

Crie o banco no MySQL:

```sql
CREATE DATABASE java_spring;
```

Edite `src/main/resources/application.properties` com suas credenciais:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/java_spring
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### 3️⃣ Execute a aplicação

```bash
./mvnw spring-boot:run
```

Ou no Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação estará disponível em: **http://localhost:8080**

> As tabelas são criadas automaticamente pelo Hibernate na primeira execução (`ddl-auto=update`).

---

## 🗂️ Modelos de Dados

### Clientes
| Campo | Tipo |
|-------|------|
| id | Integer (PK) |
| nome | String |
| telefone | String |
| cpf | String |
| status | Boolean |

### Promos
| Campo | Tipo |
|-------|------|
| id | Integer (PK) |
| produto | String |
| preco | Double |
| img | String |

### Sobre
| Campo | Tipo |
|-------|------|
| id | Integer (PK) |
| sobretxt | String |
| img | String |

---

## 🎓 Contexto Acadêmico

Este projeto foi desenvolvido como **exercício acadêmico** para praticar desenvolvimento web com Java e Spring Boot, aplicando conceitos de arquitetura MVC, Spring Data JPA, injeção de dependência e renderização server-side com Thymeleaf.
