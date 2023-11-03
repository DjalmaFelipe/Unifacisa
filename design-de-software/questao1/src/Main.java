public class Main {
    public static void main(String[] args) {
        ManipuladorArquivosInterface manipulador = new ManipuladorXML(); // Usa a biblioteca antiga
        String conteudo = manipulador.lerArquivo("arquivo.xml");
        ManipuladorJSON manipuladorJSON = new ManipuladorJSON(); // Usa a nova biblioteca JSON
        ManipuladorArquivosInterface adaptador = new AdaptadorXMLParaJSON(manipuladorJSON);
        conteudo = adaptador.lerArquivo("arquivo.xml");
    }
}
