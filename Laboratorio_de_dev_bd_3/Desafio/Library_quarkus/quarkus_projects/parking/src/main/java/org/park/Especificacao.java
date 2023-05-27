package org.park;

public class Especificacao {

	private String titulo;
	private String area;
	private String paginas;
	
	
	public Especificacao(String titulo, String area, String paginas){
		this.titulo = titulo;
		this.area = area;
		this.paginas = paginas;
		
	}

	public String getArea(){
		return area;
	}
	
	public String getPaginas(){
		return paginas;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	
	//delegacao da comparacao de area e paginas para a classe Especificacao, pois ela e a dona dos atributos
	public boolean comparar(Especificacao espec){
		if(titulo.equals(espec.titulo) && area.equals(espec.area) && paginas.equals(espec.paginas)){
			return true;
		} else {
			return false;
		}
	}
	
}
