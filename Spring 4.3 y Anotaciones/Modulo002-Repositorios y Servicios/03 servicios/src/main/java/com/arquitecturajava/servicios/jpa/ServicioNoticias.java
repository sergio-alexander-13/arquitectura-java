package com.arquitecturajava.servicios.jpa;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.bo.Noticia;

public interface ServicioNoticias {

	Comentario findOneComentario(Integer k);

	Iterable<Comentario> findAllComentario();

	void saveComentario(Comentario tipo);

	void deleteComentario(Comentario tipo);

	Noticia findOneNoticia(String k);

	Iterable<Noticia> findAllNoticias();

	void saveNoticia(Noticia tipo);

	void deleteNoticia(Noticia tipo);

}