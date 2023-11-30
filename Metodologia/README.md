# Elizabeth Cristina Alves Leite

## Introdução 

Oi! Tudo bem ? Meu nome é Elizabeth Cristina Alves Leite, tenho 28 anos e atualmente sou estudante do quarto semestre de Banco de dados na FATEC Prof. Jessen Vidal. 
Aos 25 anos decidi realizar a transição de carreira para a área de tecnologia, trocando os béqueres e provetas por um computador, um mouse e um headset.
Desde então venho me desafiando na área e trabalho atualmente como Service Desk, prestando suporte ao usuário a nível 1.

![WhatsApp Image 2023-11-09 at 21 17 27](https://github.com/elizabethleite/bertoti/assets/101938881/e03a1ed3-ec94-47e5-8ca8-f5dcf8bad71a)


## Meus principais conhecimentos 

### Suporte ao usuário

Como service desk, atuo em demandas de reparos a nível 1 desde softwares de uso comum como o pacote office 365 (onedrive, outlook, PowerPoint, Excel, PowerBI) até softwares mais específicos para visualização de desenhos 2D e 3D. Além disso, direciono demandas para as equipes dos módulos do SAP e principalmente na transação su01 para que os usuários consigam realizar seu acesso no erp. 


### SQL 

Desde o segundo semestre da graduação, quando iniciaram-se os estudos relacionados a SGBDR (popularmente conhecidos como banco de dados), desenvolvi um apreço pela manipulação de dados, por consequencia foquei no aprendizado das principais operações (select, insert, update e delete). 


### HTML e CSS

Por estar sempre mais envolvida com o desenvolvimento do Frontend das aplicações do Projeto Integrador (chamado na FATEC de API), aprendi do zero, HTML, CSS e Javascript e muitas vezes fui responsável pela montagem de wireframes no Figma.


## Projeto 3: 1º semestre de 2023


### Parceiro acadêmico:

[(![logo dom rock](https://github.com/elizabethleite/bertoti/assets/101938881/47e182fd-a289-4b24-9ac1-92ff282c5cc1)
)](https://www.domrock.net/)

A Dom Rock é uma empresa que oferece soluções utilizando tecnologia de dados para ampliar resultados em marketing, vendas, distribuição, logística, operações, engenharia e finanças. Para saber mais sobre a empresa é só clicar logo acima que direciona para o site oficial. 


### Visão do Projeto

Desenvolver um sistema web que atuaria como facilitador na entrada dos dados de predição de vendas de seus clientes, que inicialmente são recebidos em arquivo no formato csv, diminuindo o tempo gasto com a padronização. Além disso, lidar com o histórico de movimentação de produtos (vendas e estoque), predição de faturamento e a entrada de dados originados da força de vendas quanto ao planejamento futuro.

### Tecnologias utilizadas

* Spring Boot: framework para Java utilizado para facilitar a configuração e o gerenciamento das dependências do projeto.

* JAVA SE 20: linguagem para desenvolvimento da aplicação para back-end.

* JavaScript: linguagem para desenvolvimento da aplicação para front-end.

* PostgreSQL: SGBD para desenvolvimento do Banco de Dados.

* Figma: utilizado para construção dos wireframes.

* HTML5: utilizada para marcação e estruturação do conteúdo apresentado na aplicação web.

* CSS3: utilizado para estilizar e formatar o conteúdo de páginas web.

* Trello: ferramenta utilizada para a Gestão de Projetos utilizando a metodologia Scrum.


### Contribuições pessoais

Fui responsável pelas tasks detalhadas abaixo:

#### Lógica de filtros no backend

<details>
Utilizando a linguagem JAVA, fiquei responsável por desenvolver filtros que permitiam ao administrador selecionar vendedores específicos e produtos específicos para visualizar seu desempenho ao longo do tempo. Houveram problemas com a lógica desses filtros e com o auxílio e trabalho em equipe com os colegas, consegui compreender meus erros para que das próximas vezes pudesse acertar.

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

<details>
Utilizando como ferramenta o figma, eu construi os primeiros protótipos "nocode" das telas. Conforme podem ser visualizados abaixo:

 ![image](https://github.com/elizabethleite/bertoti/assets/101938881/4bc8e31f-ccae-47d9-b1e3-9f2431dd5cdd)

Esses protótipos foram realizados nas primeiras semanas de projeto, então sofreram alterações ao longo das sprints.
</details>

#### CSS e HTML

<details>
Inicialmente eu não possuia nenhum conhecimento em HTML e nem CSS, no entanto, logo no início do projeto me foi atribuída a construção das páginas que eu havia criado no figma, as mesmas ainda não possuam a lógica (Javascript) nesse estágio inicial. 

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

<details>
Também utilizando o figma, eu construi a jornada do usuário em formato de fluxograma para que se tornasse mais claro o entendimento dos passos que precisariam ser seguidos para atingir o produto. Foi a experiência mais próxima que obtive com o cargo de Product Owner e a jornada do usuário ficou conforme abaixo:

Sendo dividida em jornada do usuário do Admnistrador:

 ![image](https://github.com/elizabethleite/bertoti/assets/101938881/1b57eaa5-b936-42a9-b5d9-7a09922714cf)

E jornada do usuário do vendedor:

![image](https://github.com/elizabethleite/bertoti/assets/101938881/8b84f0a1-4679-4c40-be6c-b15cc7de22c0)
</details>

### Aprendizados efetivos

* HTML e CSS : Sei fazer com algumas consultas.

<details>
Neste projeto tive meu primeiro contato com HTML e CSS, pois nunca havia estudado esses recursos antes e pude compreender melhor como funciona uma página web, onde no HTML são inseridos os códigos para criação de tudo que deverá estar estruturado e formatado na página, como os textos e os elementos que a mesma deverá conter (caixa de texto, botões de opção ou caixas de seleção). Já o CSS, é a estilização da página, ou seja, nele que são inseridas as marcações de espaço (normalmente em pixels ou em porcentagem) dos elementos da página.
</details>

* UX/UI design inicial: sei fazer com autonomia.

<details>
Assim como no projeto do primeiro semestre, eu desenvolvi os primeiros protótipos das telas utilizando o Figma que é uma poderosa ferramenta de design de interface do usuário (UI) e experiência do usuário (UX) baseada na nuvem. Ele é usado para criar protótipos, designs de aplicativos, sites e outras interfaces de usuário, uma das características mais distintivas do Figma é sua capacidade de permitir que várias pessoas colaborem simultaneamente em um projeto (por conta da tecnologia em nuvem). Isso também atua como facilitador, já que não há necessidade de instalação de software e toda a equipe consegue trabalhar na ferramenta online e ao mesmo tempo. O Figma ainda oferece controles de permissão granulares, permitindo que os proprietários do projeto controlem quem pode visualizar, editar ou comentar em um projeto.
</details>



