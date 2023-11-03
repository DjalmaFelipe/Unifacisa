public class AdaptadorXMLparaJSON implements ManipuladorArquivosInterface{
    private ManipuladorJSON manipuladorJSON;

    public AdaptadorXMLParaJSON(ManipuladorJSON manipuladorJSON) {
        this.manipuladorJSON = manipuladorJSON;
    }

    @Override
    public String lerArquivo(String nomeArquivo) {
        String conteudoXML = ""; // Chame a biblioteca antiga para ler o arquivo XML
        String conteudoJSON = converterXMLparaJSON(conteudoXML);
        return conteudoJSON;
    }

    @Override
    public void escreverArquivo(String nomeArquivo, String conteudo) {
        String conteudoXML = converterJSONparaXML(conteudo);
    }

    private String converterXMLparaJSON(String conteudoXML) {
        return ""; // Retorna o conteúdo do arquivo JSON
    }

    private String converterJSONparaXML(String conteudoJSON) {
        return ""; // Retorna o conteúdo do arquivo XML
    }

}
