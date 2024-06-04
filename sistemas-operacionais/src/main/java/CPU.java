import java.util.Random;

public class CPU {
    private Escalonador escalonador;
    private Random random;
    private Processo processoAtual;

    public CPU(Escalonador escalonador) {
        this.escalonador = escalonador;
        this.random = new Random();
    }

    public void iniciar() {
        while (true) {
            int ciclosInterrupcao = 1 + random.nextInt(5);

            for (int i = 0; i < ciclosInterrupcao; i++) {
                if (processoAtual == null || processoAtual.isFinalizado()) {
                    processoAtual = escalonador.obterProximoProcesso();
                }

                if (processoAtual != null) {
                    processoAtual.executarInstrucao();
                    System.out.println("processo: " + processoAtual.getId() + " --- instrucoes restantes: " + processoAtual.getQuantidadeInstrucoes());
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            processoAtual = escalonador.obterProximoProcesso();
        }
    }
}