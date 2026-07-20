**Olá, eu sou Rafael F. de Santana**

**Sobre Mim e Minha Jornada**

Iniciei minha transição para a área de Programação em maio de 2026, mantendo um ritmo de estudos intensivo e focado em Engenharia de Software.
Busco alinhar minha base acadêmica à prática diária do mercado, desenvolvendo competências técnicas sólidas e aplicáveis ao ambiente profissional.


**Curso Técnico**

Iniciado em 02 de junho de 2026
- Desenvolvimento de Sistemas — SENAC EAD


**Estudos Intensivos (Alura)**
- Dedicação diária desde 16 de maio de 2026


**Foco Atual**

Atualmente, estou com aproximadamente 50% de conclusão da formação Aplicando a Orientação a Objetos, da Alura, internalizando conceitos fundamentais como classes, herança, polimorfismo e encapsulamento.

Minha meta é manter uma curva de aprendizado acelerada, sempre buscando aplicar os conhecimentos adquiridos em projetos práticos.


**Ao Espaço e Além!**

Este projeto foi desenvolvido com o objetivo de consolidar os conceitos de Programação Orientada a Objetos (POO) que venho estudando na Alura. Ele reflete minha capacidade de entrega rápida, aliada ao compromisso com a qualidade de software.
Ele é um jogo de RPG com temática espacial de perguntas e respostas.

**Linha do Tempo do Desenvolvimento**

Para garantir organização e foco, o projeto seguiu um cronograma rigoroso:

**12/06 a 14/06** — Desenvolvimento Core
- Criação da estrutura do projeto.
- Desenvolvimento da lógica principal.
- Implementação dos conceitos de POO.

**15/06 a 22/06** — Qualidade e Validação

Período dedicado exclusivamente à refatoração, correção de bugs e realização de testes, visando garantir a robustez, a legibilidade e a manutenibilidade da aplicação.

**• Refatoração**
- Separação das responsabilidades dos sistemas de exibição de mensagens e leitura de dados da classe GameHeart, transferindo essas funcionalidades para a classe Message e retornando as mensagens/textos para a classe GameHeart por meio de métodos.
Aplicação do princípio Don't Repeat Yourself (DRY) para reduzir a repetição de estruturas else na classe GameHeart.

**Bugs Encontrados**

**• Leitura de Dados**

- Problema: Dois leitores eram exibidos simultaneamente.
- Correção: Adição de um novo leitor para limpar o armazenamento temporário (buffer).

**• Perguntas após "Game Over"**

- Problema: As perguntas continuavam sendo exibidas mesmo após o jogador entrar em estado de "Game Over".
- Correção: Implementação de um método de verificação de vida antes da exibição de uma nova pergunta dentro do loop.

**• Controle de Loops**

- Problema: A pontuação diminuía até zero ou aumentava rapidamente de forma indevida.
- Correção: Adição de um recarregamento do leitor nos blocos else, permitindo a captura de uma nova entrada e evitando a reutilização repetitiva dos dados anteriormente inseridos.

**• Tratamento de Entrada de Dados**

- Problema: Inserção de letras em campos destinados ao recebimento de números.
- Correção: Utilização de try-catch para validar as entradas de dados e permitir apenas o tipo primitivo esperado.

**• Testes Realizados**

- Exibição correta das mensagens.
- Garantia de que os blocos de código fossem executados na ordem adequada.
- Funcionamento correto dos leitores de dados.
- Inserção de dados apenas nos métodos correspondentes.
- Armazenamento consistente dos dados sem alterações indevidas.
- Progressão adequada das etapas até o cumprimento dos requisitos.
- Recarregamento dos métodos em caso de entradas inválidas.

**• Conceitos Aplicados (Até o Momento)**
- Como estou atualmente em 50% da minha formação em Programação Orientada a Objetos, este projeto já implementa, na prática:

- Criação e organização de classes;
- Encapsulamento: proteção de dados sensíveis por meio de modificadores de acesso e métodos getters/setters;
- Collections (ArrayList): armazenamento e gerenciamento de dados de forma mais flexível e escalável.

**• Como jogar**
É um jogo rodado pelo terminal ou, se preferir, pelo prompt de comando.

- **1-** Baixe os arquivos deste repositório e abra na sua IDE.
- **2-** Se direcione para a Classe 'Main'.
- **3-** Clique no botão **Run** e faça a sua viagem espacial.
