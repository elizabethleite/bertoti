package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Livro> livros = new LinkedList<Livro>();

	public Model() {
		addLivro(new Livro("22", new Especificacao("A Interpretação dos Sonhos", "filosofia", "400")));
		addLivro(new Livro("25", new Especificacao("Memórias Póstumas de Brás Cubas", "literatura brasileira", "212")));
	}
	
	public void addLivro(Livro livro){
		livros.add(livro);
	}
	
	public Livro buscarTitulo(String titulo){
		for(Livro livro:livros){
			if(livro.getCodigo().equals(titulo)) return livro;
		}
		
		return null;
	}
	
	
	public List<Livro> buscarEspecificacao(Especificacao espec){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		
		for(Livro livro:livros){
			 if(espec.comparar(livro.getEspec())) livrosEncontrados.add(livro);
		}
		
		return livrosEncontrados;
		
	}
	
	public List<Livro> buscarArea(String area){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro:livros) {
			if(livro.getEspec().getArea().equals(area)) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}

}
