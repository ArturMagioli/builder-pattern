package com.magioli.entities;

import com.magioli.enums.Permissao;

public class User {

    private String nome;
    private String email;
    private boolean ativo;
    private Permissao permissao;
    private String telefone; //opcional
    private Curriculo curriculo; //opcional
    private Endereco endereco; //opcional

}
