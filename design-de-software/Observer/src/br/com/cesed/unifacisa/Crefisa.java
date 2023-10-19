package br.com.cesed.unifacisa;

public class Crefisa implements Emprestimo {
    @Override
    public void atualizar(String nome, double valor, int prazo) {
        System.out.println("Crefisa: Empréstimo aprovado para " + nome);
        System.out.println(prazo + " x " + String.format("%.2f",((valor/prazo)* 1.3)));
        System.out.println("Juros: 1.3% a.m");
    }
}
