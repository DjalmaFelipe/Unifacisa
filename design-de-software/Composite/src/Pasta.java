import java.util.ArrayList;
import java.util.List;

public class Pasta extends ArquivoBase{

    private List<ArquivoBase> arquivos = new ArrayList<>();

    public Pasta(String nome, double tamanho) {
        super(nome, tamanho);
    }

    public void adicionar(ArquivoBase arquivo) {
        arquivos.add(arquivo);
    }

    public void remover(ArquivoBase arquivo) {
        arquivos.remove(arquivo);
    }

    @Override
    public double getTamanho() {
        return this.tamanho;
    }

    public double calcularTamanho() {
        double tamanhoTotal = 0;
        for (ArquivoBase arquivo: arquivos) {
            tamanhoTotal += arquivo.getTamanho();
        }
        return tamanhoTotal;
    }
}
