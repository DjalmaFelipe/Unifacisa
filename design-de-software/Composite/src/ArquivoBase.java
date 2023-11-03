public abstract class ArquivoBase {
    String nome;
    double tamanho;

    public ArquivoBase(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public abstract double getTamanho();
}
