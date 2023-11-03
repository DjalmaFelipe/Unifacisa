public class Virus extends ArquivoBase{
    public Virus(String nome, int tamanho) {
        super(nome, tamanho);
    }

    @Override
    public double getTamanho() {
        return tamanho;
    }

}
