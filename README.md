## Project Java POO com modelagem UML

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Principais Tecnologias
- **Java 21**: Utilizamos a versão LTS do Java para tirar vantagem da últimas inovações que essa linguagem robusta e amplamente utilizada oferece;

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies



## Diagrama de Classes

´´´mermaid
classDiagram
    class Dispositivo {
        <<abstract>>
        -String modelo
        -int armazenamento
        +getModelo() String
        +getArmazenamento() int
        +ligar() void
        +desligar() void
    }

    class iPhone {
        +iPhone(String modelo, int armazenamento)
        +ligar() void
        +desligar() void
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url) void
        +adicionarNovaAba(String url) void
        +atualizarPagina() void
    }

    Dispositivo <|-- iPhone
    ReprodutorMusical <|.. iPhone
    AparelhoTelefonico <|.. iPhone
    NavegadorInternet <|.. iPhone
    ´´´

