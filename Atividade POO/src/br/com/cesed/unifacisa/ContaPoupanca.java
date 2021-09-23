package br.com.cesed.unifacisa;
//final na classe
public final class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, String titular) {
        super(agencia, titular);
    }

    //sobrescrita do metodo
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }
    //sobrescrita do metodo
    @Override
    public void sacar(double valor) {
        if (getValorLimite() <= 0 || getSaldo() < valor) {
            System.out.println("você está a caminho do serasa ou está muito rico mas o caixa não permite " +
                    "solicitações acima de 1000,00 R$!");
        } else {
            setSaldo(getSaldo() - valor);
            setvalorLimite(valor);
        }
    }

}