package com.arquitecturajava.servicios.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.ComentarioRepository;
import com.arquitecturajava.repositorios.NoticiaRepository;
import com.arquitecturajava.servicios.ServicioNoticias;

@Service
public class ServicioNoticiasJPA implements ServicioNoticias {

	@Autowired
	private NoticiaRepository repositorioNoticias;
	@Autowired
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
	@Transactional
	public void saveComentario(Comentario tipo) {
		repositorioComentarios.save(tipo);
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#deleteComentario(com.arquitecturajava.bo.Comentario)
	 */
	@Transactional
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
	@Transactional
	public void saveNoticia(Noticia tipo) {
		repositorioNoticias.save(tipo);
	}
	/* (non-Javadoc)
	 * @see com.arquitecturajava.servicios.jpa.ServicioNoticias#deleteNoticia(com.arquitecturajava.bo.Noticia)
	 */
	
	@Transactional
	public void deleteNoticia(Noticia tipo) {
		repositorioNoticias.delete(tipo);
	}
	@Override
	public Iterable<Noticia> findAllNoticiasByOrderByTitulo() {
		// TODO Auto-generated method stub
		return repositorioNoticias.findAllByOrderByTitulo();
	}
	@Override
	public Iterable<Noticia> findAllNoticiasByOrderByAutor() {
		// TODO Auto-generated method stub
		return repositorioNoticias.findAllByOrderByAutor();
	}
	@Override
	public Iterable<Noticia> findNoticiasTituloLike(String titulo) {
		// TODO Auto-generated method stub
		return repositorioNoticias.findByTituloLike(titulo);
	}
	
	
	
	
	
}
