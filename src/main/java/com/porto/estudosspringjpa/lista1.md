### **Exercícios Práticos:**

1. **Criar uma entidade básica para `Aluno`**:
    - Crie uma entidade `Aluno` com os atributos `id`, `nome`, `email` e `dataNascimento`.

2. **Customizar a tabela com `@Table`**:
    - Modifique a entidade `Aluno` para mapear a tabela com o nome `tb_alunos`.

3. **Mapear atributos com `@Column`**:
    - Configure o atributo `nome` para que tenha o nome de coluna `nome_completo` e comprimento máximo de 100
      caracteres.

4. **Definir chave primária com `@Id`**:
    - Adicione a anotação `@Id` ao campo `id` na entidade `Aluno`.

5. **Usar `@GeneratedValue` com estratégia `SEQUENCE`**:
    - Configure o atributo `id` da entidade `Aluno` para usar uma sequência personalizada com `@SequenceGenerator`.

6. **Criar uma entidade `Curso` e estabelecer relacionamento @ManyToMany com `Aluno`**:
    - Crie a entidade `Curso` com os atributos `id` e `nome`, e estabeleça um relacionamento @ManyToMany com `Aluno` (um
      aluno pode estar matriculado em vários cursos e um curso pode ter vários alunos).

7. **Configurar a tabela de junção para o relacionamento @ManyToMany**:
    - Personalize o nome da tabela de junção entre `Aluno` e `Curso` para `matriculas`, usando a anotação `@JoinTable`.

8. **Criar uma entidade `Professor` e estabelecer relacionamento @OneToMany com `Curso`**:
    - Crie a entidade `Professor` com os atributos `id`, `nome` e `especialidade`, e estabeleça um relacionamento
      @OneToMany com `Curso` (um professor pode lecionar vários cursos).

9. **Utilizar `@JoinColumn` para definir a chave estrangeira em `Curso`**:
    - No relacionamento @ManyToOne em `Curso` com `Professor`, use `@JoinColumn` para especificar o nome da coluna de
      chave estrangeira `professor_id`.

10. **Criar um relacionamento @OneToOne entre `Professor` e `Departamento`**:
    - Crie a entidade `Departamento` com os atributos `id` e `nome`, e estabeleça um relacionamento @OneToOne
      com `Professor` (cada professor pertence a um departamento).

11. **Implementar herança de entidades com `@Inheritance`**:
    - Crie uma classe base `Pessoa` com atributos comuns (`id`, `nome`, `email`), e faça `Aluno` e `Professor` herdar
      de `Pessoa` usando a estratégia `JOINED`.

12. **Usar `@Embedded` para agrupar atributos de endereço**:
    - Crie uma classe `Endereco` com atributos `rua`, `cidade`, `estado`, `cep`, e incorpore em `Aluno` e `Professor`
      usando `@Embedded`.

13. **Definir colunas como `nullable=false` e `unique=true`**:
    - Configure o atributo `email` em `Pessoa` para ser obrigatório (`nullable=false`) e único (`unique=true`).

14. **Adicionar validação com `@Past` e `@NotNull`**:
    - Adicione `@NotNull` ao campo `dataNascimento` em `Aluno` e `@Past` para garantir que a data seja no passado.

15. **Escrever uma consulta JPQL para buscar alunos por curso**:
    - No repositório de `Aluno`, crie um método que retorna uma lista de alunos matriculados em um curso específico.

16. **Configurar `FetchType.LAZY` e `FetchType.EAGER` nos relacionamentos**:
    - Ajuste o relacionamento @ManyToMany entre `Aluno` e `Curso` para usar `FetchType.LAZY` e observe o comportamento
      ao carregar os dados.

17. **Utilizar `@MapsId` em um relacionamento composto**:
    - Crie uma entidade `Boletim` que utiliza uma chave composta formada pelo `id` do `Aluno` e do `Curso`, mapeando o
      relacionamento com `@MapsId`.

18. **Implementar o ciclo de vida de uma entidade com `@PrePersist` e `@PostLoad`**:
    - Na entidade `Aluno`, use os métodos anotados com `@PrePersist` e `@PostLoad` para executar ações antes de
      persistir e após carregar a entidade.

19. **Personalizar a geração de IDs com `UUID`**:
    - Altere o atributo `id` de `Aluno` para ser do tipo `UUID`, e configure a geração automática de UUIDs.

20. **Testar operações CRUD e transações**:
    - Crie testes que salvam, atualizam e removem instâncias de `Aluno` e `Curso`, verificando a integridade dos
      relacionamentos e o gerenciamento de transações.

---

Esses exercícios permitirão que você pratique o mapeamento de entidades e relacionamentos complexos em um contexto de
sistema escolar, reforçando os conceitos de `@Entity`, anotações de mapeamento e as melhores práticas do JPA.