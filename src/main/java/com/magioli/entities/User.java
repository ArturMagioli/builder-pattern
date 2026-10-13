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

    public boolean podeCandidatar() {
        return ativo == true && getPermissao() == Permissao.CANDIDATO && curriculo != null;
    }

    public boolean presencial() {
        return ativo == true && getPermissao() == Permissao.CANDIDATO && endereco != null;
    }

    public static class UserBuilder {
        private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        private String nome;
        private String email;
        private boolean ativo;
        private Permissao permissao;
        private String telefone; //opcional
        private Curriculo curriculo; //opcional
        private Endereco endereco; //opcional

        public UserBuilder nome(String nome) {
            if (nome.isEmpty()) {
                throw new RuntimeException("O nome do usuário não deve ser vazio");
            }
            this.nome = nome;
            return this;
        }

        public UserBuilder email(String email) {
            if (email.isEmpty()) {
                throw new RuntimeException("O campo email deve ser preenchido");
            }
            if (!emailValido(email)) {
                throw new RuntimeException("O campo email está com formato inválido");
            }
            this.email = email;
            return this;
        }

        private boolean emailValido(String email) {
            return email.matches(EMAIL_REGEX);
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
