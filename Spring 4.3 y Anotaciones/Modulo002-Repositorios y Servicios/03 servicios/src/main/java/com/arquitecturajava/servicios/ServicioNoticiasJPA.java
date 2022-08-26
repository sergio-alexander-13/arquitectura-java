package com.arquitecturajava.servicios;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.ComentarioRepository;
import com.arquitecturajava.repositorios.NoticiaRepository;
import com.arquitecturajava.servicios.jpa.ServicioNoticias;

public class ServicioNoticiasJPA implements ServicioNoticias {

	
	private NoticiaRepository repositorioNoticias;
	private ComentarioRepository repositorioComentarios;
	
	
	public NoticiaRepository getRepositorioNoticias() {
		return repositorioNoticias;
	}
	public void setRepositorioNoticias(NoticiaRepository repositorioNoticias) {
		this.repositorioNoticias = repositorioNoticias;
	}
	public ComentarioRepository getRepositorioComentarios() {
		return repositorioComentarios;
	}
	public void setRepositorioComentarios(ComentarioRepository repositorioComentarios) {
		this.repositorioComentarios = repositorioComentarios;
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#findOneComentario(java.lang.Integer)
	 */
	public Comentario findOneComentario(Integer k) {
		return repositorioComentarios.findOne(k);
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#findAllComentario()
	 */
	public Iterable<Comentario> findAllComentario() {
		return repositorioComentarios.findAll();
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#saveComentario(com.arquitecturajava.bo.Comentario)
	 */
	public void saveComentario(Comentario tipo) {
		repositorioComentarios.save(tipo);
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#deleteComentario(com.arquitecturajava.bo.Comentario)
	 */
	public void deleteComentario(Comentario tipo) {
		repositorioComentarios.delete(tipo);
	}
	
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#findOneNoticia(java.lang.String)
	 */
	public Noticia findOneNoticia(String k) {
		return repositorioNoticias.findOne(k);
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#findAllNoticias()
	 */
	public Iterable<Noticia> findAllNoticias() {
		return repositorioNoticias.findAll();
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#saveNoticia(com.arquitecturajava.bo.Noticia)
	 */
	public void saveNoticia(Noticia tipo) {
		repositorioNoticias.save(tipo);
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#deleteNoticia(com.arquitecturajava.bo.Noticia)
	 */
	public void deleteNoticia(Noticia tipo) {
		repositorioNoticias.delete(tipo);
	}
	
	
	
	
	
}
