package br.com.arthur.principles.designpatterns.chainofresponsibility.problema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
    private final double valor;
    private final List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
}
