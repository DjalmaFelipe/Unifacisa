public class Usuario implements Observador {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println(nome + " recebeu uma notificação:");
        System.out.println("Temperatura: " + temperatura + "°C, Umidade: " + umidade + "%, Pressão: " + pressao + " hPa\n");
    }
}
