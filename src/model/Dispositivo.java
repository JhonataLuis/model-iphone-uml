package model;

public abstract class Dispositivo {
    private String modelo;
    private int armazenamento;

    public Dispositivo(String modelo, int armazenamento){
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public abstract void ligar();
    public abstract void desligar();

    
}
