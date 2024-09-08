package com.porto.estudosspringjpa.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "matriculas",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private Set<Aluno> alunos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

//6. **Criar uma entidade `Curso` e estabelecer relacionamento
// @ManyToMany com `Aluno`**:
//- Crie a entidade `Curso` com os atributos `id` e `nome`,
// e estabeleça um relacionamento @ManyToMany com `Aluno` (um
//aluno pode estar matriculado em vários cursos e um curso pode ter vários alunos).
