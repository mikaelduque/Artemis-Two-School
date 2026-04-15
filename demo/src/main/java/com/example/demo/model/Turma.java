package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "turma")
    private String turma;

    @Column(name = "id_turma")
    private List<aluno> aluno;

    // construtor parametros
    public Turma() {
    }

    public Turma(Integer id, String turma, List<aluno> aluno) {
        this.id = id;
        this.turma = turma;
        this.aluno = aluno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return turma;
    }

    public void setNome(String turma) {
        this.turma = turma;
    }

    public List<aluno> getAlunos() {
        return aluno;
    }

    public void setalunos(List<aluno> alunos) {
        this.aluno = alunos;
    }

}
