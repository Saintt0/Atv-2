package com.example.atv2.Service;

import java.util.List;

import com.example.atv2.Entity.Funcionario;
import com.example.atv2.Repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository fr;

    public void cadastrar(Funcionario func) {
        fr.save(func);
    }

    public List<Funcionario> getFuncionarios(){
        return fr.findAll();
    }

}