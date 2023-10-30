## O padrão de projeto Composite

Resumo: é um padrão de projeto que permite compor objetos em estruturas de árvore e depois trabalhar com essas estruturas como se fossem objetos individuais. No código realizado, temos um exemplo de gerenciador de tarefas em um projeto, onde obtemos no executável como resposta a quantidade total em horas final do projeto, suportando a adicão e remoção de tarefas. De acordo com o modelo do padrão (estrutura "Client", "Component", "Leaf" e "Container"), nosso "Component" é representado pela interface "Tarefa" que tem como operação recolher o tempo estimado de cada tarefa. Já a folha ou "Leaf" é representada pela classe "TarefaSimples"e o "container" é representado pela classe "Projeto".

## Diagrama UML

