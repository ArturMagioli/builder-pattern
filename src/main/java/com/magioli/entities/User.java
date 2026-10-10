package com.magioli.entities;

import com.magioli.enums.Permissao;

public class User {

    private String nome;
    private String email;
    private boolean ativo;
    private Permissao permissao;
    private Curriculo curriculo; //opcional
    private String telefone; //opcional
    private Endereco endereco; //opcional

    //todos os campos
    public User(String nome, String email, Curriculo curriculo, boolean ativo, Permissao permissao, String telefone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.curriculo = curriculo;
        this.ativo = ativo;
        this.permissao = permissao;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // sem endereço
    public User(String nome, String email, Curriculo curriculo, boolean ativo, Permissao permissao, String telefone) {
        this.nome = nome;
        this.email = email;
        this.curriculo = curriculo;
        this.ativo = ativo;
        this.permissao = permissao;
        this.telefone = telefone;
    }

    //sem curriculo
    public User(String nome, String email, boolean ativo, Permissao permissao, String telefone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.permissao = permissao;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //sem curriculo e sem endereco
    public User(String nome, String email, boolean ativo, Permissao permissao, String telefone) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.permissao = permissao;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
