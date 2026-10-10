package com.magioli.entities;

public class Curriculo {

    private String resumoProfissional;
    private String habilidades;
    private String linkedinUrl;
    private String githubUrl;

    public Curriculo(String githubUrl, String linkedinUrl, String habilidades, String resumoProfissional) {
        this.githubUrl = githubUrl;
        this.linkedinUrl = linkedinUrl;
        this.habilidades = habilidades;
        this.resumoProfissional = resumoProfissional;
    }

    public String getResumoProfissional() {
        return resumoProfissional;
    }

    public void setResumoProfissional(String resumoProfissional) {
        this.resumoProfissional = resumoProfissional;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
}
