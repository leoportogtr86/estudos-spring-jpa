package com.porto.estudosspringjpa.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "tb_alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_seq")
    @SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "nome_completo", length = 100)
    private String nome;
    private String email;
    private LocalDateTime dataNascimento;
    @ManyToMany(mappedBy = "alunos")
    private Set<Curso> cursos;

    public Aluno() {
    }

    public Aluno(Long id, String nome, String email, LocalDateTime dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

//1. **Criar uma entidade básica para `Aluno`**:
//- Crie uma entidade `Aluno` com os atributos
//`id`, `nome`, `email` e `dataNascimento`.

//2. **Customizar a tabela com `@Table`**:
//- Modifique a entidade `Aluno` para mapear a
//tabela com o nome `tb_alunos`.

//3. **Mapear atributos com `@Column`**:
//- Configure o atributo `nome` para que tenha o nome de coluna
//`nome_completo` e comprimento máximo de 100
//caracteres.

//4. **Definir chave primária com `@Id`**:
//- Adicione a anotação `@Id` ao campo
//`id` na entidade `Aluno`.

//5. **Usar `@GeneratedValue` com estratégia `SEQUENCE`**:
//- Configure o atributo `id` da entidade `Aluno` para usar
// uma sequência personalizada com `@SequenceGenerator`.

