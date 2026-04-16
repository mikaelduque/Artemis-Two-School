package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Turma;
import com.example.demo.repository.Turmarepository;

public class Turmaservice {
    
    
    @Autowired
    private Turmarepository turmaRepository;

    public Long contarturmas() {
        return turmaRepository.count();
    }

     public Turma buscarturma(Integer id){
        return turmaRepository.findById(id).get();
    } 

    public List<Turma> listarturmas(){
        return turmaRepository.findAll();
    }

    public Boolean deletarturma(Integer id){
        if (turmaRepository.existsById(id)) {
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Turma cadastrarturma(Turma turma){
        return turmaRepository.save(turma);
    }

    public Turma atualizarturma(Integer id, Turma turma){
        Turma turmaRecuperada = buscarturma(id);
        if (turmaRecuperada != null) {
            turmaRecuperada.setId(id);
            if(turma.getNome()!=null){
                turmaRecuperada.setNome(turma.getNome());
            }
            return turmaRepository.save(turmaRecuperada);
        }
        return null;
    }


   
}

