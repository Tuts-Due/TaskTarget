# Projeto de Exercícios em Java

Este projeto contém a implementação de cinco exercícios em Java 17, organizados em um menu interativo. Cada exercício aborda um problema específico e pode ser executado individualmente.

## 📌 Tecnologias Utilizadas
- Java 17
- Maven
- Biblioteca Gson (para manipulação de JSON)

## 📂 Estrutura do Projeto
```
projeto-exercicios/
├── src/
│   ├── main/
│   │   ├── java/com/arthur/
│   │   │   ├── Main.java
│   │   │   ├── Exercicio1.java
│   │   │   ├── Exercicio2.java
│   │   │   ├── Exercicio3.java
│   │   │   ├── Exercicio4.java
│   │   │   ├── Exercicio5.java
│   │   ├── resources/
│   │   │   ├── faturamento.json
├── pom.xml
```

## 🚀 Como Executar o Projeto
### 1️⃣ Clonar o Repositório
```sh
git clone https://github.com/seu-usuario/projeto-exercicios.git
cd projeto-exercicios
```

### 2️⃣ Compilar e Executar
Se estiver utilizando **Maven**, rode:
```sh
mvn clean compile exec:java
```
Ou compile e execute manualmente:
```sh
javac -d out src/main/java/com/arthur/*.java
java -cp out com.arthur.Main
```

## 📜 Menu de Exercícios
Ao executar o programa, você verá um menu como este:
```sh
--- MENU DE EXERCÍCIOS ---
1 - Soma com índice
2 - Verificar Fibonacci
3 - Analisar Faturamento Diário
4 - Percentual de Faturamento por Estado
5 - Inverter String
0 - Sair
Escolha uma opção:
```

### 🔢 Exercício 1: Soma com Índice
Calcula a soma de números de 1 até um índice pré-definido.

### 🌀 Exercício 2: Verificar Fibonacci
Verifica se um número informado pertence à sequência de Fibonacci.

### 📊 Exercício 3: Analisar Faturamento Diário
- Lê um arquivo `faturamento.json`.
- Determina o menor e maior faturamento do mês.
- Calcula quantos dias tiveram faturamento acima da média.

#### 📌 Formato esperado do `faturamento.json`
```json
{
  "faturamento": [0, 1520.50, 3000.00, 0, 4500.75, ...]
}
```

### 📉 Exercício 4: Percentual de Faturamento por Estado
Calcula a porcentagem que cada estado representa no faturamento mensal.

### 🔄 Exercício 5: Inverter String
Solicita uma string ao usuário e exibe sua inversão sem usar funções prontas como `reverse()`.

## ⚠️ Requisitos
- Java 17 ou superior
- Maven (caso utilize `pom.xml` para dependências)

---

Feito por **Arthur Dué** 🚀

