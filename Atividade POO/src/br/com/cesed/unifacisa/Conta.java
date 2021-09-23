package br.com.cesed.unifacisa;
//classe com conceito de abstract
public abstract class Conta {
    private int agencia;
    /**
     * uso do static, variavel soma um sempre q um novo objeto é instanciado,
     * criando a lógica de numeração das contas.
     */
    private static int conta = 1;
    private String titular;
    //final na variavel
    private final double LIMITE = 1000.00;
    private double saldo;
    private double valorLimite = LIMITE;

    //criação dos metodos solicitados, aplicando o conceito de abstract
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    //final em metodos
    public final void setvalorLimite(double valor){
    this.valorLimite = valorLimite - valor;
    }

    public Conta(int agencia, String titular){
        this.agencia = agencia;
        this.titular = titular;
        conta++;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public static int getConta() {
        return conta;
    }

    public static void setConta(int conta) {
        Conta.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLIMITE() {
        return LIMITE;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorLimite() {
        return valorLimite;
    }

}
