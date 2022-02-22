package br.com.lojadesapatosonline.lojadesapatos.controller;

import br.com.lojadesapatosonline.lojadesapatos.form.CalculadoraForm;
import br.com.lojadesapatosonline.lojadesapatos.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @RequestMapping(value = "/calcular", method = RequestMethod.GET)
    public ModelAndView calculaValor (CalculadoraForm valor) throws IOException {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("urlContext", "http://localhost:8080");
        String fafa = calculadoraService.calculadora(valor);


        modelAndView.setViewName("resultado");
        return modelAndView;

    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("urlcontext", "http://localhost:8080");
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
