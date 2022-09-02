"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

De acordo com Titus Winters, engenharia de software não é somente programação e existem 3 diferenças significativas que abordam isso. Um engenheiro de software deve se preocupar com a passagem do tempo e as eventuais necessidades de mudanças, bem como a escalabilidade e eficiência do programa. Portanto, é demandado desse profissional a tomada de decisões mais complexas e com alto risco, muitas vezes com estimativas imprecisas de tempo e crescimento do programa. Pode-se dizer então que programação é uma parte importante da engenharia de software, porém não é a única. 

##

# BIBLIOTECA

## Requisitos funcionais:

-	O bibliotecário pode cadastrar livros, inserindo título, autor, edição, volume, número de páginas e a que gênero textual ou área (exemplo: humanas) aquele livro é classificado;
-	O bibliotecário pode buscar um conjunto de livros passando para o sistema o área e número de páginas;
- O bibliotecário pode buscar 1 livro passando para o sistema o título, autor, edição e volume;
- O leitor pode reservar um livro de forma remota;
- O leitor pode renovar um livro de forma remota;

## Requisitos não-funcionais:

- O sistema deve ter escalabilidade avaliando a quantidade de leitores da biblioteca;
- Para realizar a renovação o usuário deve apresentar uma prova (em formato de arquivo JPEG) do estado atual do exemplar que deve ser enviada via Whatsapp para a biblioteca (através do programa deve-se poder acessar o Whatsapp);
- O sistema deve ser executado em plataforma web;
- O desenvolvimento do sistema deve ser feito em linguagem JAVA;
- A modelagem do banco de dados deve ser feita de modo a não permitir o cadastro do mesmo exemplar (avaliando-se todos os parâmetros citados acima), se houver mais de 1 exemplar, deve-se ter um campo para cadastro da quantidade);
- A tela inicial do produto deve ter 2 botões: "SOU BIBLIOTECÁRIO" e "SOU LEITOR";
- A segunda tela deve ter os campos para realizar o login do usuário;
- A terceira tela vai ser diferente para cada tipo de usuário (entre BIBLIOTECÁRIO e LEITOR);
- As telas de busca de exemplar (para o LEITOR) e de cadastro de exemplar (para o BIBLIOTECÁRIO), devem ser simples e intuitivas.

# DIAGRAMA UML

![DIAGRAMA UML](https://user-images.githubusercontent.com/101938881/188242190-a824aaa9-1c9b-4957-8838-d4e15c5f3992.jpeg)
