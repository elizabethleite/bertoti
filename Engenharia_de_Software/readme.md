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
