package br.com.alunoonline.Entity;

import jakarta.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id:

    private String nome;

    private String email;

    private String cpf;

}
