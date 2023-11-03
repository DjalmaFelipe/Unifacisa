class AdaptadorTomada implements TomadaDoisPinos {
    private TomadaTresPinos tomadaTresPinos;

    public AdaptadorTomada(TomadaTresPinos tomadaTresPinos) {
        this.tomadaTresPinos = tomadaTresPinos;
    }

    @Override
    public void ligar() {
        tomadaTresPinos.conectar();
    }

    @Override
    public void desligar() {
        tomadaTresPinos.desconectar();
    }
}