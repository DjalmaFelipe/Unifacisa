import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Comparator;

public class Escalonador {
    public enum Algoritmo { FCFS, SJF, ROUND_ROBIN, PRIORIDADE }

    private Queue<Processo> filaFcfs;
    private Queue<Processo> filaSjf;
    private Queue<Processo> filaRoundRobin;
    private PriorityQueue<Processo> filaPrioridade;
    private Algoritmo algoritmoAtual;
    private int quantum;
    private int contadorQuantum;
    private GeradorDeProcessos gerador;
    private Random random;

    public Escalonador(Algoritmo algoritmo, int quantum) {
        this.algoritmoAtual = algoritmo;
        this.quantum = quantum;
        this.contadorQuantum = 0;
        this.filaFcfs = new LinkedList<>();
        this.filaSjf = new PriorityQueue<>(Comparator.comparingInt(Processo::getQuantidadeInstrucoes));
        this.filaRoundRobin = new LinkedList<>();
        this.filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(Processo::getQuantidadeInstrucoes));
        this.gerador = new GeradorDeProcessos();
        this.random = new Random();
    }

    public void adicionarProcesso(Processo processo) {
        switch (algoritmoAtual) {
            case FCFS:
                filaFcfs.offer(processo);
                break;
            case SJF:
                filaSjf.offer(processo);
                break;
            case ROUND_ROBIN:
                filaRoundRobin.offer(processo);
                break;
            case PRIORIDADE:
                filaPrioridade.offer(processo);
                break;
        }
    }

    public Processo obterProximoProcesso() {
        if (random.nextDouble() < 0.1) {
            adicionarProcesso(gerador.gerarNovoProcesso());
        }

        switch (algoritmoAtual) {
            case FCFS:
                return filaFcfs.poll();
            case SJF:
                return filaSjf.poll();
            case ROUND_ROBIN:
                return obterProximoRoundRobin();
            case PRIORIDADE:
                return filaPrioridade.poll();
            default:
                return null;
        }
    }

    private Processo obterProximoRoundRobin() {
        if (contadorQuantum == 0 || filaRoundRobin.isEmpty()) {
            contadorQuantum = quantum;
        }

        Processo processo = filaRoundRobin.poll();

        if (processo != null) {
            contadorQuantum--;
            if (contadorQuantum == 0 && !processo.isFinalizado()) {
                filaRoundRobin.offer(processo);
            }
        }

        return processo;
    }
}