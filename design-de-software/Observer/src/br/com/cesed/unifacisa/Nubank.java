package br.com.cesed.unifacisa;

public class Nubank implements Emprestimo {
    @Override
    public void atualizar(String nome, double valor, int prazo) {
        System.out.println("Nubank: Empréstimo aprovado para " + nome);
        System.out.println(prazo + " x " + String.format("%.2f",((valor/prazo)* 1.02)));
        System.out.println("Juros: 1.02% a.m");
    }
}
