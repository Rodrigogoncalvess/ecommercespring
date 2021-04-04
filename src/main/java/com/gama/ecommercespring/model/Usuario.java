package com.gama.ecommercespring.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message ="Campo não pode ser nulo")
    @NotEmpty(message = "Campo não pode ser vazio")
    @Max(80)
    private String nome;

    @NotEmpty(message = "Campo não pode ser vazio")
    @Max(11)
    private String cpf;

    @NotEmpty(message = "Campo não pode ser vazio")
    @Size(min = 5, max =10)
    private String login;

    @NotEmpty(message = "Campo não pode ser vazio")
    private String senha;

}
