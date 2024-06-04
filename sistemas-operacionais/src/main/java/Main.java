public class Main {
    public static void main(String[] args) {

        Escalonador escalonador = new Escalonador(Escalonador.Algoritmo.FCFS, 3);
        CPU cpu = new CPU(escalonador);

        escalonador.adicionarProcesso(new Processo(1, 10));
        escalonador.adicionarProcesso(new Processo(2, 30));
        escalonador.adicionarProcesso(new Processo(3, 25));

        cpu.iniciar();
    }
}