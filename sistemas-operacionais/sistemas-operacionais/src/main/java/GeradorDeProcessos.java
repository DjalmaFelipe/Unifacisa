import java.util.Random;

public class GeradorDeProcessos {
    private int proximoId;
    private Random random;

    public GeradorDeProcessos() {
        this.proximoId = 1;
        this.random = new Random();
    }

    public Processo gerarNovoProcesso() {
        int quantidadeInstrucoes = 10 + random.nextInt(41);
        Processo novoProcesso = new Processo(proximoId, quantidadeInstrucoes);
        proximoId++;
        return novoProcesso;
    }
}