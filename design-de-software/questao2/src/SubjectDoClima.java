import java.util.ArrayList;
import java.util.List;

public class SubjectDoClima {
    private double temperatura;
    private double umidade;
    private double pressao;

    private List<Observador> observadores = new ArrayList<>();

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void atualizarMedicoes(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(temperatura, umidade, pressao);
        }
    }

}
