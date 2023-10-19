package br.com.cesed.unifacisa;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Emprestimo crefisa = new Crefisa();
        Emprestimo bv = new BVFinanceira();
        Emprestimo nubank = new Nubank();

        Banco banco = new Banco();
        banco.adicionarObservador(crefisa);
        banco.adicionarObservador(bv);
        banco.adicionarObservador(nubank);

        String nome = JOptionPane.showInputDialog("Nome:");
        double valor = Double.parseDouble((JOptionPane.showInputDialog("Valor:")));
        int prazo = Integer.parseInt(JOptionPane.showInputDialog("Prazo:"));

        banco.solicitarEmprestimo(nome, valor, prazo);
    }
}