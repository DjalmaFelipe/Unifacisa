public class Main {
    public static void main(String[] args) {
        SubjectDoClima sujeito = new SubjectDoClima();

        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");

        sujeito.registrarObservador(usuario1);
        sujeito.registrarObservador(usuario2);

        sujeito.atualizarMedicoes(25.0, 70.0, 1013.25);

        sujeito.removerObservador(usuario1);

        sujeito.atualizarMedicoes(24.5, 68.0, 1012.75);
    }
}
