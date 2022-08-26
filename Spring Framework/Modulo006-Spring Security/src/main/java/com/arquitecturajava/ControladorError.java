package com.arquitecturajava;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControladorError {

	@ExceptionHandler(Exception.class)
    public ModelAndView handle(Exception ex) {

        ModelAndView mv = new ModelAndView();
      
        mv.setViewName("error");

        return mv;
    }
}
