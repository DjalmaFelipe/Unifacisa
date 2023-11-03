public class Main {
    public static void main(String[] args) {
        Arquivo teste1 = new Arquivo("teste1.png", 100);
        Arquivo teste2 = new Arquivo("teste2.png", 200);
        Arquivo teste3 = new Arquivo("teste3.png", 300);

        Pasta novaPasta = new Pasta("nome", 0);
        novaPasta.adicionar(teste1);
        novaPasta.adicionar(teste2);
        novaPasta.adicionar(teste3);

        System.out.println(novaPasta.calcularTamanho());

        novaPasta.remover(teste2);

        System.out.println(novaPasta.calcularTamanho());
    }
}
