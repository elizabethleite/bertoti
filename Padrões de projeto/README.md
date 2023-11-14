# PADRÕES DE PROJETOS

Repositório dedicado a entrega das atividades da disciplina de "Padrões de projetos" do quarto semestre do curso de banco de dados da FATEC SJC, ministrado pelo professor Giuliano Bertoti.

#Tabela relacionando os padrões estudados

|Nome do padrão|     Anti Padrão       |          Definição                                        | Problema que resolve     | Exemplo de Aplicação |
|--------------|-----------------------|-----------------------------------------------------------|--------------------------|----------------------|
| Strategy     | Herança               | encapsula uma família de algoritmos (tira o que varia)    | repetição de código      | Composable           |   
|              |                       | e a torna intercambiável usando polimorfismo              |                          |                      | 
|              |                       |                                                           |                          |                      |
| Observer     | Dependência Excessiva | define uma relação de um para muitos entre objetos, de    | dependência rígida       | java.util.Observable | 
|              |                       | modo que quando um objeto muda de estado, todos os seus   | entre objetos            |                      |
|              |                       | dependentes são notificados e atualizados automaticamente |                          |                      |   
|              |                       |                                                           |                          |                      |                                                         
| Composite    | Má Gestão de Tipos    | permite que você componha objetos em estruturas de        | complexidade hierárquica | HTML DOM e CSS       |     
|              |                       | árvores e então trabalhe com essas estruturas como se     |                          |                      |             
|              |                       | elas fossem objetos individuais.                          |                          |                      | 
|              |                       |                                                           |                          |                      |  
| Facade       | Interface Monolítica  | fornece uma interface simplificada para qualquer conjunto | complexidade             | Flask (Framework Web | 
|              |                       | complexo de classes.                                      | excessiva                | em Python)           |
|              |                       |                                                           |                          |                      |
| Singleton    | Singleton Abusivo     | permite a você garantir que uma classe tenha apenas uma   | quando você precisa de   | System.Runtime.      |
|              |                       | instância, enquanto provê um ponto de acesso global para  | um controle mais estrito | Caching.MemoryCache  |
|              |                       | essa instância.                                           | sobre as variáveis       | em C#                |    
|              |                       |                                                           | globais                  |                      |
|              |                       |                                                           |                          |                      |
