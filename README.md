# 🤖 Automação Desktop Java

Projeto desenvolvido para estudos e experimentação de automação desktop utilizando Java e a classe `java.awt.Robot`.

O objetivo é criar uma estrutura organizada para automação de sistemas legados desktop, aplicando conceitos modernos de engenharia de software como:

- Page Object Pattern
- Factory Pattern
- Geração de Massa de Dados Fake
- Separação por Camadas
- Reutilização de Componentes
- Automação Desktop com Robot

---

## 📌 Motivação

Muitas empresas ainda utilizam sistemas legados desenvolvidos em tecnologias como:

- VB6
- Delphi
- WinForms
- Aplicações Desktop Proprietárias

Nem sempre é possível utilizar ferramentas tradicionais como Selenium, Playwright ou Cypress.

Este projeto explora uma alternativa baseada em:

```java
java.awt.Robot
````

permitindo automatizar interações de teclado em aplicações desktop.

---

## 🏗 Arquitetura

```text
src
 └── main
      └── java
           └── br.teste.desktop

                ├── config
                │    └── ConfigReader

                ├── core
                │    ├── RobotUtils
                │    └── TextUtils

                ├── factory
                │    └── ConsultorioFactory

                ├── flow
                │    └── CadastroCompletoFlow

                ├── model
                │    └── Consultorio

                ├── page
                │    ├── BasePage
                │    ├── ConsultorioPage
                │    └── DadosPessoaisPage

                ├── utils
                │    ├── Log
                │    ├── ScreenshotUtils
                │    └── WaitUtils

                └── Main
```

---

## 📂 Estrutura do Projeto

### Page Object

Cada tela do sistema possui sua própria classe.

Exemplo:

```java
ConsultorioPage
DadosPessoaisPage
```

Responsabilidade:

* Navegação
* Preenchimento dos campos
* Interações com a tela

---

### Flow

Responsável por orquestrar o fluxo completo da automação.

Exemplo:

```java
CadastroCompletoFlow
```

---

### Factory

Responsável por gerar massas de teste.

Exemplo:

```java
ConsultorioFactory
```

Utiliza:

```xml
Java Faker
```

para criação de:

* nomes
* telefones
* e-mails
* dados fictícios

---

### Core

Biblioteca interna de apoio.

Exemplo:

```java
RobotUtils
```

Contendo:

* TAB
* Digitação
* Navegação
* Atalhos

---

## 🚀 Tecnologias

* Java 17+
* Maven
* Java Faker
* IntelliJ IDEA
* Git
* GitHub

---

## ▶️ Executando

Clone o projeto:

```bash
git clone https://github.com/Azzi77/automacao-java-desktop.git
```

Acesse a pasta:

```bash
cd automacao-java-desktop
```

Execute a classe:

```java
Main.java
```

---

## 📋 Funcionalidades atuais

* [x] Estrutura Page Object
* [x] Factory de Dados
* [x] Geração de Massa Fake
* [x] Automação via Robot
* [x] Preenchimento da Aba Consultório
* [x] Navegação entre abas

---

## 🔮 Próximos Passos

* [ ] Dados Pessoais
* [ ] Endereço
* [ ] Financeiro
* [ ] Screenshots automáticos
* [ ] Logs estruturados
* [ ] Relatórios de execução
* [ ] Integração com Cucumber
* [ ] Massa de teste via JSON
* [ ] Pipeline CI/CD

---

## ⚠️ Observação

Este projeto possui fins educacionais e de estudo.

Foi criado para explorar técnicas de automação desktop em aplicações legadas onde ferramentas modernas de automação web não são aplicáveis.

---

## 👩‍💻 Autora

**Regina Azzi**

QA Analyst | Automação | RPA | Power Platform | IA

GitHub:
[https://github.com/Azzi77](https://github.com/Azzi77)

LinkedIn:
[https://www.linkedin.com/in/reginaazzi/](https://www.linkedin.com/in/reginaazzi/)

```


