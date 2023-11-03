public class Arquivo extends ArquivoBase{

    public Arquivo(String nome, double tamanho) {
        super(nome, tamanho);
    }

    @Override
    public double getTamanho() {
        return tamanho;
    }
}
