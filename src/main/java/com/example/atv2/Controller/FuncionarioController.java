package com.example.atv2.Controller;

import com.example.atv2.Entity.Funcionario;
import com.example.atv2.Service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService fs;

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Funcionario func) {
        fs.cadastrar(func);
        return "redirect:/funcionarios";
    }

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){

        ModelAndView mv = new ModelAndView("FuncionarioTemplate");

        mv.addObject("funcionarios", fs.getFuncionarios());

        return mv;
    }
}