# Assignment X —Title
<!-- Replace X and Title -->
Course: Desenvolvimento de Aplicações Móveis (DAM)

Student(s): Renata Cristina Conceição Góis

Date: 10/03/2026

Repository URL: https://github.com/Criss2712/DAM_TP1_AS_APP1

---

## 1. Introduction
<!-- Purpose of the assignment, problem description, and objectives. -->

No seguimento do primeiro trabalho prático, o presente repositório destina-se a apresentar a 
segunda aplicação Android desenvolvida no IDE Android Studio. A aplicação "SystemInfo" foi 
desenvolvida como um exercício de aprendizagem sobre o objeto `android.os.Build` no Android, 
com o objetivo de extrair e apresentar informações detalhadas sobre o dispositivo em execução.

## 2. System Overview
<!-- High-level description of the solution, main features, and use cases. -->

A aplicação apresenta um único ecrã contendo uma caixa de texto multilinha (`MultiLined Text Widget`) 
que exibe todas as informações relevantes do dispositivo Android.

## 3. Architecture and Design
<!-- Architecture, folder structure, design patterns, and justification of key
    decisions. -->

- `MainActivity.kt`: Ficheiro Kotlin com a lógica principal da aplicação
- `activity_main.xml`: Ficheiro com uma única componente `EditTex` correspondente ao Multilined Text
Widget.

## 4. Implementation
<!-- Implementation details: main modules, components, algorithms, and relevant code
    excerpts. -->

As informações do sistema são obtidas através da classe `android.os.Build` no onCreate 
da Activity. Para a apresentação das informações necessárias, foi criado um StringBuilder para
construir o texto a apresentar. O resultado é posteriormente atríbuido à componente presente no ficheiro
activity_main.xml.


## 5. Testing and Validation
<!-- Testing strategy, test cases, scenarios, edge cases, and known limitations. -->

O único testes realizado foi o verificar se as informações estavam a ser corretamente apresentadas.

## 6. Usage Instructions
<!-- How to run the project: requirements, setup, configuration, and execution steps.
    -->

Para se aceder ao projeto desenvolvido, terá que ter acesso a este repositório para posteriormente
conseguir abrir o projeto no IDE Android Studio e executa-lo num emulador. Neste projeto foi 
utilizado o dispositivo Pixel Pro 9.

---

# Development Process
## 12. Version Control and Commit History
<!-- Describe how version control was used. The commit history must reflect
    continuous work (not only final commits). -->

No momento em que se deu início ao desenvolvimento da aplicação, a aluna não se tinha apercebido de 
que também para as aplicações Android, era necessário um repositório, então devido a essa falha 
não existem muitos registos de controlo de versões.

## 13. Difficulties and Lessons Learned
<!-- Main challenges, mistakes, insights, and skills acquired during the assignment.
    -->
A maior dificuldade foi em perceber como utilizar o objeto android.os.Build, pois este tem muitas 
propriedades disponíveis. 

## 14. Future Improvements
<!-- Possible extensions, optimizations, or features that could be added in future
work. -->

Novamente, tudo pode ser melhorado. A apresentação poderia ser diferente e tudo poderia ser mais 
avançado, mas para uma primeira interação com este novo tema, realizou-se o que foi pedido.

---
## 15. AI Usage Disclosure (Mandatory)
<!-- List all AI tools used (e.g., ChatGPT, Copilot, etc.), how they were used, and
    confirmation that you remain responsible for all content. -->

- **LLM Utilizado:** DeepSeek.
- **Como foi Utilizado:** Para a realização de algumas secções do presente relatório e pesquisa rápida 
de informações sobre o objeto `android.os.Build`.
- **Responsabilidade:** Eu, aluna Renata Góis (A51038), sou totalmente responsável pelo conteúdo 
apresentado e submetido neste trabalho.