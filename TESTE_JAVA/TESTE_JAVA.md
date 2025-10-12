# 🧮 Avaliação Básica de Conhecimento em Java

Este repositório contém três exercícios desenvolvidos em **Java**, com o objetivo de avaliar o conhecimento em **lógica de programação** e **Java básico**.  
Todos os exercícios foram feitos para **execução via prompt de comando** (sem interface gráfica ou páginas HTML).

---

## 🧠 Objetivo da Avaliação

Avaliar a capacidade de:
- Manipular entradas e saídas via terminal;
- Utilizar estruturas de repetição e condicionais;
- Trabalhar com variáveis, listas e classes;
- Implementar cálculos e gerar relatórios simples.

---

## 📘 Exercício 1 — Cálculo de Custo de Combustível

**Descrição:**
Gabriel mora em uma cidade e trabalha em outra, mas notou que está gastando muito combustível para ir ao trabalho diariamente.  
Crie um programa que receba:

- 🚗 Distância da casa até o trabalho (em km);  
- ⛽ Média de consumo do veículo (km/litro);  
- 💰 Valor da gasolina (por litro);  
- 📅 Quantidade de dias que Gabriel trabalha no mês;

**Saída esperada:**  
O programa deve calcular e exibir o **custo total de combustível no mês**.

**Fórmula utilizada:**

Custo mensal = (Distância × 2 × Dias × ValorGasolina) / MédiaConsumo


---

## 🧍 Exercício 2 — Sistema de Cadastro do Clube Recreativo dos Pampas

**Descrição:**
O Clube Recreativo dos Pampas deseja realizar uma **atualização cadastral** de todos os seus associados.  
O sistema deve armazenar os seguintes dados para cada sócio:

- Nome  
- Número do associado  
- Sexo (Masculino ou Feminino)  
- Altura  
- Salário  
- Quantidade de filhos  

**Fluxo do programa:**
1. Perguntar quantos sócios participarão do senso (`N`);
2. Solicitar os dados de cada associado;
3. Após o cadastro, o usuário escolhe qual relatório deseja visualizar.

**Relatórios disponíveis:**
1. Lista de sócios (Nome, Sexo, Altura, Salário, Filhos);  
2. Média da altura dos associados;  
3. Total de dependentes;  
4. Quantidade de homens e mulheres, com representatividade em porcentagem;  
5. Maior salário e nome(s) de quem o recebe (caso mais de um tenha o mesmo valor);  
0. Encerra o programa.

---

## 🧾 Exercício 3 — Cadastro de Pessoas com Relatórios e IMC

**Descrição:**
Crie um programa que leia os seguintes dados para **N pessoas**:

- 🆔 ID  
- 👤 Nome  
- 🎂 Idade  
- 📏 Altura  
- ⚖️ Peso  

A leitura deve **encerrar quando o ID for igual a 0**, caso contrário, deve cadastrar uma nova pessoa.

Após o cadastro, o sistema deve exibir os seguintes relatórios:

### 🔢 Relatórios:
1. Pessoas em **ordem crescente de ID**;  
2. Pessoas em **ordem decrescente de IMC**;  
3. Pessoas em **ordem crescente de altura**;  
4. Exibir as **médias gerais**:
   - Idade média  
   - Altura média  
   - Peso médio  
   - IMC médio

**Cálculo do IMC:**

IMC = peso / (altura * altura)


**Exemplo de saída:**

Pessoas em ordem crescente de ID:
ID: 1 | Nome: João | Idade: 25 | Altura: 1.80 | Peso: 80.00 | IMC: 24.69
------------------------------------------
Pessoas em ordem decrescente por IMC:
Nome: Maria | IMC: 28.34
------------------------------------------
Pessoas em ordem crescente de altura:
Nome: João | Altura: 1.60 m
------------------------------------------
MÉDIAS GERAIS:
Idade média: 27.50 anos
Altura média: 1.70 m
Peso médio: 72.50 kg
IMC médio: 25.00


---

## 🧰 Tecnologias Utilizadas

- Linguagem: **Java 17+**
- IDE sugerida: **VS Code** ou **IntelliJ IDEA**
- Execução via: **Prompt de comando / Terminal**

---

## ▶️ Como Executar os Programas

1. **Clone o repositório:**
   bash
   git clone https://github.com/WesleyMenezes2108/Algoritimos_Logica_de_Programacao/tree/main/TESTE_JAVA
   

2. **Acesse a pasta do projeto:**
   bash
   cd avaliacao-java-basico
   ```

3. **Compile o programa desejado:**
   bash
   javac NomeDoArquivo.java
   

4. **Execute o programa:**
   bash
   java NomeDoArquivo
   

---

## 🧩 Estrutura do Repositório

```
📦 avaliacao-java-basico
 ┣ 📜 Exercicio1.java      → Cálculo de custo de combustível
 ┣ 📜 Exercicio2.java      → Cadastro do Clube Recreativo
 ┣ 📜 Exercicio3.java      → Cadastro de pessoas com IMC
 ┗ 📘 README.md            → Documentação do projeto
```

---

## 👨‍💻 Autor

**Desenvolvido por:** Wesley Menezes Santuches  
📧 E-mail: wesley.santuches@gmail.com  
📍 Projeto de avaliação de lógica e fundamentos de Java.
