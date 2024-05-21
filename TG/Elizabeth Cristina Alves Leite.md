# Olá, sou Elizabeth

Tenho 28 anos e atualmente sou estudante do curso de Banco de dados na FATEC Prof. Jessen Vidal. Aos 26 anos decidi realizar a transição de carreira para a área de tecnologia, trocando os béqueres e provetas por um computador, um mouse e um headset. Desde então venho me desafiando na área e trabalho atualmente como Service Desk, prestando suporte ao usuário a nível 1.

![image](https://github.com/elizabethleite/bertoti/assets/101938881/8ababa84-5796-47c4-952f-3002d58a6387)


# Meus Projetos

#### Projeto 1: 1º semestre de 2022
Trabalhei no projeto da API, inicialmente sem o Parceiro Acadêmico e desafio elaborado pelo professor Sabha.<br>  
Percebemos, cada vez mais, que a inteligência artificial é protagonista na área de TI e impulsiona a popularização da linguagem Python. No contexto acadêmico, uma assistente virtual com comando de voz em Python oferece uma ferramenta poderosa para facilitar o processo de aprendizagem e pesquisa. Com apenas o uso da voz, os estudantes podem acessar informações, realizar pesquisas, fazer anotações e até mesmo revisar conteúdos enquanto estão ocupados com outras atividades. Essa tecnologia proporciona uma experiência de estudo mais dinâmica e eficiente, permitindo que os alunos maximizem seu tempo e concentrem-se no entendimento do conteúdo, sem as limitações impostas pelo uso de dispositivos manuais. Assim, a utilização dessa assistente não apenas simplifica as tarefas acadêmicas, mas também promove a autonomia e a acessibilidade, tornando-se uma aliada valiosa para estudantes de todos os níveis de ensino.<br>
[link para o GIT](https://github.com/elizabethleite/BETA)

#### Tecnologias Utilizadas
Python, GitHub, Artificial intelligence, Reconhecimento de Voz

<details>
*Python: linguagem utilizada para desenvolvimento da aplicação.
*GitHub: para versionamento da aplicação.
</details>

## Contribuições Pessoais
Fui responsável pela task detalhada abaixo e contribui também para correção do código da funcionalidade Pomodoro.

#### Scraps
Implementei a funcionalidade "Scraps", permitindo aos usuários buscar informações sobre um livro e autor específicos. Utilizando a biblioteca Google e a função search, o programa gera um PDF contendo os 10 primeiros links dos resultados da pesquisa. Adicionei também a funcionalidade de voz para orientar os usuários durante a interação e notificá-los sobre a conclusão da geração do PDF.

<details>
A lógica de Scraps foi desenvolvida conforme abaixo e pode-se visualizar o que cada parte do código faz visualizando os comentários:

```PYTHON
elif 'livro' in comando:
            maquina.say('Estou pesquisando o livro que pediu')
            maquina.runAndWait()
            consulta = comando.replace('livro', '')
            try:
                from googlesearch import search
            except ImportError:
                print("Resultado não encontrado")
            X = []
            for j in search(consulta, tld="co.in", num=10, stop=10,
                            pause=2):  # Retorna um compilado dos 10 primeiros links que aparecem na pesquisa google
                X.append(j)  # Converte o compilado de links em lista para manipular sua posição no pdf
            print(X)

            def mm2p(milimetros):
                return milimetros / 0.352777  # converte pontos em milimetros

            cnv = canvas.Canvas('SUA_PESQUISA.pdf', pagesize=A4)  # Define o nome do arquivo pdf e o tamanho da página

            eixo = 250

            for i in range(0, 10):
                cnv.drawString(mm2p(20), mm2p(eixo), X[i])
                eixo -= 5  # colocado menos para os links aparecerem na ordem correta
            cnv.save()  # salva o pdf na pasta downloads do PC

            maquina.say('Foram pesquisados 10 links que estão salvos em pdf em sua pasta downloads')
            maquina.runAndWait()

    comando_voz_usuario()
```
</details>

#### Hard Skills Efetivamente Desenvolvidas

Python e manipulação das bibliotecas disponíveis para reconhecimento de voz e pesquisas nessa linguagem.

#### Soft Skills Efetivamente Desenvolvidas
Adaptabilidade<br>
Nesse projeto foi meu primeiro contato com a linguagem Python, então tive que aprender enquanto desenvolvia.

#### Projeto 2: 2º semestre de 2022
o uso de TI e bancos de dados no recrutamento não só melhora a eficiência e a precisão dos processos, mas também proporciona insights valiosos e assegura a segurança e conformidade das informações, contribuindo significativamente para o sucesso das estratégias de recrutamento das empresas. Nesse contexto, a proposta de solução desse projeto foi a criação de um sistema desktop no qual fosse possível cadastrar, excluir e editar vagas;  cadastrar usuários, aplicação da vaga pelo usuário e extração de relatórios. <br>
[link para o GIT](https://github.com/Thunder53/Pro4Tech)

#### Tecnologias Utilizadas
JAVA, MySQL, JAVA Swing 

<details>
*JAVA: linguagem para desenvolvimento da aplicação para back-end.
*MySQL: sistema de gerenciamento de banco de dados relacional utilizado para criação do banco de dados.
*JAVA Swing: toolkit para a criação de interfaces gráficas de usuário (GUI) em Java. Foi utilizado na aplicação para criação das interfaces desktop. 
</details>

## Contribuições Pessoais
Fui responsável pelas tasks detalhadas abaixo:

#### Criação de gráfico utilizando a biblioteca JFreeCharts
O trecho de código apresentado abaixo implementa uma aplicação Java Swing que se conecta a um banco de dados para extrair dados específicos relacionados a feedbacks pontuais dados pelo RH durante o processo de recrutamento. A aplicação utiliza esses dados para gerar um gráfico de barras tridimensional (3D) que visualiza os motivos de reprovação dos candidatos. A biblioteca JFreeChart é utilizada para a criação do gráfico.

<details>

```JAVA
public TelaGraficoRH() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Gráfico Feedback Pontual");
		setSize(1920, 1080);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
	}	
```
</details>


#### Conexão com o banco de dados
Implementei o código inicial de conexão com o banco de dados, no qual, inicia-se com a classe abstrata GenericData, que tem como objetivo fornecer uma estrutura genérica para realizar operações básicas de banco de dados (CRUD - Create, Read, Update, Delete) usando JDBC (Java Database Connectivity). Esta classe é projetada para ser estendida por outras classes específicas que necessitem de interação com um banco de dados relacional.

<details>
Um trecho do código pode ser visualizado abaixo:

```JAVA
public abstract class GenericData {
    private Connection connection;

    protected GenericData() {
        this.connection = Conexao.getConnection();
    }

    protected Connection getConnection() {
        return connection;
    }
```
As outras partes do código podem ser visualizadas no repositório do projeto, mas basicamente elas criam métodos para as operações principais de um banco de dados (save, update e delete) de acordo com os conhecimentos que tinha-se sobre a linguagem JAVA e banco de dados relacional.
</details>

#### Normalização do banco de dados
Realizei a normalização do modelo lógico utilizando como ferramenta o BRModelo online em conjunto com minha colega de equipe Marcela (que foi quem commitou a imagem do modelo no GitHub). O link do modelo direto na ferramenta utilizada pode ser visualizado abaixo:

[link para o BRMODELO](https://app.brmodeloweb.com/#!/publicview/664bd856969d1ee6150c2841)

<p align="center">
  01 - Modelo lógico do banco de dados apresentado no Projeto 2
</p>

![image](https://github.com/elizabethleite/bertoti/assets/101938881/d5ad85b5-f459-4c19-8d27-2f75c8eeb979)

#### Script SQL
Também em conjunto com a Marcela, realizei o script SQL definindo a estrutura de um banco de dados relacional para o sistema de recrutamento.

<details>
Um pequeno trecho do script pode ser visualizado abaixo:

```SQL
CREATE TABLE Vagas 
( 
 nome_vaga INT PRIMARY KEY,  
 responsavel VARCHAR(n),  
 requisitos VARCHAR(n),  
 carga_horaria INT,  
 salario FLOAT,  
 modelo VARCHAR(n),  
); 
```

O SGBD utilizado foi o MySQL, pois como foi o primeiro contato da nossa turma com um banco de dados, julgamos ser o banco de dados relacional mais simples de ser trabalhado, considerando que nesse semestre ainda estávamos aprendendo como realizar uma modelagem lógica; conceitual e normalização de um banco de dados.
</details>

#### Criação dos Wireframes
Realizei também os wireframes da aplicação utilizando o Figma. Wireframes proporcionam uma visualização clara e concisa da estrutura básica de uma página ou interface antes que o design detalhado seja implementado. Eles permitem que todos os envolvidos no projeto tenham uma compreensão comum do layout e da funcionalidade.  Além disso e talvez o mais importante é que ao apresentar wireframes, é possível obter feedback precoce de stakeholders e usuários finais, ajudando a identificar problemas e ajustar o design antes de investir tempo e recursos no desenvolvimento detalhado (implementação do código).

Um dos wireframes desenvolvidos, pode ser visualizado abaixo:

<p align="center">
  02 - Tela de cadastro de vagas
</p>

![image](https://github.com/elizabethleite/bertoti/assets/101938881/14c1ea76-e782-44a0-b64e-0494f88ea671)

#### Hard Skills Efetivamente Desenvolvidas
Utilização da linguagem JAVA para aplicações desktop, normalização de banco de dados e utilização do Figma para criação de wireframes. 

#### Soft Skills Efetivamente Desenvolvidas
Trabalho em Equipe<br>
Ainda assim, existem dúvidas a respeito de como a alta necessidade de integridade representa uma abertura para a melhoria dos equipamentos pré-especificados.

#### Projeto 3: 1º semestre de 2023
A Dom Rock é uma empresa que oferece soluções utilizando tecnologia de dados para ampliar resultados em marketing, vendas, distribuição, logística, operações, engenharia e finanças. O objetivo desse projeto é desenvolver um sistema web que atuaria como facilitador na entrada dos dados de predição de vendas de seus clientes, que inicialmente são recebidos em arquivo no formato csv, diminuindo o tempo gasto com a padronização. Além disso, lidar com o histórico de movimentação de produtos (vendas e estoque), predição de faturamento e a entrada de dados originados da força de vendas quanto ao planejamento futuro.<br>
[link para o GIT](https://github.com/Thunder53/Dom-Rock)

#### Tecnologias Utilizadas
Spring Boot, JAVA SE 20, JavaScript, PostgreSQL, Figma, HTML5, CSS3, Trello

<details>
*Spring Boot: framework para Java utilizado para facilitar a configuração e o gerenciamento das dependências do projeto.
*JAVA SE 20: linguagem para desenvolvimento da aplicação para back-end.
*JavaScript: linguagem para desenvolvimento da aplicação para front-end.
*PostgreSQL: SGBD para desenvolvimento do Banco de Dados.
*Figma: utilizado para construção dos wireframes.
*HTML5: utilizada para marcação e estruturação do conteúdo apresentado na aplicação web.
*CSS3: utilizado para estilizar e formatar o conteúdo de páginas web.
*Trello: ferramenta utilizada para a Gestão de Projetos utilizando a metodologia Scrum.
</details>


## Contribuições Pessoais
Fui responsável pelas tasks detalhadas abaixo:

#### Lógica de filtros no backend
Utilizando a linguagem JAVA, fiquei responsável por desenvolver filtros que permitiam ao administrador selecionar vendedores específicos e produtos específicos para visualizar seu desempenho ao longo do tempo. Houveram problemas com a lógica desses filtros e com o auxílio e trabalho em equipe com os colegas, consegui compreender meus erros para que das próximas vezes pudesse acertar.

<details>
O primeiro código desenvolvido para a lógica de filtros foi conforme abaixo:

```JAVA
package com.domrock.controller;

import com.domrock.dto.venda.VendaResponseDTO;
import com.domrock.repository.VendaRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/filtro")
public class FiltroController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/JANEIRO")
    public List<Map<String,Object>> getFiltroDataJaneiro() {
        List<Map<String, Object>> filtroDataJaneiro = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as JANEIRO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 1";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("JANEIRO", row.get("JANEIRO"));
            filtroDataJaneiro.add(venda);
        }
        return filtroDataJaneiro;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/FEVEREIRO")
    public List<Map<String,Object>> getFiltroDataFevereiro() {
        List<Map<String, Object>> filtroDataFevereiro = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as JANEIRO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 2";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("FEVEREIRO", row.get("FEVEREIRO"));
            filtroDataFevereiro.add(venda);
        }
        return filtroDataFevereiro;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/MARCO")
    public List<Map<String,Object>> getFiltroDataMarco() {
        List<Map<String, Object>> filtroDataMarco = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as MARCO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 3";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("MARCO", row.get("MARCO"));
            filtroDataMarco.add(venda);
        }
        return filtroDataMarco;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/ABRIL")
    public List<Map<String,Object>> getFiltroDataAbril() {
        List<Map<String, Object>> filtroDataAbril = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as ABRIL FROM venda v WHERE DATE_PART ('month', v.criada_em) = 4";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("ABRIL", row.get("ABRIL"));
            filtroDataAbril.add(venda);
        }
        return filtroDataAbril;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/MAIO")
    public List<Map<String,Object>> getFiltroDataMaio() {
        List<Map<String, Object>> filtroDataMaio = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as MAIO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 5";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("MAIO", row.get("MAIO"));
            filtroDataMaio.add(venda);
        }
        return filtroDataMaio;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/JUNHO")
    public List<Map<String,Object>> getFiltroDataJunho() {
        List<Map<String, Object>> filtroDataJunho = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as JUNHO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 6";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("JUNHO", row.get("JUNHO"));
            filtroDataJunho.add(venda);
        }
        return filtroDataJunho;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/JULHO")
    public List<Map<String,Object>> getFiltroDataJulho() {
        List<Map<String, Object>> filtroDataJulho = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as JULHO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 7";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("JULHO", row.get("JULHO"));
            filtroDataJulho.add(venda);
        }
        return filtroDataJulho;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/AGOSTO")
    public List<Map<String,Object>> getFiltroDataAgosto() {
        List<Map<String, Object>> filtroDataAgosto = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as AGOSTO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 8";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("AGOSTO", row.get("AGOSTO"));
            filtroDataAgosto.add(venda);
        }
        return filtroDataAgosto;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/SETEMBRO")
    public List<Map<String,Object>> getFiltroDataSetembro() {
        List<Map<String, Object>> filtroDataSetembro = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as SETEMBRO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 9";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("SETEMBRO", row.get("SETEMBRO"));
            filtroDataSetembro.add(venda);
        }
        return filtroDataSetembro;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/OUTUBRO")
    public List<Map<String,Object>> getFiltroDataOutubro() {
        List<Map<String, Object>> filtroDataOutubro = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as OUTUBRO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 10";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("OUTUBRO", row.get("OUTUBRO"));
            filtroDataOutubro.add(venda);
        }
        return filtroDataOutubro;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/NOVEMBRO")
    public List<Map<String,Object>> getFiltroDataNovembro() {
        List<Map<String, Object>> filtroDataNovembro = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as NOVEMBRO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 11";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("NOVEMBRO", row.get("NOVEMBRO"));
            filtroDataNovembro.add(venda);
        }
        return filtroDataNovembro;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/data/DEZEMBRO")
    public List<Map<String,Object>> getFiltroDataDezembro() {
        List<Map<String, Object>> filtroDataDezembro = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.criada_em as DEZEMBRO FROM venda v WHERE DATE_PART ('month', v.criada_em) = 12";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("criada_em", row.get("criada_em"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("NOVEMBRO", row.get("NOVEMBRO"));
            filtroDataDezembro.add(venda);
        }
        return filtroDataDezembro;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/produto")
    public List<Map<String,Object>> getFiltroProduto() {
        List<Map<String, Object>> filtroProduto = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, v.fk_produto_cod_produto, p.nome_produto, p.cod_produto\n" +
                "FROM venda v, produto p\n" +
                "WHERE v.fk_produto_cod_produto = p.cod_produto \n" +
                "LIMIT 10";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("fk_produto_cod_produto", row.get("fk_produto_cod_produto"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("nome_produto", row.get("nome_produto"));
            venda.put("cod_produto", row.get("cod_produto"));
            filtroProduto.add(venda);
        }
        return filtroProduto;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/vendedor")
    public List<Map<String,Object>> getFiltroVendedor() {
        List<Map<String, Object>> filtroVendedor = new ArrayList<>();
        String sql = "SELECT v.quant_estimada, v.quant_vendida, u.nome, v.fk_usuario_id FROM venda v, usuario u WHERE  v.fk_usuario_id = u.id LIMIT 10";


        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            Map<String, Object> venda = new HashMap<>();
            venda.put("fk_usuario_id", row.get("fk_usuario_id"));
            venda.put("quant_estimada", row.get("quant_estimada"));
            venda.put("quant_vendida", row.get("quant_vendida"));
            venda.put("nome_usuario", row.get("nome_usuario"));
            venda.put("filtro_vendedor", row.get("filtro_vendedor"));
            filtroVendedor.add(venda);
        }
        return filtroVendedor;
    }
    @CrossOrigin(origins = "http://localhost:5500")
    @RequestMapping(method = RequestMethod.OPTIONS)
    public void preflightResponse(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:5500");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type");
        response.setHeader("Access-Control-Allow-Methods", "POST, OPTIONS");
    }

}
```
No entanto, ele apresentava problemas na sua lógica e mesmo passando pelo teste no Insomnia, não estava retornando o que deveria, que eram os filtros por mês, vendedor e produto. A lógica no fim era bem mais simples e foi corrigido, conforme segue:

```JAVA
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filtro-produto/{fk_produto_cod_produto}")
    public List<VendaResponseDTO> filtroProduto(@PathVariable Long fk_produto_cod_produto) {
        List<Venda> vendas = repository.findByProduto(fk_produto_cod_produto);
        return vendas.stream().map(VendaResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filtro-vendedor/{fk_usuario_id}")
    public List<VendaResponseDTO> filtroVendedor(@PathVariable Long fk_usuario_id) {
        List<Venda> vendas = repository.findByVendedor(fk_usuario_id);
        return vendas.stream().map(VendaResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filtro-data/{mes}")
    public List<VendaResponseDTO> buscarVendasPorMes(@PathVariable int mes) {
        List<Venda> vendas = repository.findByCriadaEmMonth(mes);
        return vendas.stream().map(VendaResponseDTO::new).toList();
    }
```
Como nesse semestre, ainda não havíamos tido uma matéria específica sobre o springboot, considerei que obtive resultados satisfatórios, visto que não havia tido contato anterior com essa tecnologia e pude aprender com meus erros, conforme mencionado acima. 
</details>

#### UX/UI design inicial
Utilizando como ferramenta o figma, eu construi os primeiros protótipos "nocode" das telas. Conforme podem ser visualizados abaixo:

<details>
 ![image](https://github.com/elizabethleite/bertoti/assets/101938881/4bc8e31f-ccae-47d9-b1e3-9f2431dd5cdd)

Esses protótipos foram realizados nas primeiras semanas de projeto, então sofreram alterações ao longo das sprints.
</details>

#### CSS e HTML
Inicialmente eu não possuia nenhum conhecimento em HTML e nem CSS, no entanto, logo no início do projeto me foi atribuída a construção das páginas que eu havia criado no figma, as mesmas ainda não possuam a lógica (Javascript) nesse estágio inicial. 

<details>
O primeiro código HTML da tela desenvolvida está presente abaixo:

```HTML
<!DOCTYPE html>
<html lang="pt-br">
<head>

	<meta charset="UTF-8">

	<link rel="stylesheet" href="Login.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Lato:wght@900&display=swap" rel="stylesheet">


	<title>API 3BD - THUNDER TEAM</title>

</head>
<body>
	<div class="container">
	<!-- conteudo do site , nav cria menu-->
		<nav> 
			<div class="logo">
			<a href="index.html"><img scr="view/imagens/logoDomRock1.jpeg"></a>
			</div>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">Administrador</a></li>
				<li><a href="#">Vendedor</a></li>
				<li><a href="#">Dados</a></li>
				<li><a href="#">Gestor</a></li>


			</ul>
		</nav>
	</div>
</body>
</html>
```

No qual foi criado apenas a Nav bar da página. 

A estilização da página realizada em CSS, pode ser visualizada abaixo:

```CSS
@charset "UTF-8";

@import url('https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;1,100&display=swap')
*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Lato';
	font-weight: 700;
	font-size: 20px;
	line-height: 24px;
	color: #FFFFFF;
}
body{
	background-color: #000000;
}
nav.logo{
	position: absolute;
	width: 459px;
	height: 111px;
	left: 22px;
	top: 20px;
}
div.text-tx{


}
```
</details>

#### Jornada do usuário
Também utilizando o figma, eu construi a jornada do usuário em formato de fluxograma para que se tornasse mais claro o entendimento dos passos que precisariam ser seguidos para atingir o produto.

<details>
Foi a experiência mais próxima que obtive com o cargo de Product Owner e a jornada do usuário ficou conforme abaixo:

Sendo dividida em jornada do usuário do Admnistrador:

 ![image](https://github.com/elizabethleite/bertoti/assets/101938881/1b57eaa5-b936-42a9-b5d9-7a09922714cf)

E jornada do usuário do vendedor:

![image](https://github.com/elizabethleite/bertoti/assets/101938881/8b84f0a1-4679-4c40-be6c-b15cc7de22c0)
</details>

#### Hard Skills Efetivamente Desenvolvidas
Utilização de HTML e CSS no Front-end e UX/UI design inicial.

#### Soft Skills Efetivamente Desenvolvidas
Atenção aos detalhes<br>
No desenvolvimento da lógica dos filtros, na criação de protótipos no Figma, e na construção de páginas HTML/CSS, a atenção aos detalhes foi crucial para garantir que as funcionalidades e a interface do usuário fossem implementadas corretamente.

#### Projeto 4: 2º semestre de 2023
Em um cenário onde a paisagem urbana se compõe de uma mistura de edifícios modernos e históricos, a empresa Jaia, apresentou um desafio significativo. A condução de inspeções prediais estava provando ser uma tarefa morosa e suscetível a imprecisões. Diante desse cenário, a Jaia buscou soluções inovadoras para otimizar esse processo crucial. A visão estratégica da empresa contemplou o desenvolvimento de um software de inspeção predial, projetado para revolucionar a abordagem atual. A plataforma concebida promete oferecer uma experiência intuitiva, capacitando os inspetores a documentar minuciosamente detalhes relevantes e capturar evidências visuais de forma eficaz. Adicionalmente, a geração instantânea de relatórios abastecerá a tomada de decisões embasadas. A Jaia, reconhecendo a necessidade de aprimorar a qualidade e eficiência das inspeções, direcionou seus esforços para o desenvolvimento desse software inovador. O resultado obtido transcendeu as expectativas iniciais, beneficiando não somente a empresa, mas também elevando o padrão das inspeções prediais na esfera urbana, contribuindo, assim, para uma maior segurança e excelência nas estruturas urbanas.<br>
[link para o GIT](https://github.com/Data-Team23/Jaia)

#### Tecnologias Utilizadas
Java, JavaScript, Vue, HTML, CSS, Oracle SQL

<details>
*Java: linguagem para desenvolvimento da aplicação para back-end.
*JavaScript: linguagem para desenvolvimento da aplicação para front-end.
*Vue: framework JavaScript progressivo para a construção de interfaces de usuário.
*HTML5: utilizada para marcação e estruturação do conteúdo apresentado na aplicação web.
*CSS3: utilizado para estilizar e formatar o conteúdo de páginas web.
*Oracle SQL: SGBD para desenvolvimento do Banco de Dados.
</details>


## Contribuições Pessoais
Fui responsável pelas tasks detalhadas abaixo:

#### Manutenção dos wireframes
Realizado a criação dos wireframes das telas de gráficos utilizados na aplicação:

<p align="center">
  03 - Dashboard - Ordem de serviço
</p>

![image](https://github.com/elizabethleite/bertoti/assets/101938881/dba961b0-3843-4abb-9f65-ec4362516f04)


#### Criação da Landing Page
Tentou-se criar a Landing Page da aplicação, no entanto, devido ao framework Vue ainda estar em aprendizagem, teve-se dificuldade no desenvolvimento e o código criado ficou conforme abaixo:

<details>

```JS
<script setup lang="ts">
    import InputField from '@/components/InputField/InputField.vue';
    import InputButton from '@/components/Button/InputButton.vue';
    import SelectField from '@/components/Select/SelectField.vue';
    import { ref } from 'vue';
    const cnpjValue = ref("")
    const phoneValue = ref("")
    const nameValue = ref("")
    const planeValue = ref("")
    const addressValue = ref("")
    const options = [
        'Gold',
        'Silver',
        'Bronze'
    ]
    function createClient(){
        event?.preventDefault()
        const client = {
            cnpjValue: cnpjValue.value,
            phoneValue: phoneValue.value,
            nameValue: nameValue.value,
            planeValue: planeValue.value,
            addressValue: addressValue.value,
        }
        console.log(client)
    }
</script>
```
</details>

#### Hard Skills Efetivamente Desenvolvidas
Utilização do Spring Boot

#### Soft Skills Efetivamente Desenvolvidas
Persistência<br>
Durante o desenvolvimento deste projeto eu estava enfrentando alguns problemas de aprendizagem das matérias do semestre e pessoais, então mesmo entregando menos, me mantive no projeto.


## Meus Principais Conhecimentos

### Suporte ao usuário

Como service desk, atuo em demandas de reparos a nível 1 desde softwares de uso comum como o pacote office 365 (onedrive, outlook, PowerPoint, Excel, PowerBI) até softwares mais específicos para visualização de desenhos 2D e 3D. Além disso, direciono demandas para as equipes dos módulos do SAP e principalmente na transação su01 para que os usuários consigam realizar seu acesso no erp. 


### SQL 

Desde o segundo semestre da graduação, quando iniciaram-se os estudos relacionados a SGBDR (popularmente conhecidos como banco de dados), desenvolvi um apreço pela manipulação de dados, por consequencia foquei no aprendizado das principais operações (select, insert, update e delete). 


### HTML e CSS

Por estar sempre mais envolvida com o desenvolvimento do Frontend das aplicações do Projeto Integrador (chamado na FATEC de API), aprendi do zero, HTML, CSS e Javascript e muitas vezes fui responsável pela montagem de wireframes no Figma.

## Contatos
* [GIT](https://github.com/elizabethleite)
* [LinkedIn](https://www.linkedin.com/in/elizabeth-cristina-alves-leite-176a9416a?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app)
