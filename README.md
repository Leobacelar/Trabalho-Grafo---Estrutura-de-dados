1. Classe Pessoa
Responsável por armazenar os dados de cada indivíduo.

Atributos:

id

nome

idade

infectado (boolean)

2. Classe Grafo
Responsável por construir e organizar as conexões.

Atributos e métodos:

Lista de pessoas.

Lista de adjacência.

adicionarPessoa()

adicionarContato()

exibirGrafo()

3. Classe Rastreamento
Responsável pela lógica de rastreamento.

Métodos:

buscarContatos()

rastrearTransmissao()

buscarPessoasConectadas()

Aqui podemos utilizar os algoritmos BFS e DFS.

4. Classe Main
Responsável por executar o programa.

Deverá apresentar um menu para o usuário interagir com o sistema.

5. Etapas para desenvolver o projeto
Sugiro seguir esta ordem:

Etapa 1 — Planejamento

Definir quais informações serão armazenadas e como as pessoas serão conectadas.

Etapa 2 — Criar a classe Pessoa

Desenvolver os atributos, construtor, getters e setters.

Etapa 3 — Implementar o Grafo

Criar a estrutura de vértices e arestas utilizando lista de adjacência.

Etapa 4 — Cadastrar contatos

Permitir que o usuário registre relações de contato entre pessoas.

Etapa 5 — Implementar o rastreamento

Utilizar BFS para localizar pessoas conectadas a um paciente diagnosticado.

Etapa 6 — Criar o menu interativo

Criar opções para cadastro, registro de contatos e rastreamento.

Etapa 7 — Realizar testes

Testar diferentes cenários, com pessoas infectadas, não infectadas e sem contatos.

Etapa 8 — Documentação

Explicar o funcionamento do grafo, os algoritmos utilizados e apresentar os resultados.

6. Como poderá ser o menu do programa?
Uma ideia para a interface no terminal:


text
================================
   SISTEMA DE RASTREAMENTO
================================

1 - Cadastrar pessoa
2 - Registrar contato
3 - Registrar diagnóstico
4 - Rastrear contatos de uma pessoa
5 - Exibir todas as conexões
6 - Listar pessoas cadastradas
0 - Sair

Escolha uma opção:
7. Exemplo de funcionamento esperado
Imagine que temos cinco pessoas cadastradas:

Pessoa

Diagnóstico

João

Positivo

Maria

Não diagnosticada

Pedro

Não diagnosticado

Ana

Não diagnosticada

Carlos

Não diagnosticado

Contatos registrados:

João teve contato com Maria.

Maria teve contato com Pedro.

João teve contato com Ana.

Ana teve contato com Carlos.

Ao selecionar a opção de rastreamento de João, o programa poderá apresentar:


text
================================
       RESULTADO DO RASTREIO
================================

Paciente de referência: João

Pessoas conectadas:

1 - Maria (1 nível de contato)
2 - Ana (1 nível de contato)
3 - Pedro (2 níveis de contato)
4 - Carlos (2 níveis de contato)

Total de pessoas na rede: 4
Esses resultados representam conexões registradas, não casos confirmados de infecção.

8. Sugestão de organização da entrega acadêmica
Se esse projeto for para uma disciplina de Algoritmos e Estruturas de Dados, sugiro organizar a apresentação assim:

Introdução: explicar o problema do rastreamento de doenças.

Objetivo: apresentar a finalidade do sistema.

Fundamentação teórica: explicar o conceito de grafos.

Desenvolvimento: apresentar as classes e os métodos Java.

Algoritmos: explicar BFS e DFS.

Testes: demonstrar exemplos de funcionamento.

Conclusão: mostrar como os grafos ajudaram a resolver o problema.
