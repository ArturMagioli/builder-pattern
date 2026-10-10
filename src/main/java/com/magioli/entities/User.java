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

    public User(UserBuilder builder) {
        this.nome = builder.nome;
        this.email = builder.email;
        this.ativo = builder.ativo;
        this.permissao = builder.permissao;
        this.telefone = builder.telefone;
        this.curriculo = builder.curriculo;
        this.endereco = builder.endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
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

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public static class UserBuilder {
        private String nome;
        private String email;
        private boolean ativo;
        private Permissao permissao;
        private String telefone; //opcional
        private Curriculo curriculo; //opcional
        private Endereco endereco; //opcional

        public UserBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder ativo() {
            this.ativo = true;
            return this;
        }

        public UserBuilder inativo() {
            this.ativo = false;
            return this;
        }

        public UserBuilder comPermissao(Permissao permissao) {
            this.permissao = permissao;
            return this;
        }

        public UserBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public UserBuilder curriculo(Curriculo curriculo) {
            this.curriculo = curriculo;
            return this;
        }

        public UserBuilder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
