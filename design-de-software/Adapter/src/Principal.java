public class Principal {
    public static void main(String[] args) {
        TomadaDoisPinos tomada2Pinos = new TomadaDoisPinosImpl();
        TomadaTresPinos tomada3Pinos = new TomadaTresPinosImpl();

        // Usando a tomada de 2 pinos
        tomada2Pinos.ligar();
        tomada2Pinos.desligar();

        // Usando o adaptador para conectar o aparelho de 3 pinos na tomada de 2 pinos
        TomadaDoisPinos adaptador = new AdaptadorTomada(tomada3Pinos);
        adaptador.ligar();
        adaptador.desligar();
    }
}