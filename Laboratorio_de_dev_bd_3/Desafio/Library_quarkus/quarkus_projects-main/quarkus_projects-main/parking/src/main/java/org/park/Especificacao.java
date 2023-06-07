package org.park;

public class Especificacao {

	
	private String area;
	private String pagina;
	private String volume;
	
	
	public Especificacao(String area, String pagina, String volume){
		this.area = area;
		this.pagina = pagina;
		this.volume = volume;
	}
	
	public String getArea(){
		return area;
	}
	
	public String getPagina(){
		return pagina;
	}
	
	public String getVolume(){
		return volume;
	}
	
	
	public boolean comparar(Especificacao esp){
		if(area.equals(esp.area) && pagina.equals(esp.pagina) && volume.equals(esp.volume)){
			return true;
		} else {
			return false;
		}
	}
	
}
