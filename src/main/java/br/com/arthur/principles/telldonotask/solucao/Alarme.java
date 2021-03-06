package br.com.arthur.principles.telldonotask.solucao;


import java.time.LocalDate;

public class Alarme {
    private String nome;
    private LocalDate data;
    private LocalDate limite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
        if (data.isAfter(limite)) {
            avisa(this.nome + " muito longe!");
        }
    }

    public LocalDate getLimite() {
        return limite;
    }

    public void setLimite(LocalDate limite) {
        this.limite = limite;
    }

    public void avisa(String s) {
        System.out.println(s);
    }
}
