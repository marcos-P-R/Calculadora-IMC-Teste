package org.marcos.pessoa;

public class Pessoa {
    private String nome;
    private Double peso;
    private Double altura;

    public Pessoa(String nome, Double peso, Double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

}
