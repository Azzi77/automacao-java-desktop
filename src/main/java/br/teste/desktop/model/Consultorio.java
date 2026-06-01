package br.teste.desktop.model;


public class Consultorio {

    private String nome;
    private String cro;
    private String telefone;
    private String whatsapp;
    private String email;
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    public Consultorio(
            String nome,
            String cro,
            String telefone,
            String whatsapp,
            String email,
            String cep,
            String rua,
            String bairro,
            String cidade,
            String estado
    ) {

        this.nome = nome;
        this.cro = cro;
        this.telefone = telefone;
        this.whatsapp = whatsapp;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getCro() {
        return cro;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}