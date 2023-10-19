class TomadaDoisPinosImpl implements TomadaDoisPinos {
    @Override
    public void ligar() {
        System.out.println("Tomada de 2 pinos ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Tomada de 2 pinos desligada");
    }
}