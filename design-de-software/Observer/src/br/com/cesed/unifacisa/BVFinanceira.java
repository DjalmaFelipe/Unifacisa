package br.com.cesed.unifacisa;

public class BVFinanceira implements Emprestimo {
    @Override
    public void atualizar(String nome, double valor, int prazo) {
        System.out.println("BV: Empréstimo aprovado para " + nome);
        System.out.println(prazo + " x " + String.format("%.2f",((valor/prazo)* 1.28)));
        System.out.println("Juros: 1.28% a.m");
    }
}