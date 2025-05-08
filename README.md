# 📚 Calculadora Simples em Java

Este é um projeto simples de uma **calculadora de 4 operações** (adição, subtração, multiplicação e divisão) feito em **Java**, com foco em **boas práticas de programação** e no **uso de métodos**.

---

## ✅ Objetivo

Criar uma aplicação no terminal que:

- Recebe dois números do usuário
- Pergunta qual operação será realizada (+, -, * ou /)
- Exibe o resultado
- Usa **métodos separados** para cada operação

---

## 🛠️ Como funciona

O código está organizado em partes:

| Método        | Função                                      |
|---------------|---------------------------------------------|
| `somar`       | Retorna a soma de dois números              |
| `subtrair`    | Retorna a subtração                         |
| `multiplicar` | Retorna a multiplicação                     |
| `dividir`     | Retorna a divisão (com verificação de zero) |
| `lerNumero`   | Lê um número do usuário                     |
| `lerOperador` | Lê a operação escolhida pelo usuário        |
| `calcular`    | Chama o método correspondente à operação    |

---

## ▶️ Como executar

1. Certifique-se de ter o **Java instalado** na sua máquina.
2. Copie o conteúdo do arquivo `Calculadora.java` para seu editor (ex: IntelliJ, VS Code, NetBeans...).
3. Compile o arquivo:

```bash
javac Calculadora.java
