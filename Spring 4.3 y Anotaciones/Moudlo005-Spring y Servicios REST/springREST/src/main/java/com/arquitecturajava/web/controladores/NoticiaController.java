package com.arquitecturajava.web.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arquitecturajava.bo.Noticia;
import com.arquitecturajava.servicios.ServicioNoticias;

@Controller
@RequestMapping("/noticias")
public class NoticiaController {

	@Autowired
	ServicioNoticias servicio;
	
	@RequestMapping("/lista")
	public String lista(Model modelo) {
		
		//envia a la vista es decir a la plantilla todas las noticias
		modelo.addAttribute("noticias", servicio.findAllNoticias());
		
		return "lista";
	}
	@RequestMapping("/formularioNuevaNoticia")
	public String formularioNuevoNoticia(Model modelo) {
		
		modelo.addAttribute(new Noticia());
		
		return "formularioNuevaNoticia";
		
		
	}
	// ya tenemos la noticia rellenada con los datos del formulario
	@RequestMapping(value="/insertarNoticia",method=RequestMethod.POST)
	public String insertarNoticia( @Valid @ModelAttribute Noticia noticia, BindingResult validacion, Model modelo) {
		if (validacion.hasErrors()) {
			
			return "formularioNuevaNoticia";
		}else {
			servicio.saveNoticia(noticia);
			modelo.addAttribute("noticias", servicio.findAllNoticias());
			
			return "lista";
		}
		
		
			
	}
	@RequestMapping("/borrarNoticia")
	public String borrarNoticia(@RequestParam("titulo") String titulo, Model modelo) {
		
		servicio.deleteNoticia(new Noticia(titulo));
		modelo.addAttribute("noticias", servicio.findAllNoticias());
		return "lista";
		
		
		
	}
	
	@RequestMapping("/listaOrdenadaTitulo")
	public String listaOrdenadaTitulo(Model modelo) {
		
		
		modelo.addAttribute("noticias", servicio.findAllNoticiasByOrderByTitulo());
		
		return "lista";
	}
	
	@RequestMapping("/listaOrdenadaAutor")
	public String listaOrdenadaAutor(Model modelo) {
		
		
		modelo.addAttribute("noticias", servicio.findAllNoticiasByOrderByAutor());
		
		return "lista";
	}
	
	
	@RequestMapping("/filtroNoticiasTitulo")
	public String filtroNoticiasTitulo(@RequestParam("titulo") String titulo,Model modelo) {
		
		
		modelo.addAttribute("noticias", servicio.findNoticiasTituloLike(titulo+"%"));
		
		return "lista";
	}
	
}
