package org.park;


import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Model {
	
	private List<Livro> livros = new LinkedList<Livro>();

	public Model() {
		addLivro(new Livro("Harry Potter: A Pedra Filosofal", new Especificacao("fantasia", "263", "2")));
		addLivro(new Livro("A Interpretação dos Sonhos", new Especificacao("filosofia", "400", "3")));
		addLivro(new Livro("Memórias Póstumas de Brás Cubas", new Especificacao("literatura brasileira", "212", "4")));
	}
	
	public void addLivro(Livro livro){
		livros.add(livro);
	}
	
	public List<Livro> buscarTitulo(String titulo){
		List<Livro> livrosEncontrados = new ArrayList<>();
		
		for(Livro livro:livros){
			if(livro.getTitulo().equals(titulo)) {
				livrosEncontrados.add(livro);
			}
		}
		
		return livrosEncontrados;
	}
	
	
	public List<Livro> buscarEspecificacao(Especificacao esp){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		
		for(Livro livro:livros){
			 if(esp.comparar(livro.getEspc())) livrosEncontrados.add(livro);
		}
		
		return livrosEncontrados;
		
	}
	
	
	public List<Livro> buscarArea(String area){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro:livros) {
			if(livro.getEspc().getArea().equals(area)) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}

}
