## Project Java POO com modelagem UML

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Principais Tecnologias
- **Java 21**: Utilizamos a versão LTS do Java para tirar vantagem da últimas inovações que essa linguagem robusta e amplamente utilizada oferece;

Este repositório tem como objetivo apresentar conceitos essenciais da linguagem **Java**, utilizando a versão **Java 21**, com foco em **Programação Orientada a Objetos (POO)**. Também são abordados **diagramas de classes**, **polimorfismo** e **classes abstratas**, fundamentais para um bom design de software.

---

## ✅ Java 21 - O que há de novo?

A versão **Java 21** traz melhorias de performance, segurança e novas funcionalidades. Algumas das novidades incluem:

- **Pattern Matching** aprimorado (para `switch`, `instanceof`)
- **Records** para representar dados imutáveis
- **Sequenced Collections**
- **Virtual Threads** (preview) para melhor desempenho com concorrência
- **String Templates** (preview)

> ➕ A sintaxe continua familiar, mas cada nova versão melhora a produtividade e legibilidade do código.

---

## 🧱 POO (Programação Orientada a Objetos)

POO é um paradigma que organiza o código com base em **objetos**, que são instâncias de **classes**. Os quatro pilares da POO são:

1. **Abstração** – Representar conceitos do mundo real como classes
2. **Encapsulamento** – Proteger os dados internos com modificadores de acesso
3. **Herança** – Reutilizar código entre classes
4. **Polimorfismo** – Permitir que métodos se comportem de formas diferentes

---



## Diagrama de Classes

´```mermaid
classDiagram
  class User {
    +String name
    +Account account
    +List~Feature~ features
    +Card card
    +List~News~ news
  }

  class Account {
    +String number
    +String agency
    +float balance
    +float limit
  }

  class Feature {
    +String icon
    +String description
  }

  class Card {
    +String number
    +float limit
  }

  class News {
    +String icon
    +String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N"  Feature
  User "1" *-- "1" Card
  User "1" *-- "N"  News

  ```