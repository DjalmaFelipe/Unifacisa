class TomadaTresPinosImpl implements TomadaTresPinos {
    @Override
    public void conectar() {
        System.out.println("Tomada de 3 pinos conectada");
    }

    @Override
    public void desconectar() {
        System.out.println("Tomada de 3 pinos desconectada");
    }
}
