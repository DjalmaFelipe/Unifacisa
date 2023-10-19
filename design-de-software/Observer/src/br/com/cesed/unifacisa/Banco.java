package br.com.cesed.unifacisa;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Emprestimo> observadores = new ArrayList<>();

    public void adicionarObservador(Emprestimo observador) {
        observadores.add(observador);
    }

    public void solicitarEmprestimo(String nome, double valor, int prazo) {
        for (Emprestimo observador : observadores) {
            observador.atualizar(nome, valor, prazo);
        }
    }
}
