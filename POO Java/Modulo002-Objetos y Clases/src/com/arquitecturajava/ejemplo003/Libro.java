package com.arquitecturajava.ejemplo003;

public class Libro {

	private String titulo;
	private int totalPaginas;
	private int paginaActual;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPaginaActual() {
		return paginaActual;
	}
	
	public void avanzarPagina() {
		
		//incremento la pagina
		//pagina= pagina+1
		paginaActual++;
	}
	
	public void avanzarCapitulo() {
		
		paginaActual=paginaActual+20;
	}
	
	private void avanzarPagina(int paginas) {
		paginaActual= paginaActual+paginas;
	}
	
}
