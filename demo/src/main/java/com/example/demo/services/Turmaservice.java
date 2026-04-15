package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Turma;

public class Turmaservice {
    
    
    @Autowired
    private TurmaRepositories pautaRepository;

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
            if(turma.getTurma()!=null){
                turmaRecuperada.setTurma(turma.getTurma());
            }
            return turmaRepository.save(turmaRecuperada);
        }
        return null;
    }


   
}

