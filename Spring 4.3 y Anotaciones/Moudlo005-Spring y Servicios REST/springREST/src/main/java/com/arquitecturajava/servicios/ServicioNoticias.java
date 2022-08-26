package com.arquitecturajava.servicios;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.repositorios.ComentarioRepository;
import com.arquitecturajava.repositorios.NoticiaRepository;

public interface ServicioNoticias {

	Comentario findOneComentario(Integer k);

	Iterable<Comentario> findAllComentario();

	void saveComentario(Comentario tipo);

	void deleteComentario(Comentario tipo);

	Noticia findOneNoticia(String k);

	Iterable<Noticia> findAllNoticias();

	void saveNoticia(Noticia tipo);

	void deleteNoticia(Noticia tipo);

	NoticiaRepository getRepositorioNoticias();

	void setRepositorioNoticias(NoticiaRepository repositorioNoticias);

	ComentarioRepository getRepositorioComentarios();

	void setRepositorioComentarios(ComentarioRepository repositorioComentarios);
	
	public Iterable<Noticia> findAllNoticiasByOrderByTitulo();
	public Iterable<Noticia> findAllNoticiasByOrderByAutor();
	public Iterable<Noticia> findNoticiasTituloLike(String titulo);

}